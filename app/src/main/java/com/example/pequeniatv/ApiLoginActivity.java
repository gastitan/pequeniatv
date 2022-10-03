package com.example.pequeniatv;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pequeniatv.client.ChannelsServiceClient;
import com.example.pequeniatv.model.AuthRequest;
import com.example.pequeniatv.model.AuthResponse;
import com.example.pequeniatv.session.SessionManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ApiLoginActivity extends AppCompatActivity {

    SessionManager sessionManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sessionManager = new SessionManager(this);
        ChannelsServiceClient client = new ChannelsServiceClient();

        Call<AuthResponse> call = client.getChannelsService(this)
                .getLogin(new AuthRequest("gaston.frias@uset.com", "brianna123"));

        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(@NonNull Call<AuthResponse> call, @NonNull Response<AuthResponse> response) {
                if (response.isSuccessful()) {
                    AuthResponse authResponse = response.body();
                    if (authResponse == null || authResponse.getAccessToken() == null) {
                        showErrorDialog();
                        return;
                    }
                    sessionManager.setToken(authResponse.getAccessToken());
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                } else {
                    showErrorDialog();
                }
            }

            @Override
            public void onFailure(@NonNull Call<AuthResponse> call, @NonNull Throwable t) {
                Log.e("API Call", "Error", t);
                showErrorDialog();
            }
        });
    }

    private void showErrorDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setMessage("Authentication token could not be acquired");
        alert.setNegativeButton("Cancel", null);
        alert.show();
    }
}

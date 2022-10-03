package com.example.pequeniatv.session;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.pequeniatv.R;

public class SessionManager {

    public static final String USER_TOKEN = "user_token";
    private final SharedPreferences prefs;

    public SessionManager(Context context) {
        prefs = context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE);
    }

    public void setToken(final String token) {
        var editor = prefs.edit();
        editor.putString(USER_TOKEN, token);
        editor.apply();
    }

    public String getToken() {
        return prefs.getString(USER_TOKEN, null);
    }

}

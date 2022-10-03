package com.example.pequeniatv.model;

public class AuthRequest {

    private String email;
    private String password;

    public AuthRequest(final String mail, final String password) {
        this.email = mail;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

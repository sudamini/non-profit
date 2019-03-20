package com.sportscontender.loginservice;

public class LoginServiceBean {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoginServiceBean(String message ) {
        this.message = message;
    }


}

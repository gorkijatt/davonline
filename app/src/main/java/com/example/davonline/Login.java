package com.example.davonline;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "requestresponse")

public class Login {
    @Element(name = "status")
    private String status;

    @Element(name = "message")
    private String message;

    @Element(name = "logoutmessage")
    private String logoutmessage;

    @Element(name = "state")
    private String state;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLogoutmessage() {
        return logoutmessage;
    }

    public void setLogoutmessage(String logoutmessage) {
        this.logoutmessage = logoutmessage;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
package com.boosting.code.object_store.dto;

public class ServiceInfo {
    private boolean isSuccessful;
    private String message;


    public ServiceInfo(boolean isSuccessful, String message) {
        this.message = message;
        this.isSuccessful =isSuccessful;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

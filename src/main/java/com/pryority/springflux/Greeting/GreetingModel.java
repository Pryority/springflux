package com.pryority.springflux.Greeting;

public class GreetingModel {

    private String message;

    public GreetingModel() {
    }

    public GreetingModel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "message='" + message + '\'' +
                '}';
    }
}

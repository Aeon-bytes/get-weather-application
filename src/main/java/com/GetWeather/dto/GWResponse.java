package com.GetWeather.dto;

public class GWResponse {
    private String result;

    public GWResponse(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }
}

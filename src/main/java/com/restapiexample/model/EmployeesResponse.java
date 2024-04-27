package com.restapiexample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EmployeesResponse {
    @JsonProperty("status")
    private String status;
    @JsonProperty("data")
    private List<DataResponse> data;
    @JsonProperty("message")
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<DataResponse> getData() {
        return data;
    }

    public void setData(List<DataResponse> data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}



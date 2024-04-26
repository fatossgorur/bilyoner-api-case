package com.restapiexample.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class EmployeesResponse {
    @JsonProperty("status")
    private String Status;
    @JsonProperty("data")
    private List<DataResponse> Data;
    @JsonProperty("message")
    private String Message;

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public List<DataResponse> getData() {
        return Data;
    }

    public void setData(List<DataResponse> data) {
        Data = data;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}



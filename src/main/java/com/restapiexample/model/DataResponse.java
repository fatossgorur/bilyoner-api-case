package com.restapiexample.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataResponse {
    @JsonProperty("id")
    private Integer Id;
    @JsonProperty("employee_name")
    private String Employee_name;

    @JsonProperty("employee_salary")
    private Integer Employee_salary;

    @JsonProperty("employee_age")
    private Integer Employee_age;
    @JsonProperty("profile_image")
    private String Profile_image;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String employee_name) {
        Employee_name = employee_name;
    }

    public Integer getEmployee_salary() {
        return Employee_salary;
    }

    public void setEmployee_salary(Integer employee_salary) {
        Employee_salary = employee_salary;
    }

    public Integer getEmployee_age() {
        return Employee_age;
    }

    public void setEmployee_age(Integer employee_age) {
        Employee_age = employee_age;
    }

    public String getProfile_image() {
        return Profile_image;
    }

    public void setProfile_image(String profile_image) {
        Profile_image = profile_image;
    }

}
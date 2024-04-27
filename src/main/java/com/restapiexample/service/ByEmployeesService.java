package com.restapiexample.service;

import com.restapiexample.helper.ConfigHelper;
import com.restapiexample.spec.RequestSpec;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import java.util.Properties;
import java.util.ResourceBundle;

public class ByEmployeesService extends RequestSpec {
    public static Properties props = ConfigHelper.readProp("src/test/resources/api-config.properties");
    public static String employeeApiUrl = props.getProperty("employee-api");

    public ByEmployeesService() {
        super(employeeApiUrl);
    }

    public Response get(ResponseSpecification responseSpecification) {
        return RestAssured.given()
                .spec(super.getRequestSpecification())
                .get()
                .then()
                .spec(responseSpecification)
                .extract()
                .response();
    }
}

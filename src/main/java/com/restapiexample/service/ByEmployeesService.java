package com.restapiexample.service;

import com.restapiexample.helper.ConfigHelper;
import com.restapiexample.spec.RequestSpec;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;

import java.util.ResourceBundle;

public class ByEmployeesService extends RequestSpec {
    public static ResourceBundle ConfigurationPropApi = ConfigHelper.readProp("api-config.properties");

    public ByEmployeesService() {
        super(ConfigurationPropApi.getString("apiUrl"));
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

package com.restapiexample;

import com.restapiexample.model.DataResponse;
import com.restapiexample.model.EmployeesResponse;
import com.restapiexample.service.ByEmployeesService;
import com.restapiexample.spec.ResponseSpec;
import io.restassured.response.Response;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeesTest {
    @Test
    @Description("Control employee count")
    public void check_employee_count() {
        ByEmployeesService byEmployeesService = new ByEmployeesService();
        Response byEmployee = byEmployeesService.get(ResponseSpec.checkStatusCodeOk());
        EmployeesResponse employeesResponse = byEmployee.as(EmployeesResponse.class);
        Assert.assertEquals(employeesResponse.getData().size(), 24);
    }

    @Test
    @Description("Control employee name and salary")
    public void check_employee_name_and_salary() {
        ByEmployeesService byEmployeesService = new ByEmployeesService();
        Response byEmployee = byEmployeesService.get(ResponseSpec.checkStatusCodeOk());
        EmployeesResponse employeesResponse = byEmployee.as(EmployeesResponse.class);
        for (DataResponse data : employeesResponse.getData()) {
            if (data.getEmployee_salary() == 313500) {
                Assert.assertEquals(data.getEmployee_name(), "Haley Kennedy");
            }
        }
    }
}

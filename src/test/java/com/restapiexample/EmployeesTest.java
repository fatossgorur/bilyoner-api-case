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
    @Description("Control employee count, name and salary")
    public void check_employee_count_name_and_salary() {
        int employeeCount = 24;
        int employeeSalary = 313500;
        String employeeName = "Haley Kennedy";
        ByEmployeesService byEmployeesService = new ByEmployeesService();
        Response byEmployee = byEmployeesService.get(ResponseSpec.checkStatusCodeOk());
        EmployeesResponse employeesResponse = byEmployee.as(EmployeesResponse.class);
        Assert.assertEquals(employeesResponse.getData().size(), employeeCount);
        for (DataResponse data : employeesResponse.getData()) {
            if (data.getEmployee_salary() == employeeSalary) {
                Assert.assertEquals(data.getEmployee_name(), employeeName);
            }
        }
    }
}

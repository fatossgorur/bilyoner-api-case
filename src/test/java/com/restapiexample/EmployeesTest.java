package com.restapiexample;

import com.restapiexample.model.DataResponse;
import com.restapiexample.model.EmployeesResponse;
import com.restapiexample.service.ByEmployeesService;
import com.restapiexample.spec.ResponseSpec;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.restassured.response.Response;
import jdk.jfr.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("All tests for employee data")
@Feature("Get all employee data")
public class EmployeesTest {
    @Test
    @Story("Control employee count name and salary")
    @Description("Control employee count name and salary")
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

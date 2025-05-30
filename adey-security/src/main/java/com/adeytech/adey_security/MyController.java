package com.adeytech.adey_security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/getWorkerData/{workerId}")
    public Employee getWorkerData(@PathVariable String workerId) {

        return employeeService.getEmployeeById(workerId);
    }

    @PostMapping("/saveWorkerData")
    public Employee saveWorkerData(@RequestBody Employee model) {
        employeeService.updateEmployee(model);

        return employeeService.getEmployeeById(model.getId());
    }

    @PostMapping("/insertWorkerData")
    public Employee insertWorkerData(@RequestBody Employee model) {
        employeeService.saveEmployee(model);

        return model;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getData")
    public List<Employee> getData(){
            return employeeService.getAllData();

    }
}

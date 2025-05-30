package com.adeytech.adey_security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private EmployeeRepository employeeRepository;

    private RowMapper<Employee> rowMapper = (rs, rowNum) -> new Employee(
            rs.getString("id"),
            rs.getString("firstName"),
            rs.getString("lastName"),
            rs.getInt("age"),
            rs.getString("department"),
            rs.getBoolean("completeIndicator")
    );

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).get();
    }

    public void updateEmployee(Employee model){
        this.jdbcTemplate.update("UPDATE employee SET is_process_complete=? where id=?", model.getIsProcessComplete(), model.getId());
    }

    public void saveEmployee(Employee model){
        this.employeeRepository.save(model);
    }

    public List<Employee> getAllData(){
            return this.findAll();
    }
}

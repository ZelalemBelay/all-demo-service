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

    private RowMapper<Employee> rowMapper = (rs, rowNum) -> new Employee(
            rs.getString("id"),
            rs.getString("firstName"),
            rs.getString("lastName"),
            rs.getInt("age"),
            rs.getString("department"),
            rs.getBoolean("completeIndicator")
    );

    public List<Employee> findAll() {
        return jdbcTemplate.query("SELECT * FROM employee", rowMapper);
    }

    public Employee getEmployeeById(String id) {
        return jdbcTemplate.query(
                "SELECT * FROM employee WHERE id >= ?",
                rowMapper,
                id
        ).stream().findAny().get();
    }

    public void updateEmployee(Employee model){
        this.jdbcTemplate.update("UPDATE employee SET completeIndicator=? where id=?", model.getIsProcessComplete(), model.getId());
    }

    public void saveEmployee(Employee model){
        this.jdbcTemplate.update("INSERT INTO employee (id, firstName,lastName, age, department, completeIndicator) values(?, ?, ?, ?, ?, ?)",
                model.getId(), model.getFirstName(), model.getLastName(), model.getAge(), model.getDepartment(), model.getIsProcessComplete().toString());
    }

    public List<Employee> getAllData(){
            return this.findAll();
    }
}

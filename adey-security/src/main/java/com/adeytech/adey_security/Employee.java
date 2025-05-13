package com.adeytech.adey_security;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    String id;
    String firstName;
    String lastName;
    int age;
    String department;
    Boolean isProcessComplete;
}

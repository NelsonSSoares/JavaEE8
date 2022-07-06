/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedantic.config;

import com.pedantic.entities.Employee;
import java.time.LocalDate;
import java.time.Period;
import javax.persistence.PrePersist;

/**
 *
 * @author 015081631
 */
public class EmployeeListener {
    
    @PrePersist
    public void calculateEmployeeAge(Employee employee){
        employee.setAge( Period.between(employee.getDateOfBirth(), LocalDate.now()).getYears());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedantic.entities;

import java.time.LocalDate;
import java.util.Collection;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author 015081631
 */
public class Project extends AbstractEntity{
    
    private String projectName;
    private LocalDate projectStartDate;
    private LocalDate projectEndDate;
    
    @ManyToMany
    @JoinTable(name = "PROJ_EMPLOYEES", joinColumns = @JoinColumn(name = "PROJ_ID"), inverseJoinColumns = @JoinColumn(name = "EMP_ID"))
    private Collection<Employee> employees;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public LocalDate getProjectStartDate() {
        return projectStartDate;
    }

    public void setProjectStartDate(LocalDate projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    public LocalDate getProjectEndDate() {
        return projectEndDate;
    }

    public void setProjectEndDate(LocalDate projectEndDate) {
        this.projectEndDate = projectEndDate;
    }

    public Collection<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Collection<Employee> employees) {
        this.employees = employees;
    }
    
    
} 

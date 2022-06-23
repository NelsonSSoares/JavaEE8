package com.pedantic.entities;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@NamedQuery(name = Department.FIND_BY_ID, query = "select d from Department d where d.id = :id and d.userEmail = :email")
@NamedQuery(name = Department.FIND_BY_NAME, query = "select d from Department d where d.departmentName = :name and d.userEmail = :email")
@NamedQuery(name = Department.LIST_DEPARTMENTS, query = "select d from Department d where  d.userEmail = :email")
@Access(AccessType.FIELD)
public class Department extends AbstractEntity {

    public static final String FIND_BY_ID = "Department.findById";
    public static final String FIND_BY_NAME = "Department.findByName";
    public static final String LIST_DEPARTMENTS = "Department.listDepartments";


    @NotEmpty(message = "Department name must be set")

    private String departmentName;

  // @OneToMany(mappedBy = "department")
  //  @OrderBy("fullName ASC, dateOfBirth desc, address.country asc")
  //@OrderColumn(name = "EMPLOYEE_POSITION")
  //private List<Employee> employees = new ArrayList<>();
    
    @OneToMany
    @MapKey(name = "id")
    @JoinTable(name = "DEPT_EMPLOYEES")
    private Map<Long, Employee> employees = new HashMap<>();
    
    @ElementCollection
    @CollectionTable(name = "EMPLOYEE_RANKS")
    @MapKeyJoinColumn(name = "EMP_ID")
    @Column(name = "RANK")
    private Map<Employee, Integer> employeeRanks = new HashMap<>();
    
    @Transient
    private String departmentCode;


    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
/*
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
*/
}

package com.pedantic.entities;

import com.pedantic.config.AbstractEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.*;
import javax.validation.constraints.Pattern;

//SELECT <select_expression>
//        FROM <from_clause>
//        [WHERE <conditional_expression>]
//        [ORDER BY <order_by_clause>]
@Entity
@NamedQuery(name = Department.GET_DEPARTMENT_LIST, query = "select d from Department d")





@NamedQuery(name = Department.GET_DEPARTMENT_NAMES, query = "select d.departmentName from Department  d")
@NamedQuery(name = Department.FIND_BY_ID, query = "select d from Department d where d.id = :id and d.userEmail = :email")
@NamedQuery(name = Department.FIND_BY_NAME, query = "select d from Department d where d.departmentName = :name and d.userEmail = :email")
@NamedQuery(name = Department.LIST_DEPARTMENTS, query = "select d from Department d where  d.userEmail = :email")
@Access(AccessType.FIELD)


@EntityListeners({AbstractEntityListener.class})
public class Department extends AbstractEntity {

    public static final String FIND_BY_ID = "Department.findById";
    public static final String FIND_BY_NAME = "Department.findByName";
    public static final String LIST_DEPARTMENTS = "Department.listDepartments";
    public static final String GET_DEPARTMENT_LIST = "Department.getAllDepartments";
    public static final String GET_DEPARTMENT_NAMES = "Department.getDeptNames";





    @NotEmpty(message = "Department name must be set")
    @Pattern(regexp = "", message = "Department name must be in form dept abreviation, number and branch ex: FIN0011MAIN")
    private String departmentName;

//    @OneToMany(mappedBy = "department")
//    @OrderBy("fullName ASC, dateOfBirth desc ")
//    @OrderColumn(name = "EMPLOYEE_POSITION")
//    private List<Employee> employees = new ArrayList<>();

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

    public Map<Long, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<Long, Employee> employees) {
        this.employees = employees;
    }

    public Map<Employee, Integer> getEmployeeRanks() {
        return employeeRanks;
    }

    public void setEmployeeRanks(Map<Employee, Integer> employeeRanks) {
        this.employeeRanks = employeeRanks;
    }
    
    

    //    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.departmentName);
        return Objects.hash(getDepartmentName().toUpperCase());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Department other = (Department) obj;
        if (!Objects.equals(this.getDepartmentName().toUpperCase(), other.getDepartmentName().toUpperCase()))
        {
            return false;
        }
        return true;
    }
}

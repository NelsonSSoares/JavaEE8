package com.pedantic.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class ApplicationUser extends AbstractEntity{
   /*
    @SequenceGenerator(name = "User_seq", sequenceName = "User_sequence")
    @GeneratedValue(generator = "User_seq")
    @Id
    private Long id;
    */
    /*
        CREATE SEQUENCE Emp_Seq
        MINVALUE 1
        START WITH 1
        INCREMENT BY 50
    */
    
    
    private String email;




    private String password;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

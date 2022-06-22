/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedantic.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author 015081631
 */
@Entity
public class ParkingSpace extends AbstractEntity{
    
    private String parkingLotNumber;
    
    @OneToOne
    @JoinColumn(name = "EMPLOYEE_ID")
    private Employee employee;
    
}

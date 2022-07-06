/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedantic.config;

import academy.learnprogramming.entities.AbstractEntity;
import java.time.LocalDateTime;
import javax.persistence.PostRemove;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

/**
 *
 * @author 015081631
 */
public class AbstractEntityListener {
    
    public void setCreatedOn(AbstractEntity abstractEntity){
        abstractEntity.setCreatedOn(LocalDateTime.now());
    }
    
    @PreUpdate
    public void setUpdatedOn(AbstractEntity abstractEntity){
        abstractEntity.setUpdatedOn(LocalDateTime.now());
    }
    
    
    
    
}

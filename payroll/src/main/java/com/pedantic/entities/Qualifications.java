/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pedantic.entities;
import java.time.LocalDate;
import javax.persistence.Embeddable;
/**
 *
 * @author 015081631
 */
@Embeddable
public class Qualifications {
    private String school;
    private LocalDate dateCompleted;
    private String qualificationAwarded;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public LocalDate getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(LocalDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public String getQualificationAwarded() {
        return qualificationAwarded;
    }

    public void setQualificationAwarded(String qualificationAwarded) {
        this.qualificationAwarded = qualificationAwarded;
    }
}

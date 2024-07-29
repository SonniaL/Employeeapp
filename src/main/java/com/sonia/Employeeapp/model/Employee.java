/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sonia.employeeapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



/**
 *
 * @author SONNIA
 */

@Entity
@Table(name = "employee_table")
public class Employee {

    private String empId;
    private String employeeName;
    // private LocalDate dob;
    // private String address;
    // private String sex;
    // private String position;
    // private String department;

}

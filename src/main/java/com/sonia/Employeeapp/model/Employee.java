package com.sonia.employeeapp.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Employee entity class
 * @author SONNIA
 */

@Entity
@Table(name = "employee_table")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empId;
    private String employeeName;
    private String email;
    private LocalDate dob;
    private String address;
    private String sex;
    private String position;
    private String department;

   // Getters
   public Long getEmpId() {
        return empId;
   }

   public String getemployeeName() {
        return employeeName;
   }

   public String getemail() {
      return email;
   }

   public LocalDate getdob() {
    return dob;
}

   public String getaddress() {
    return address;
}

   public String getsex() {
    return sex;
}

   public String getposition() {
    return position;
}

   public String setdepartment() {
    return department;
}

// Setters
    public void setempId(Long empId) {
     this.empId =empId;
}
    public void setemployeeName(String employeeName) {
    this.employeeName =employeeName;
}
    public void setEmail(String emailString) {
        this.email =emailString;    
    }
    public void setDate(LocalDate dob){
        this.dob =dob;
    }
    public void setAddress(String address) {
        this.address =address;
        
    }
    public void setSex(String sex) {this.sex =sex;
        
    }
    public void setposition(String position) { 
        this.position = position;
    }
    public void setdepartment(String department) {
        this.department = department; 
    }

};



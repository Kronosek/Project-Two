package com.iTier.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Table;
import javax.persistence.Table;

@Entity
@Table(name = "reimbursement")
public class Reimbursement {
    
    // field represent the data in our table
    @Id
    @GeneratedValue
    private int id;
    private String employeeName;
    private int reimbursementRequest;
    private String reasonRequest;
    
    
    // empty constructor for hibernate
    public Reimbursement() {

    }


    // partial constructor to ensure we don't assign a bad id
    public Reimbursement(String employeeName, int reimbursementRequest, String reasonRequest) {
        this.employeeName = employeeName;
        this.reimbursementRequest = reimbursementRequest;
        this.reasonRequest = reasonRequest;
    }

    // This constructor will allow our code to fully create ManagerTable objects from pre-existing data in our table
    public Reimbursement(int id, String employeeName, int reimbursementRequest, String reasonRequest) {
        this.id = id;
        this.employeeName = employeeName;
        this.reimbursementRequest = reimbursementRequest;
        this.reasonRequest = reasonRequest;
    }

    //  getters & setters
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getEmployeeName() {
        return employeeName;
    }


    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }


    public int getReimbursementRequest() {
        return reimbursementRequest;
    }


    public void setReimbursementRequest(int reimbursementRequest) {
        this.reimbursementRequest = reimbursementRequest;
    }


    public String getRequestReason() {
        return reasonRequest;
    }


    public void setRequestReason(String reasonRequest) {
        this.reasonRequest = reasonRequest;
    }

    // this method is to help us better see what data we are working with our tables.
    //@Override
    // public String toString() {
    //     return "ReimbursementTable [employeeName=" + employeeName + ", id=" + id + ", reimbursementRequest="
    //             + reimbursementRequest + ", requestReason=" + reasonRequest + "]";
    // }
    
    //@Override
    public String toString(){ //transaction 
        return "ReimbursementTable{" +
            "id='" + id + '\'' +
            ", employeeName='" + employeeName + '\'' +
            ", reimbursementRequest='" + reimbursementRequest + '\'' + 
            ", reasonRequest='" + reasonRequest + '\'' + 
            "}";
    }
    
}

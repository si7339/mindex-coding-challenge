package com.mindex.challenge.data;

import java.util.Date;

public class Compensation {
    /*
     * Compensation needs employee, its desired salary and the date it is effective.
     */
    private Employee employee;
    private double salary;
    private Date effectiveDate;
    // Constructors
    public Compensation() {
    }

    public Compensation(Employee employee, double salary, Date effectiveDate) {
        this.employee = employee;
        this.salary = salary;
        this.effectiveDate = effectiveDate;
    }

    // Getters and setters
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    @Override
    public String toString() {
        return "{" + "employeeId" + employee.getEmployeeId() +
                ", salary:" + salary + ", effectiveDate:" + effectiveDate +
                "}";
    }
    
}


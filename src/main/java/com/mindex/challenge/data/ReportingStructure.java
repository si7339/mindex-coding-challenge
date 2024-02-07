package com.mindex.challenge.data;

import java.util.Objects;

public class ReportingStructure {
    private Employee employee;
    private int numberOfReports; 
    
    public ReportingStructure(Employee employee, int numberOfReports){
    this.employee = employee;
    this.numberOfReports = numberOfReports;  
    
    }

    /*
     * getters and setters
     */

    public Employee getEmployee(){
        return this.employee;
    }

    public void setEmployee(Employee employee){
        this.employee = employee;
    }

    public int getNumberOfReports(){
        return this.numberOfReports;
    }

    public void setNumberOfReports(int numberOfReports){
        this.numberOfReports = numberOfReports;
    }

    //override equals method to check if two object instances are equal
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ReportingStructure)) {
            return false;
        }
        ReportingStructure reportingStructure = (ReportingStructure) o;
        return Objects.equals(employee, reportingStructure.employee) 
            && numberOfReports == reportingStructure.numberOfReports;
    } 
}

package com.mindex.challenge.service.impl;

import com.mindex.challenge.dao.EmployeeRepository;
import com.mindex.challenge.data.Employee;
import com.mindex.challenge.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeServiceImpl.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {
        LOG.debug("Creating employee [{}]", employee);

        employee.setEmployeeId(UUID.randomUUID().toString());
        employeeRepository.insert(employee);

        return employee;
    }

    @Override
    public Employee read(String id) {
        LOG.debug("Creating employee with id [{}]", id);

        Employee employee = employeeRepository.findByEmployeeId(id);

        if (employee == null) {
            throw new RuntimeException("Invalid employeeId: " + id);
        }

        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        LOG.debug("Updating employee [{}]", employee);

        return employeeRepository.save(employee);
    }

    /*
     * Method to calculate the total number of reports
     * Uses recursion to keep track of the total count
     */
    @Override
    public int calculateNumberOfReports(String empID) {
        int reportCount = 0;

        Employee employee = this.read(empID);
        if (employee == null) {
            throw new RuntimeException("Invalid employeeId: " + empID);
        }

        List<Employee> directReports = employee.getDirectReports();
        if (directReports != null) {
            for (Employee report : directReports) {
                // Increment report count for the direct report
                reportCount++;
                // Recursively count the number of reports for each direct report
                reportCount += calculateNumberOfReports(report.getEmployeeId());
            }
        }

        return reportCount;
}

}

 
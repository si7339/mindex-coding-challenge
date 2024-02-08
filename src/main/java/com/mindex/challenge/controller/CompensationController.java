package com.mindex.challenge.controller;

import com.mindex.challenge.data.Compensation;
import com.mindex.challenge.service.CompensationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompensationController {

    /**
     * Main two endpoints for Task#2- handles the POST to create a compensation request and reading of compensation for specific 
     * employee ID's 
     */

    private static final Logger LOG = LoggerFactory.getLogger(CompensationController.class);

    @Autowired
    private CompensationService compensationService;

    @PostMapping("/compensation")
    public Compensation createCompensation(@RequestBody Compensation compensation) {
        LOG.debug("Received create compensation request for employeeId [{}]", compensation.getEmployee().getEmployeeId());
        return compensationService.create(compensation);
    }

    @GetMapping("/compensation/{id}")
    public Compensation readCompensation(@PathVariable String id) {
        LOG.debug("Received read compensation request for employeeId [{}]", id);
        return compensationService.read(id);
    }
}

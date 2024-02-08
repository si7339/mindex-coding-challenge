package com.mindex.challenge.service;
import com.mindex.challenge.data.Compensation;

/*
 * Interface methods for Compensation endpoints
 */

public interface CompensationService {
    Compensation create(Compensation compensation);
    Compensation read(String empID);
}

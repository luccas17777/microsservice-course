package com.ibm.hrpayrool.services;

import com.ibm.hrpayrool.entities.Payment;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component // serve para registrar a classe como component do spring, para que possa ser injetado em outras classes
@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days){
        return new Payment("Bob", 200.0, days);
    }
}

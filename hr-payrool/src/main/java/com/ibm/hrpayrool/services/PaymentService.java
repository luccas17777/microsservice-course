package com.ibm.hrpayrool.services;

import com.ibm.hrpayrool.entities.Payment;
import com.ibm.hrpayrool.entities.Worker;
import com.ibm.hrpayrool.feignclient.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

//@Component // serve para registrar a classe como component do spring, para que possa ser injetado em outras classes
@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;
    public Payment getPayment(long workerId, int days){
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}

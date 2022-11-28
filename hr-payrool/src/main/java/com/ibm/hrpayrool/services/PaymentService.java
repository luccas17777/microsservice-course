package com.ibm.hrpayrool.services;

import com.ibm.hrpayrool.entities.Payment;
import com.ibm.hrpayrool.entities.Worker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

//@Component // serve para registrar a classe como component do spring, para que possa ser injetado em outras classes
@Service
public class PaymentService {

    @Value("${hr-worker.host}")
    private String workerHost;

    @Autowired
    private RestTemplate restTemplate;
    public Payment getPayment(long workerId, int days){
        Map<String, String> uriVariable = new HashMap<>();
        uriVariable.put("id", ""+workerId);

        Worker worker = restTemplate.getForObject(workerHost + "/workes/{id}", Worker.class, uriVariable);

        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}

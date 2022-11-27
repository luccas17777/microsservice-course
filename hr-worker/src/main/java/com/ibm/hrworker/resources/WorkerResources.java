package com.ibm.hrworker.resources;

import com.ibm.hrworker.entities.Worker;
import com.ibm.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerResources {
    @Autowired
    private WorkerRepository rep;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        List<Worker> list = rep.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Long id){
        Worker worker = rep.findById(id).get();
        return ResponseEntity.ok(worker);
    }
}

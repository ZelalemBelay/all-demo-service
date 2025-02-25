package org.zeelo.mytrials.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.zeelo.mytrials.model.Worker;
import org.zeelo.mytrials.service.CosmosDBService;

@RestController("/Workers/")
public class AllController {
    @Autowired
    private CosmosDBService cosmosDbService;

    @GetMapping("/getWorkerData/{workerId}")
    public Worker saveWorkerData(@PathVariable  String workerId) {
        return cosmosDbService.getWorkerData(workerId);
    }

    @PostMapping("/saveWorkerData")
    public Worker saveWorkerData(@RequestBody Worker worker) {
        return cosmosDbService.saveWorkerData(worker);
    }
}

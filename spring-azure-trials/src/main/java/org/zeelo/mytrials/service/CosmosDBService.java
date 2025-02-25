package org.zeelo.mytrials.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zeelo.mytrials.model.Worker;
import org.zeelo.mytrials.repository.WorkerRepository;

@Service
public class CosmosDBService {

    @Autowired
    private WorkerRepository workerRepository;

    public Worker getWorkerData(String workerId) {
        return workerRepository.findById(workerId).block();
    }

    public Worker saveWorkerData(Worker worker) {
        return workerRepository.save(worker).block();
    }
}

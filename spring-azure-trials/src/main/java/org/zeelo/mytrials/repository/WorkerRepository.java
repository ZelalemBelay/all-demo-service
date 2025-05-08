package org.zeelo.mytrials.repository;

import com.azure.spring.data.cosmos.repository.ReactiveCosmosRepository;
import org.springframework.stereotype.Repository;
import org.zeelo.mytrials.model.Worker;

@Repository
public interface WorkerRepository extends ReactiveCosmosRepository<Worker, String> {
    //    Flux<Worker> findByName(String name);
}

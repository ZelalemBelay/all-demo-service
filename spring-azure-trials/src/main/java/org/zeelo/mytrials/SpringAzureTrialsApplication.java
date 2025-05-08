package org.zeelo.mytrials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@SpringBootApplication
public class SpringAzureTrialsApplication
{
    public static void main( String[] args ) {
        SpringApplication.run(SpringAzureTrialsApplication.class, args);
    }

//    @Autowired
//    private CosmosDBService cosmosDBService;

//    @Override
//    public void run(String... args) throws Exception {
//        Worker worker = new Worker("w002", "John", 25, "Male", "USA");
//        Worker worker2 = new Worker("w003", "Jane", 30, "Female", "UK");
//        Worker worker3 = new Worker("w004", "Jack", 35, "Male", "Australia");
//        Worker worker4 = new Worker("w005", "Jill", 40, "Female", "Canada");
//
//        cosmosDBService.saveWorkerData(worker);
//        cosmosDBService.saveWorkerData(worker2);
//        cosmosDBService.saveWorkerData(worker3);
//        cosmosDBService.saveWorkerData(worker4);
//
//        System.out.println("## Data: ##" + cosmosDBService.getWorkerData("w002").toString());
//    }
}

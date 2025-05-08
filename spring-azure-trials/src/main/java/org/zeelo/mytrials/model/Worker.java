package org.zeelo.mytrials.model;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@Container(containerName = "Workers")
public class Worker {

    @Id
    @PartitionKey
    private String workerId;

    private String name;
    private int age;
    private String gender;
    private String address;
}

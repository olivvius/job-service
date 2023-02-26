package com.jobservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
@Data
@AllArgsConstructor(staticName = "create")
@NoArgsConstructor
public class Job {

    @Id
    private String id;
    private String description;
    private String company;
    private Set<String> Skills;
    private Integer salary;
    private Boolean isRemote;
}

package com.jobservice.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
@Builder
public class Job {

    @Id
    private String id;
    private String description;
    private String company;
    private Set<String> skills;
    private Integer salary;
    private Boolean isRemote;
}

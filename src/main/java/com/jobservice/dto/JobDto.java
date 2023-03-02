package com.jobservice.dto;


import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
@Builder
public class JobDto {

    private String id;
    private String description;
    private String company;
    private Set<String> skills;
    private Integer salary;
    private Boolean isRemote;


}

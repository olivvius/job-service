package com.jobservice.service;

import com.jobservice.dto.JobDto;
import com.jobservice.repository.JobRepository;
import com.jobservice.util.EntityDtoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Set;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Flux<JobDto> allJobs(){
        return this.jobRepository.findAll().map(EntityDtoUtil::toDto);
    }

    public Flux<JobDto> JobsBySkillsIn(Set<String> skills){
        return this.jobRepository.findBySkillsIn(skills).map(EntityDtoUtil::toDto);
    }

    public Mono<JobDto> save(Mono<JobDto> mono){
        return mono.map(EntityDtoUtil::toJob).flatMap(this.jobRepository::save).map(EntityDtoUtil::toDto);
    }

}

package com.jobservice.repository;

import com.jobservice.entity.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.Set;

@Repository
public interface JobRepository extends CrudRepository<Job, String> {

    //Job findBySkillsIn(Set<String> skills);

}

package com.jobservice.service;

import com.jobservice.dto.JobDto;
import com.jobservice.entity.Job;
import com.jobservice.repository.JobRepository;
import com.jobservice.util.EntityDtoUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class JobServiceImpl implements JobServiceInterface{

    @Autowired
    private JobRepository jobRepository;

    private EntityDtoUtil entityDtoUtil;

    @Override
    public JobDto saveJob(JobDto jobDto) {

        Job job = entityDtoUtil.toJob(jobDto);
        job = jobRepository.save(job);
        JobDto dto = entityDtoUtil.toDto(job);
        return dto;
    }

    @Override
    public List<JobDto> getAllJobs() {

        List<Job> jobList = (List<Job>) jobRepository.findAll();
        List<JobDto> jobDtoList = new ArrayList<>();
        for(Job job:jobList){
            JobDto jobDto = entityDtoUtil.toDto(job);
            jobDtoList.add(jobDto);
        }
        return jobDtoList;
    }
}

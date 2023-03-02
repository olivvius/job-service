package com.jobservice.service;

import com.jobservice.dto.JobDto;

import java.util.List;

public interface JobServiceInterface {

    public JobDto saveJob(JobDto jobDto);

    List<JobDto> getAllJobs();

   // public JobDto getJob

}

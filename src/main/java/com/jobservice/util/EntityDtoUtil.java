package com.jobservice.util;


import com.fasterxml.jackson.databind.util.BeanUtil;
import com.jobservice.dto.JobDto;
import com.jobservice.entity.Job;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EntityDtoUtil {

    public JobDto toDto(Job job){
        JobDto jobDto = new JobDto();
        BeanUtils.copyProperties(job, jobDto);
        return jobDto;
    }

    public Job toJob(JobDto jobDto){
        Job job = new Job();
        BeanUtils.copyProperties(jobDto, job);
        return job;
    }

}

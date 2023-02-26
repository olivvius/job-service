package com.jobservice.util;


import com.fasterxml.jackson.databind.util.BeanUtil;
import com.jobservice.dto.JobDto;
import com.jobservice.entity.Job;
import org.springframework.beans.BeanUtils;

public class EntityDtoUtil {

    public static JobDto toDto(Job job){
        JobDto jobDto = new JobDto();
        BeanUtils.copyProperties(job, jobDto);
        return jobDto;
    }

    public static Job toJob(JobDto jobDto){
        Job job = new Job();
        BeanUtils.copyProperties(jobDto, job);
        return job;
    }

}

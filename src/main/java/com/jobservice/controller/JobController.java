package com.jobservice.controller;

import com.jobservice.dto.JobDto;
import com.jobservice.service.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("job")
public class JobController {

    @Autowired
    private JobServiceImpl jobService;

    @GetMapping("/all")
    public ResponseEntity<List<JobDto>> all(){
        List<JobDto> jobDtoList = jobService.getAllJobs();
        ResponseEntity<List<JobDto>> responseEntity = new ResponseEntity<>(jobDtoList, HttpStatus.OK);
        return responseEntity;
    }
/*
    @GetMapping("search")
    public Flux<JobDto> search(@RequestParam Set<String> skills){
        return this.jobService.JobsBySkillsIn(skills);
    }
*/

    @PostMapping
    public ResponseEntity<JobDto> save(@RequestBody JobDto jobDto){
        JobDto dto = jobService.saveJob(jobDto);
        ResponseEntity<JobDto> responseEntity = new ResponseEntity<>(dto, HttpStatus.CREATED);
        return responseEntity;
    }

}

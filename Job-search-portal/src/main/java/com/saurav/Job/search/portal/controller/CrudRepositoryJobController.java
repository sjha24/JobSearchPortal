package com.saurav.Job.search.portal.controller;

import com.saurav.Job.search.portal.model.Job;
import com.saurav.Job.search.portal.service.CrudRepositoryJobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping(value = "CRJ")
@RestController
public class CrudRepositoryJobController {
    @Autowired
    CrudRepositoryJobService crudRepositoryJobService;

    @PostMapping(value = "jobs")
    public String addJobs( @Valid @RequestBody List<Job> jobList){
        return crudRepositoryJobService.addJobs(jobList);
    }

    @GetMapping(value = "jobs")
    public Iterable<Job> getAllJobs(){
        return crudRepositoryJobService.getAllJobs();
    }

    @DeleteMapping(value = "jobs/{jobId}")
    public String deleteById(@PathVariable Long jobId){
        return crudRepositoryJobService.deleteById(jobId);
    }

    @PutMapping(value = "jobs/{jobId}")
    public String updateById(@Valid @RequestBody Job job , @PathVariable Long jobId){
        return crudRepositoryJobService.updateById(job , jobId);
    }
}


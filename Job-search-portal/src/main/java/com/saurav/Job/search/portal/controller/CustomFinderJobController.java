package com.saurav.Job.search.portal.controller;
import com.saurav.Job.search.portal.model.Job;
import com.saurav.Job.search.portal.model.JobType;
import com.saurav.Job.search.portal.service.CustomFinderJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "CFJ")
public class CustomFinderJobController {
    @Autowired
    CustomFinderJobService customFinderJobService;

    @GetMapping(value = "jobs/salary")
    public List<Job> getByJobSalary(@RequestParam Double salary){
        return customFinderJobService.getByJobSalary(salary);
    }

    @GetMapping(value = "jobs/jobType/location")
    public List<Job> getByJobTypeAndLocation(@RequestParam JobType jobType , @RequestParam String location){
        return customFinderJobService.getByJobTypeAndLocation(jobType , location);
    }

    @GetMapping(value = "jobs/description/location")
    public List<Job> getByDescriptionOrLocation(@RequestParam String description , @RequestParam String location){
        return customFinderJobService.getByDescriptionOrLocation(description , location);
    }
}

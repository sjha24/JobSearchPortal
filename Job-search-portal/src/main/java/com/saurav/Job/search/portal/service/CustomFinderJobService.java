package com.saurav.Job.search.portal.service;

import com.saurav.Job.search.portal.model.Job;
import com.saurav.Job.search.portal.model.JobType;
import com.saurav.Job.search.portal.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomFinderJobService {

    @Autowired
    IJobRepo iJobRepo;

    public List<Job> getByJobSalary(Double salary) {
        return iJobRepo.findBySalary(salary);
    }

    public List<Job> getByJobTypeAndLocation(JobType jobType, String location) {
        return iJobRepo.findByJobTypeAndLocation(jobType,location);
    }

    public List<Job> getBySalary(String salary) {
        Double job_salary = Double.parseDouble(salary);

        return iJobRepo.findBySalaryGreaterThan(job_salary);
    }

    public List<Job> getByDescriptionOrLocation(String description, String location) {
        return iJobRepo.findByDescriptionOrLocation(description , location);
    }

}

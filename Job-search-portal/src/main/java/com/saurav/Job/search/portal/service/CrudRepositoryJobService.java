package com.saurav.Job.search.portal.service;

import com.saurav.Job.search.portal.model.Job;
import com.saurav.Job.search.portal.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudRepositoryJobService {
    @Autowired
    IJobRepo iJobRepo;

    public String addJobs(List<Job> jobList) {
        if(jobList != null){
            iJobRepo.saveAll(jobList);
            return "Job saved";
        }
        return "Error !!!";
    }

    public Iterable<Job> getAllJobs() {
        return iJobRepo.findAll();
    }

    public String deleteById(Long jobId) {
        if(iJobRepo.existsById(jobId)){
            iJobRepo.deleteById(jobId);
            return "Deleted of this jobId "+ jobId;
        }
        return "this jobId"+ jobId+" is does not exist in our database";
    }

    public String updateById(Job job, Long jobId) {
        if(iJobRepo.existsById(jobId)){
            job.setId(job.getId());
            job.setTitle(job.getTitle());
            job.setDescription(job.getDescription());
            job.setLocation(job.getLocation());
            job.setSalary(job.getSalary());
            job.setCompanyEmail(job.getCompanyEmail());
            job.setCompanyName(job.getCompanyName());
            job.setJobType(job.getJobType());
            job.setAppliedDate(job.getAppliedDate());
            return "Updated successfully";
        }
        return "This id is not exist in our database";
    }
}

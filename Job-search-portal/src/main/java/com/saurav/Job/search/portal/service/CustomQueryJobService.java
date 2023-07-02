package com.saurav.Job.search.portal.service;
import com.saurav.Job.search.portal.model.Job;
import com.saurav.Job.search.portal.repository.IJobRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomQueryJobService {
    @Autowired
    IJobRepo jobsRepo;

    @Transactional
    public String deleteByCompanyName(String companyName) {
        List<Job> list = jobsRepo.findByCompanyName(companyName);

        if (list != null) {
            jobsRepo.deleteByCompanyName(companyName);
            return "Job with job_Id " + companyName + " deleted successfully";
        } else {
            return "Job with job_Id " + companyName + " not found";
        }
    }

    @Transactional
    public String updateSalaryBasedOnId(Long jobId, Double jobSalary) {
        Optional<Job> list = jobsRepo.findById(jobId);

        if (!(list.isEmpty())) {
            jobsRepo.updateSalaryBasedOnId(jobId, jobSalary);
            return "Job with this jobId " + jobId + " updated successfully";
        } else {
            return "Job with this jobId " + jobId + " not found";
        }

    }

}

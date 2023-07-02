package com.saurav.Job.search.portal.controller;
import com.saurav.Job.search.portal.service.CustomQueryJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("CQJ")
public class CustomQueryJobController {
    @Autowired
    CustomQueryJobService customQueryJobService;

    @DeleteMapping(value = "jobs/{companyName}")
    public String deleteByCompanyName(@PathVariable String companyName){
        return customQueryJobService.deleteByCompanyName(companyName);
    }

    @PutMapping(value = "jobs/{id}/{salary}")
    public String updateSalaryById(@PathVariable Long id , @PathVariable Double salary){
        return customQueryJobService.updateSalaryBasedOnId(id , salary);
    }

}

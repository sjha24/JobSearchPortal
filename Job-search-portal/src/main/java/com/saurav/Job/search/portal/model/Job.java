package com.saurav.Job.search.portal.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private String location;
    @Column(nullable = false)
    private Double salary;
    private String companyEmail;
    @NotEmpty
    @Column(unique = true)
    private String companyName;
    @NotEmpty
    @Column(nullable = false)
    private String employerName;
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    private LocalDate appliedDate;
}

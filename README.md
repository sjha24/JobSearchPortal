# Job Search Portal
[![Java](https://img.shields.io/badge/Java>=8.0-blue.svg)](https://docs.spring.io/spring-boot/docs/0.5.0.M6/api/org/springframework/boot/SpringApplication.html)
[![maven](https://img.shields.io/badge/maven->=3.0.5-green.svg)](https://www.npmjs.com/package/npm/v/5.5.0)
[![springBoot](https://img.shields.io/badge/SpringBoot->=3.0.6-blue.svg)](https://nodejs.org/en/blog/release/v9.3.0)
>This project is a job search portal that allows CRUD operations on a Job entity with added validation on the entity class. The project is built using Spring Boot and H2 Database.

[Homepage]();

## Framework used
 * Spring Boot
## Languaged Uesd
 * Java
## Data Model
>The Job data model is defined in the Job class, which has the following attributes:
```
id (Long): unique identifier for the job
title (String): title of the job
description (String): description of the job
location (String): location of the job
salary (Double): salary offered by the job
companyName (String): name of the company offering the job
employerName (String): name of the employer who posted the job
jobType (Some-Enum): type of job offered (IT, HR, Sales, Marketing, etc.)
appliedDate (LocalDate): optional date when the job was applied for
```
## Data Flow
```
1. User send as a request to the application throgh the endpoints
2. the api recived request and sends it to the appropriate controll method
3. the controller method makes a call to the method in service class.
4. he controller method returns a response to the API
5. The API sends the response back to the user
```
## Validation
```
To validate the input we get from client, we've used validation annotations that are used to enforce specific constraints on the values of the variables. These constraints ensure that the data input by the user is of the correct format and meets certain criteria.
* @Valid - In Spring Framework, the @Valid annotation is used in conjunction with @PostMapping and @PutMapping annotations, which are used to handle POST and PUT requests, respectively. When used with @PostMapping or @PutMapping, the @Valid annotation is typically applied to a method parameter annotated with @RequestBody.
* @NotEmpty: This annotation is used to validate that the annotated field is not null or empty.
* @NotNull: This annotation is used to validate that the annotated field is not null.
```
## Inbuilt CrudRepo methods
* We're extending CRUDRepository into repository interface
* PostMaping/jobs
```
This endpoint makes a call to method in jobService class where we implement method "saveAll()" in CRUD Repository.
```
* GetMaping/jobs
```
This endpoint makes a call to method in jobService class which retrieves data of all jobs from database by implementing method "findAll()" present in CRUD repository. This data is sent to controller which is then sent through the API to client.
```
* DeleteMaping/jobs/{jobsId}
```
This endpoint makes a call to method in jobService class which is connected to database. In database we delete a user by jobId given through API.
```
*PutMapping/jobs/{jobId}
```
This endpoint makes a call to method in jobService class which is connected to database. In database we update a job by jobId given through API.
```
## Custom get methods using custom finders
* Custom finder methods are defined in a library to get the data so we don't have to write sql queries to get the data.
* GetMaping/jobs/salary
```
The user is requesting data to be filtered by Salary. We have used custom method findBySalary to get the data from database.
```
* GetMaping/jobs/jobType/location
```
The user is requesting data to be filtered by jobType and location of the job. We have used custom method findByJobTypeAndLocation to get the data from database.
```
* GetMapping/jobs/description/location
```
The user is requesting data to be filtered by description or location of the job. We have used custom method findByDescriptionOrLocation to get the data from database.
```
## Operations using custom queries
* DeleteMapping/job/{companyName}
```
We are using this mapping to delete jobs by company name. Here we have used custom SQL query to delete data from database.
```
* PutMapping/jobs/{id}/{salary}
```
We are using this mapping to get jobs by id and update salary for that particular job. Here we have used custom SQL query to update data in our database.
```
## Data Structure Used
* H2 database
* We have used InMemory database H2 to implement CRUD Operations.

## Project Summary
```
The project is a job search portal built using Spring Boot and H2 Database. It allows CRUD operations on a Job entity with added validation using Spring Boot validation. The Job entity class has fields for job details like title, description, location, salary, company name, employer name, job type, and applied date. The project supports various endpoints for CRUD operations and searching for jobs based on title and description. Custom finders and custom queries are also available for advanced querying.
```
## Author

Saurav Kumar

* twiter : [@saurav](https://twitter.com/Sauravjha24)
* Github : [@sjha](https://github.com/sjha24)

## Contributing

Contributions , issues and features requestes are welcome !

Feel free to check issues page

## Show your support

Give a rating if this project help you

## License

Copyright : 2023 [Saurav Kumar]()
This project is [GeekSter](https://www.geekster.in/) license

# HumanDemo-Spring-Boot-
Simple microservices  project by Spring Boot to understood Hibernate, Jpa, Maven and JDBC work  

Human have a phone numbers and address for leaving. Phone and address there are separate table in database. This tables connection by foreign key references at human table.  

This project has 4 microservice:  
- app - to run project and launch options settings
- dao - contains entity and repository layer
- service - implements dao layer
- controller - to browser send request

Project release 2 connection with between tables:  
- @OneToMany;
- @OneToOne.



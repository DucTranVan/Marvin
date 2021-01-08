# Ecanif

**Ecanif is built to help you gaining an understanding of your financial situation in order to make the most of your money work for your FRIENDS in day-to-day life and in planing for the future.**

## Functional features

- Money flow tracking
- Budgeting & Planning
- Reporting
- Bank Syncing
- Transaction extraction from bill
- Financial social forum

## Architectural Decisions

### Guidelines 

- Use of open source software is only allowed if having permissive licenses
- Apply [Reactive system appoach](https://www.reactivemanifesto.org/)
- Apply [Microservice Architecture Pattern](http://martinfowler.com/microservices/)

### Technologies

- Use K8s for Kubernetes as the container-orchestration system for automating computer application deployment, scaling, and management. 
- Use Spring Boot framework and leverage it's AOP technologies
- Use gRPC for communication between core services 

### Application

- Use Flutter to develop applications for Android, iOS from a single codebase
- Use Angular to develop Web interface
- For standard entities, an ORM mapper is used
- For complex queries, prepared SQL statements are used

### Data

- During ETL, all categorical and ordinal fields must be indexed
- During ETL, data must be denormalized into a star-model

 



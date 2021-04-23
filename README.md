# Microservice - Modern Application 
-----------------
1. Monolith vs Microservices - An Analysis 
2. Design Principles | Boundaries around microservices | Guidelines to follow when designing microservices applications
3. Microservices: Design Patterns
----
🌠 More about Microservices : 
* Microservices Decomposition Pattern: By Domain and subdomain
* Microservices Decomposition Pattern: Strangle Vine Pattern
* Microservices Decomposition Pattern: Sidecar Pattern
* Microservices Decomposition Pattern: Service Mesh 
* Microservices Database Pattern: Database per service & Shared Database per service
* Microservices Database Pattern: CQRS - Common Query Responsibility Segregation
* Microservices Database Pattern: Data Consistency - Eventual vs Strong Consistency 
* Microservices Database Pattern: Event-Driven Architecture
* Microservices Database Pattern: Event Sourcing
* Mircroservices Databse Pattern: 2 Phase Commit
* Microservices Database Pattern: SAGA
* Microservices Database Pattern: Summary
* Microservices Communication: How microservices understand each other(such as connect)
* Microservices Communication: Synchronous vs Asyncronous
* Microservices Communication: HTTP & REST
* Microservices Communication: Message Based Communication
* Microservices Communication: GraphQL
* Microservices Integration Patterns: API Gateway
* Microservices Integration Patterns: Aggregator Pattern
   *  Chained Pattern 
   *  Branch Pattern
* Microservices Integration Pattern: Clientside UI Composition Pattern
* Microservices Observable Pattern: Health Check and Performance Metrics
* Microservices Cross Cutting Concern Pattern: Service Registry and Discovery
* Microservices Cross Cutting Concern Pattern: Load Balancer
* Microservices Cross Cutting Concern PatternL Extrenal Configuration
* Microservices Deployment Patterns: What is Container ? What is VM? Container vs VM
* Microservices Deployment Patterns: Multiple service instances per host & Service instance per host? Service Instance per VM | Service Instance per Container
* Microservices Deployment Patterns: Serverless Pattern
* Microservices Deployment Patterns: Blue - Green | Cananry| Rolling Patterns 

## Practical Microservices Architecture vs source code 





## Monolith vs Microservices - An Analysis 

## What is Monoloth Architecture?

  * Single jar/war file for whole application
  * Issues
     *  Less flexible for large team and code base
     *  Overload IDE
     *  Continuous development is difficult
     *  Scaling the app is difficult
     *  Scaling development is difficult
     *  Technology stack change is difficult
    
[Reference architecture - Monolothic](https://user-images.githubusercontent.com/11626327/110196093-88743780-7e85-11eb-9a3f-4ce9aa7a226b.png)


## What is Microservice Architecture?

   => A Set of loosely coupled, collaborating services. Each service is relating several parameters:
  * Highly maintainable and testable
  * Loosely coupled with other services
  * Independently deployable
  * Capable of being developed by a small team
  * Services can be developed independent of each other
  * Communication among service via HTTP/REST/AMQP
  * Service granularity (how small service and how to size of the service capacity. Logically)
  * Linguistic approach
  * Technologic agnostic
  More about Microservices:
      * Microservices is a specialization of an implementation approarch for service - oriented architecure (SOA) used to build flexible, independently deployable software systems.
      * Followed the introduction of DevOps
      * Strategy - "Do one thing and do it well".



## Important References: 

  🔥 Microservices Antipatterns 
  🔥 CAP Theorem
  [Reference architecture - Mircroservice](https://user-images.githubusercontent.com/11626327/110196328-20265580-7e87-11eb-9381-0727ba11028b.png)

# account-service
- Handles creation, management, and retrieval of user's financial accounts and related entity.
- Handles creation and retrieval of transactions
- Handles creation and retrieval of categories
- Handles creation and retrieval of tag

## Command
- Build the Docker image:
  - cd configuration/
  - docker build -t account-service .
    
- Verify that we got a Docker image, as expected, by using the following command:
  - docker images | grep account-service  
    
- Start up the product microservice as a container by using the following command:
  - docker run --rm -p8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" account-service
  - "--rm" option tell docker to terminate the running container when we terminate the terminal or press Ctr+C    
  
- Start the container as detached and show the log output from the container then stopping and removing the container:
  - docker run -d -p8080:8080 -e "SPRING_PROFILES_ACTIVE=docker" --name account-service-container account-service
  - docker logs account-service-container -f   
  - docker rm -f account-service-container  

- Use docker-compose to manage microservices land-scape
  - docker-compose build
  - docker-compose up -d
  - docker-compose down
  - docker-compose ps 
  - docker-compose logs -f
  - docker-compose down && ./gradlew clean build && docker-compose build && docker-compose up -d




## Noted link
- http://localhost:8080/swagger-ui/
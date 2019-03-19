## Spring cloud config with docker

- install docker first on your machine
- install maven
- run command `mvn clean package` will create jar file on folder taget server and client
- cp spring-cloud-config-server/target/spring-cloud-config-server-0.0.1-SNAPSHOT.jar \
  docker/files/spring-cloud-config-server.jar
- cp spring-cloud-config-client/target/spring-cloud-config-client-0.0.1-SNAPSHOT.jar \
  docker/files/spring-cloud-config-client.jar
  
- run command `docker-compose -f docker/docker-compose.yml up --build`

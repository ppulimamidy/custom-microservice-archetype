

# spring-boot-web-kafka-producer
Simple CPD CRUD Application using spring-boot and kafka

- this project required:
    - apache maven
    - IDE
    - mongodb installed in PC
    - kafka installed

- run mongodb on windows:
    - open run (`window + r`)
    - type `mongod --dbpath C:\data`
    
- run mongodb on linux:
	- type `mongod`
	
- run zookeper: `zkserver` in command prompt or terminal

- run kafka: `.\bin\kafka-server-start.sh .\config\server.properties`

- run confluent kafka: `.\bin\confluent start schema-registry`

- show producer and consumer in directory windows in kafka\bin directory:
  - producer:
      `kafka-console-producer.sh --broker-list localhost:9092 --topic [topic-name]`
  - consumer:
      `kafka-console-consumer.sh --zookeeper localhost:2181 --topic [topic-name]`

- running application
    - make sure zookeeper, kafka, mongodb is running
    - `go to project directory in command prompt / terminal`
    - `mvn spring-boot:run`
    - `open localhost:8080` in browser

    - Application behaviour:
      There is updateDispositionNote Button to update the disposition note of opportunity displayed. the
      behavior is when you update the note, then the application will automatically publish
      event to Kafka broker.

- running application using swagger UI
    - open in browser http://localhost:8080/swagger-ui.html
    - now you can use apps using swagger

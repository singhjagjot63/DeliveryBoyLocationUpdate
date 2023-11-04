# DeliveryBoyLocationUpdate
This repository shows the backend flow of how the location of the delivery executive is updated in the app using kafka

Steps to be followed to run it:
1. Download Apache Kafka zip file and extract it in your system.
2. There are a set of commmands to be followed to start apache kafka in the system.
   1. Starting the zookeeper service
      bin\windows\zookeeper-server-start.bat config\zookeeper.properties
   2. Starting the kafka-starter-service
      bin\windows\kafka-server-start.bat config\server.properties
   3. Reading data from the topic.
      bin\windows\kafka-console-consumer.bat --topic location-update-topic --from-beginning --bootstrap-server localhost:9092
   4. Here the topic is "location-update-topic"
3. Set your postman to push data.
4. Once pushed, you will be able to see the data being published to kafka topic and parallely consumed message will be visible at the terminal window.

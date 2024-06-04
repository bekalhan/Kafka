# How to use Kafka with Spring Boot

![system_architecture](https://github.com/bekalhan/kafka-spring/assets/77151270/f300c5e3-6911-4d5e-9d49-1574574f120d)

## Açıklama

During this project, I learned and learned how to use Kafka with Spring Boot and I intend to collect all the information here. If you want to know how to configure this repo and how to test it, please
check out this repository -> [Example of Kafka](https://github.com/muhammedsedef/Kafka-Example?tab=readme-file). If I need to summarize this repository, there are 3 microservices:
the user service, the address service, and the notification service. Our goal is that when the user is created from the user service, we want to create a new address and notification as well. Together with this project,
we will take an in-depth look at how to use Kafka, how to configure it, and what event-driven communication in microservices is really about.

- [Starting with Docker Compose](#starting-with-docker-compose)
- [Couchbase](#couchbase)
- [Kafka UI](#kafka-ui)
- [Event Flow](#event-flow)
- [Lisans](#lisans)
- [İletişim](#iletişim)

## Starting with Docker Compose

Go to the notification service, you will see the infra-setup folder. Open this folder in the terminal and execute this command:

```sh
docker-compose up


when execute this command you will see this screen

<img width="1440" alt="dockercomposeup" src="https://github.com/bekalhan/kafka-spring/assets/77151270/59932985-f3ec-4ffa-8418-c1b9a6858006">


check if you have an issue to do that execute this command

 ```sh
docker container ls

when execute this command you will see this screen

<img width="1434" alt="dockercontainerls" src="https://github.com/bekalhan/kafka-spring/assets/77151270/fdff8a85-caa6-49c9-b9c4-d37d03280351">



## Couchbase


<img width="1440" alt="couchbase" src="https://github.com/bekalhan/kafka-spring/assets/77151270/e4906b67-b82b-4693-9eb9-75d860af21f4">


## Kafka-ui


<img width="1440" alt="kafkaui" src="https://github.com/bekalhan/kafka-spring/assets/77151270/867fd22b-77db-40ad-846a-05ed6a4ac38c">



## Event flow

create a user


<img width="1074" alt="restpost" src="https://github.com/bekalhan/kafka-spring/assets/77151270/0e06a80c-c451-4ca5-877d-a45a0b2b095d">



user-service logs


<img width="1406" alt="userlogs" src="https://github.com/bekalhan/kafka-spring/assets/77151270/1e84e8b0-59e4-4249-9acf-60b92837f1da">



address logs


<img width="1401" alt="addresslogs" src="https://github.com/bekalhan/kafka-spring/assets/77151270/31c37fe1-a2c7-4367-a59f-4d8e276fcc87">



notification logs


<img width="1397" alt="notificationlogs" src="https://github.com/bekalhan/kafka-spring/assets/77151270/48143faf-1357-431b-8887-ec4d139712ac">






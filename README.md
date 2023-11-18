# Dockerized Spring Boot Kotlin Multi-Module project with webflux and event listeners

Super.simple demonstration of a Maven multi-module Kotlin project. It consists of two applications, Ping and Pong, communicating with each other via RESTful APIs. The applications are Dockerized for easy deployment.
Both applications share network namespace with the host machine. 


## Prerequisites
- Computer
- Docker
- JDK 11 or newer
- Maven 

## Usage
1. Clone the repository.
2. Navigate to the project directory.
3. Run the following command to start the applications:
    ```bash
    docker-compose up -d
    ```
   To rebuild images, use:
    ```bash
    docker-compose up --build
    ```

## Description
1. Ping initiates messaging logic and sends messages to Pong.
2. Pong receives message
3. Pong sends message to Ping
4. Ping receives message from Pong
5. Ping sends message to Pong
6. ???
7. Profit

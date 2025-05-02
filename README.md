# Demo Application

This is a simple Spring Boot application that exposes a GET API endpoint, which returns a Hello World message.

## Technologies Used

- Spring Boot for building the backend application.
- Amazon Corretto 21 as the base image for the Docker container.
- Java for running the application.

## Features

- GET /hello : Returns a simple "Hello, World!" message.

## Running the Application

### 1. Clone the Repository

First, clone the repository to your local machine:

git clone (https://github.com/Gagandeep1611/docker-application)
cd demo

### 2. Build the Application

Build the application and create the JAR file:

mvn clean package

This will generate the demo-0.0.1-SNAPSHOT.jar file in the target/ directory.

### 3. Build the Docker Image

Ensure that demo-0.0.1-SNAPSHOT.jar is in the target/ directory, then build the Docker image:

sudo docker build -t demo-application .

### 4. Run the Docker Container

Run the application in a Docker container:

sudo docker run -p 8080:8080 demo-application

## Access the Application

Once the container is running, access the GET / endpoint by navigating to:

http://localhost:8080/

You should see the following response:

Hello, World!

## Stopping the Application

To stop the running container, press Ctrl+C in the terminal or run:

sudo docker ps
sudo docker stop <container-id>

## Notes

- Ensure Docker is installed and running on your machine.
- You need Java 21 installed only if running the app without Docker.

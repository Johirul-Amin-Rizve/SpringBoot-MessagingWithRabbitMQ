# SpringBoot-MessagingWithRabbitMQ
This Project created with JAVA version 11 and Built With,

* Spring Boot.
* Spring Framework.
* RabbitMQ

# Project Theme
This a simple Spring Boot project with RabbitMQ. In this project a Producer Class get message from a big text file and send it to RabbitMQ. A Consumer class received the message and using strem api it process the message and find how many times does a given word occur. 

# Project-Build
Clone the repository and build with meven. For running this project you need to install and run rabbitMQ server locally. I used default configuration properties for connet rabbitMQ with my project. You can change default user and password from application.properties file.

# RabbitMQ install and Run
Follow the link below for install and run RabbitMQ for any Operation System.
https://www.rabbitmq.com/install-windows.html

For Ubuntu 16.04 I followed below document.
https://www.vultr.com/docs/how-to-install-rabbitmq-on-ubuntu-16-04-47
My RabbitMQ manager Url http://127.0.0.1:15672/

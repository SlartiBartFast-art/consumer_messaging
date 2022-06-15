# application consumer_messaging project

[![Build Status](https://app.travis-ci.com/SlartiBartFast-art/consumer_messaging.svg?branch=master)](https://app.travis-ci.com/SlartiBartFast-art/consumer_messaging)
![GitHub top language](https://img.shields.io/github/languages/top/SlartiBartFast-art/consumer_messaging?logo=java&logoColor=red)
![GitHub last commit](https://img.shields.io/github/last-commit/SlartiBartFast-art/consumer_messaging?logo=github)

Часть 2-я Consumer

(Часть 1-я Provider # application project synchronous messaging)

  - https://github.com/SlartiBartFast-art/synchronous_messaging

Used stack technologies:

- Java (Back-end)

- Libraries (java):

- Hibernate HQL/ JPA (data-base)

- PostgreSQL PSQL (data-base)

- Spring Boot и архитектура REST API

- Maven

- Postman (Postman is an API platform for building and using APIs)

Данный сервис вызывает методы удаленного сервиса используя RestTemplate
(см. проект https://github.com/SlartiBartFast-art/job4j_synchronous_messaging):

- /find, загрузить все паспорта
  
![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_1.jpg)

- /save, сохранить данные паспорта

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_2.jpg)

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_5.jpg)
  
- /update?id=*, обновить данные паспорта

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_11.jpg)

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_12.jpg)

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_13.jpg)

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_15.jpg)

- /delete?id=*, удалить данные паспорта

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_4.jpg)

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_6.jpg)

- /find?seria=*, загрузить паспорта с заданной серией

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_3.jpg)

- /unavaliabe, загрузить паспорта чей срок вышел

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_7.jpg)

- /find-replaceable, загрузить паспорта, которые нужно заменить в ближайшие 3 месяца

![Image of Arch](https://github.com/SlartiBartFast-art/consumer_messaging/blob/master/image/Screenshot_8.jpg)



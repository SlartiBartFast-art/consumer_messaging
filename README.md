# simple consumer_messaging project

Часть 2-я Consumer

(Часть 1-я Provider # simple project synchronous messaging)

Данный сервис вызывает методы первого сервиса:
- /save, сохранить данные паспорта
- /update?id=*, обновить данные паспорта
- /delete?id=*, удалить данные паспорта
- /find, загрузить все паспорта
- /find?seria=*, загрузить паспорта с заданной серией
- /unavaliabe, загрузить паспорта чей срок вышел
- /find-replaceable, загрузить паспорта, которые нужно заменить в ближайшие 3 месяца

используя RestTemplate
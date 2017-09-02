# PlayJsonService
Scala Play Json Example


RESTful API written in Scala, using the Play Framework.

To start the application:
    sbt run

And then http://localhost:9000

To use the REST API:
	curl -X POST http://localhost:9000/postJson -H "Content-Type: application/json" -d "{"name": "Robert", age:27}"
	
	curl -X GET http://localhost:9000/get

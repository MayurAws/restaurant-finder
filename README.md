# Restaurant Finder

This application exposes rest end points for the front end so that it can 
surface list of restaurants depending on the customer's preference.

At the moment only one end point is set up to get the list of restaurants having
filtering criteria (Area, Cuisine and Rating)

You can use the below curl command to invoke the API:

The path layout is as below: 

http://localhost:8080/sample-api/area/{areaName}/{cuisine}/{rating}

#### Few curl commands

1. curl -X GET "http://localhost:8080/sample-api/area/Manhattan/Thai/2" -H "accept: */*"
2. curl -X GET "http://localhost:8080/sample-api/area/Bronx/Thai/2" -H "accept: */*"
3. curl -X GET "http://localhost:8080/sample-api/area/Queens/Indian/2" -H "accept: */*"

#### To create the jar file
Run "mvn clean package"

#### To run the executable
Run "java -jar target/restaurant.filter-1.0-SNAPSHOT.jar"

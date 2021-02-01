Dear tester,

Lol this is a message to pour out my heart to you for taking time to test this.

By Now you would have had the jars downloaded.

**Kindly start CMD and navigate to the path where the jar files have been downloaded.**

To start the services, kindly run the following commands in order on CMD.

- java -jar accountdetails-service-0.0.1-SNAPSHOT.jar
- java -jar useraccount-service-0.0.1-SNAPSHOT.jar
- java -jar accountservice-0.0.1-SNAPSHOT.jar

Once the services are up, the available access end point is: http://localhost:8083/accounts/{userid}
replace {userid} with any random text and a json response will be returned.

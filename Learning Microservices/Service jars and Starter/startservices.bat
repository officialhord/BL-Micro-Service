@ECHO OFF
start cmd.exe /k java -jar accountdetails-service-0.0.1-SNAPSHOT.jar

ECHO Timeout waiting for User Service to start
sleep 10

start cmd.exe /k java -jar useraccount-service-0.0.1-SNAPSHOT.jar
ECHO Timeout waiting for Account Service to start

sleep 10
start cmd.exe /k java -jar accountservice-0.0.1-SNAPSHOT.jar
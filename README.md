# learnings2024

Prerequisites 
* Java 22

Running
- build 
`./gradlew build`
- Run 
`./gradlew bootRun`


Docker
-build
`docker-compose build`
-start
`docker-compose up --build`
-remove
`docker-compose down`
or 
`docker-compose down --rmi all`
or 
`docker-compose down --rmi all --volumes`

docker volume prune -f
docker network prune -f  


with docker
curl http://localhost:8081/myendpoint



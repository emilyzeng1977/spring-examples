docker build -t zengemily79/bookstore .
docker image rm -f zengemily79/bookstore

docker push zengemily79/bookstore:1.0.0
docker run -p 8082:8082 zengemily79/bookstore

http://localhost:8082/books

docker exec -t -i [container ID] sh


/logs/logs # cat access_log.2020-06-07.log 
172.17.0.1 - - [07/Jun/2020:06:06:49 +0000] "GET /books1 HTTP/1.1" 404 286
172.17.0.1 - - [07/Jun/2020:06:06:59 +0000] "GET /books HTTP/1.1" 200 120

/logs/logs/application.log

# Container Log



# School-Abstraction-Manager

*** service's list :

The gateway service  :  port=8765  
The registry service :  port=8761  
the config service   :  port=8888  
the staffs service   :  port=8100    // **  the database H2 for the staffs : http://localhost:8100/h2-console/   
the courses service  :  port=8101 

need to start zipkin server on the port : 9411

run the containers  
docker run -d -p 9411:9411 openzipkin/zipkin

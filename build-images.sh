#building docker images for the whole project

#building the image for the config service.
docker build -t achrafchar/config-service.0.0.1 ./config-service

#building the image for the courses-service
docker build -t achrafchar/courses-service.0.0.1 ./courses-service

#building the image for the gateway-service
docker build -t achrafchar/gateway-service.0.0.1 ./gateway-service

#building the image for the registery-service
docker build -t achrafchar/registery-service.0.0.1 ./registery-service

#building the image for the staffs-service
docker build -t achrafchar/staffs-service.0.0.1 ./staffs-service


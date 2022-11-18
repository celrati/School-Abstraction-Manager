

echo "running config and eureka and zipkin"
docker-compose up

#we should wait arround 3min..

echo "running the services after a minutes"
docker-compose -f docker-compose-services.yml up

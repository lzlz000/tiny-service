cd ./common
call mvn install
cd ../tiny-parent
call mvn install
cd ../api-gateway
call mvn package -DskipTests
cd ../config
call mvn package -DskipTests
cd ../product-service
call mvn package -DskipTests
cd ../eureka
call mvn package -DskipTests
cd ../consumer-service
call mvn package -DskipTests

pause
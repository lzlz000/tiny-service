# tiny-service

#### 运行方式

```
# 执行顺序
java -jar ./eureka/target/eureka-0.0.1-SNAPSHOT.jar
java -jar ./config/target/config-0.0.1-SNAPSHOT.jar
java -jar ./api-gateway/target/api-gateway-0.0.1-SNAPSHOT.jar -Dserver.port=38000
java -jar ./product-service/target/product-0.0.1-SNAPSHOT.jar
java -jar ./consumer-service/target/consumer-0.0.1-SNAPSHOT.jar

# apigateway设置了过滤器 随便加个token就行
http://localhost/product/name?token=1
http://localhost/consumer/name?token=1
```

各种demo主要在product服务中运行


package lzlz000.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = "lzlz000.consumer.client")
@SpringCloudApplication
@ComponentScan(basePackages = "lzlz000")
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }
}

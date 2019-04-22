package lzlz000.consumer.controller;

import lzlz000.consumer.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final ProductClient productClient;

    @Autowired
    public Controller(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("name")
    public String echo(){
        return "consumer-service";
    }

    @GetMapping("name1")
    public String name1(){
        return productClient.getName();
    }
}

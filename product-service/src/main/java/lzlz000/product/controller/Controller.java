package lzlz000.product.controller;

import lzlz000.product.client.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.LineNumberReader;

@RestController
public class Controller {
    private final ProductClient productClient;

    @Autowired
    public Controller(ProductClient productClient) {
        this.productClient = productClient;
    }

    @GetMapping("name")
    public String echo(){
        return "product-service";
    }

    @GetMapping("name1")
    public String name1(){
        return productClient.getName();
    }
}

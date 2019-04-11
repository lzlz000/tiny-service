package lzlz000.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("name")
    public String echo(){
        return "product-service";
    }
}

package lzlz000.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 我调用我自己
 */
@FeignClient(name = "product") //
public interface ProductClient {
    @GetMapping("name")
    String getName();

}

package com.roncoo.eshop.oneservice.service;

import com.roncoo.eshop.oneservice.service.fallback.EshopPriceServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "eshop-price-service", fallback = EshopPriceServiceFallback.class)
public interface EshopPriceService {

    @RequestMapping(value = "/product-price/findByProductId",method = RequestMethod.GET)
    String findByProductId(@RequestParam(value = "productId") Long productId);

}
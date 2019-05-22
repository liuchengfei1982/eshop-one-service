package com.roncoo.eshop.oneservice.service;

import com.roncoo.eshop.oneservice.service.fallback.EshopInventoryServiceFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "eshop-inventory-service", fallback = EshopInventoryServiceFallback.class)
public interface EshopInventoryService {

    @RequestMapping(value = "/product-inventory/findByProductId",method = RequestMethod.GET)
    String findByProductId(@RequestParam(value = "productId") Long productId);

}
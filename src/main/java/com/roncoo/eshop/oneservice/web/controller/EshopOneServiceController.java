package com.roncoo.eshop.oneservice.web.controller;

import com.roncoo.eshop.oneservice.service.EshopInventoryService;
import com.roncoo.eshop.oneservice.service.EshopPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/one")  
public class EshopOneServiceController {

	@Autowired
	private EshopInventoryService eshopInventoryService;
	@Autowired
	private EshopPriceService eshopPriceService;
	
	@RequestMapping("/findInventoryByProductId")
	@ResponseBody
	public String findInventoryByProductId(Long productId) {
		return eshopInventoryService.findByProductId(productId);
	}
	
	@RequestMapping("/findPriceByProductId")
	@ResponseBody
	public String findPriceByProductId(Long productId) {
		return eshopPriceService.findByProductId(productId);
	}
	
}

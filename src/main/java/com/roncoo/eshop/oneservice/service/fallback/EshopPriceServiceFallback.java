package com.roncoo.eshop.oneservice.service.fallback;

import com.roncoo.eshop.oneservice.service.EshopPriceService;
import org.springframework.stereotype.Component;


@Component
public class EshopPriceServiceFallback implements EshopPriceService {

	public String findByProductId(Long productId) {
		return "降级价格数据";
	}

}

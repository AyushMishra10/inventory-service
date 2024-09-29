package com.prj.ms.inventory_service.service;

import org.springframework.stereotype.Service;

import com.prj.ms.inventory_service.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class InventoryService {
	
	private final InventoryRepository inventoryRepository;
	
	public boolean isInStock(String skuCode, Integer quantity) {
		return inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode, quantity);
	}

}

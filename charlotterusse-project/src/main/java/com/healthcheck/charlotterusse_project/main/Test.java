package com.healthcheck.charlotterusse_project.main;

import java.util.List;

import com.healthcheck.charlotterusse_project.bo.StoreLocationBO;
import com.healthcheck.charlotterusse_project.service.ProductService;
import com.healthcheck.charlotterusse_project.service.RegisterService;
import com.healthcheck.charlotterusse_project.service.StoreLocationService;

public class Test {
	
	private static StoreLocationService service = new StoreLocationService();
	
	private static ProductService productService = new ProductService();
	
	
	public static void main(String[] args) {
		List<StoreLocationBO> storeLocationBOs  = service.getStoreLocations();
		if(!storeLocationBOs.isEmpty()) {
			System.out.println(storeLocationBOs);
		}
//		System.out.println(productService.getProducts(1111220012));
		System.out.println(new RegisterService().getRegister());
	}
}

package com.healthcheck.charlotterusse_project.main;

import java.util.List;

import com.healthcheck.charlotterusse_project.bo.StoreLocationBO;
import com.healthcheck.charlotterusse_project.service.StoreLocationService;

public class Test {
	
	private static StoreLocationService service = new StoreLocationService();
	
	
	public static void main(String[] args) {
		List<StoreLocationBO> storeLocationBOs  = service.getStoreLocations();
		if(!storeLocationBOs.isEmpty()) {
			System.out.println(storeLocationBOs);
		}
	}
}

package com.healthcheck.charlotterusse_project.service;

import java.util.ArrayList;
import java.util.List;

import com.healthcheck.charlotterusse_project.bo.StoreLocationBO;
import com.healthcheck.charlotterusse_project.dao.StoreLocationDAO;
import com.healthcheck.charlotterusse_project.dto.StoreLocationDTO;

public class StoreLocationService {
	private StoreLocationDAO dao;

	public List<StoreLocationBO> getStoreLocations() {
		dao = new StoreLocationDAO();
		List<StoreLocationBO> storeLocationBOs = new ArrayList<StoreLocationBO>();
		try {
			List<StoreLocationDTO> dtos = dao.getStoreLocations();
			if (dtos != null && !dtos.isEmpty()) {
				StoreLocationBO locationBO = null;
				for (StoreLocationDTO storeLocationDTO : dtos) {
					locationBO = new StoreLocationBO();
					locationBO.setId(storeLocationDTO.getId());
					locationBO.setStoreLocationName(storeLocationDTO.getStoreLocationName());
					locationBO.setStoreName(storeLocationDTO.getStoreName());
					storeLocationBOs.add(locationBO);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return storeLocationBOs;
	}
}

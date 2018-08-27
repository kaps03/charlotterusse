package com.healthcheck.charlotterusse_project.service;

import java.sql.SQLException;

import com.healthcheck.charlotterusse_project.bo.ProductBO;
import com.healthcheck.charlotterusse_project.dao.ProductDAO;
import com.healthcheck.charlotterusse_project.dto.ProductDTO;

public class ProductService {

	private ProductDAO productDAO = new ProductDAO();

	public ProductBO getProducts(Integer skuNumber) {
		ProductBO productBO = null;
		try {
			ProductDTO dto = productDAO.getProducts(skuNumber);
			if(dto != null) {
				productBO = new ProductBO();
				productBO.setId(dto.getId());
				productBO.setDescription(dto.getDescription());
				productBO.setPromotion(dto.getPromotion());
				productBO.setPromotionalEffectiveDate(dto.getPromotionalEffectiveDate());
				productBO.setPromotionalExpireDate(dto.getPromotionalEffectiveDate());
				productBO.setPromotionalPrice(dto.getPromotionalPrice());
				productBO.setRegularPrice(dto.getRegularPrice());
				productBO.setSkuNumber(dto.getSkuNumber());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return productBO;
	}
}

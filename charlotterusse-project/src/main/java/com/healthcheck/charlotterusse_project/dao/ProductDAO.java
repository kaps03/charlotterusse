package com.healthcheck.charlotterusse_project.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.healthcheck.charlotterusse_project.dto.ProductDTO;
import com.healthcheck.charlotterusse_project.utility.DBConnection;
import com.healthcheck.charlotterusse_project.utility.Query;

public class ProductDAO {

	public ProductDTO getProducts(Integer skuNumber) throws SQLException {
		Connection connection = DBConnection.getConnection();
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		try {
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery(Query.GET_ALL_PRODUCTS + skuNumber);
			ProductDTO product = null;
			while (resultSet.next()) {
				product = new ProductDTO();
				product.setId(resultSet.getInt(1));
				product.setSkuNumber(resultSet.getInt(2));
				product.setDescription(resultSet.getString(3));
				product.setRegularPrice(resultSet.getDouble(4));
				product.setPromotionalPrice(resultSet.getDouble(5));
				product.setPromotionalEffectiveDate(resultSet.getDate(6));
				product.setPromotionalExpireDate(resultSet.getDate(7));
				product.setPromotion(resultSet.getString(8));

				list.add(product);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		if (!list.isEmpty())
			return list.get(0);
		return null;
	}
}

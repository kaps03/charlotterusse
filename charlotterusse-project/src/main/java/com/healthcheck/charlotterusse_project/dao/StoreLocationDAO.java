package com.healthcheck.charlotterusse_project.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.healthcheck.charlotterusse_project.dto.StoreLocationDTO;
import com.healthcheck.charlotterusse_project.utility.DBConnection;
import com.healthcheck.charlotterusse_project.utility.Query;

public class StoreLocationDAO {

	public List<StoreLocationDTO> getStoreLocations() throws SQLException{
		//getting  connection with DB
		Connection connection = DBConnection.getConnection();
		//Creating statement for writting query.
		Statement statement = connection.createStatement();
		ResultSet set = statement.executeQuery(Query.GET_ALL_STORE_LOCATION);
		List<StoreLocationDTO> dtos = new ArrayList<StoreLocationDTO>();
		if(set != null) {
			StoreLocationDTO dto = null;
			while (set.next()) {
				dto = new StoreLocationDTO();
				dto.setId(set.getInt(1));
				dto.setStoreName(set.getString(2));
				dto.setStoreLocationName(set.getString(3));
				dtos.add(dto);
			}
		}
		return dtos;
	}
}

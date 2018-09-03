package com.healthcheck.charlotterusse_project.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.healthcheck.charlotterusse_project.dto.RegisterDTO;
import com.healthcheck.charlotterusse_project.utility.DBConnection;
import com.healthcheck.charlotterusse_project.utility.Query;

public class RegisterDAO {

	private Connection connection;

	public List<RegisterDTO> getRegisters() throws SQLException{
		connection = DBConnection.getConnection();
		List<RegisterDTO> dtos = new ArrayList<RegisterDTO>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(Query.GET_ALL_REGISTERS);
			RegisterDTO registerDTO = null;
			while(resultSet.next()) {
				registerDTO = new RegisterDTO();
				registerDTO.setRegisterId(resultSet.getInt(1));
				registerDTO.setRegisterStatus(resultSet.getString(2));
				dtos.add(registerDTO);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return dtos;
	}
}

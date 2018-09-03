package com.healthcheck.charlotterusse_project.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.healthcheck.charlotterusse_project.bo.RegisterBO;
import com.healthcheck.charlotterusse_project.dao.RegisterDAO;
import com.healthcheck.charlotterusse_project.dto.RegisterDTO;

public class RegisterService {

	private RegisterDAO registerDAO = new RegisterDAO();
	
	public List<RegisterBO> getRegister(){
		List<RegisterBO> bos = new ArrayList<RegisterBO>();
		try {
			List<RegisterDTO> dtos = registerDAO.getRegisters();
			RegisterBO registerBO = null;
			for(int i =0; i< dtos.size(); i++) {
				RegisterDTO dto = dtos.get(i);
				registerBO = new RegisterBO();
				registerBO.setRegisterId(dto.getRegisterId());
				registerBO.setRegisterStatus(dto.getRegisterStatus());
				bos.add(registerBO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bos;
	}
}

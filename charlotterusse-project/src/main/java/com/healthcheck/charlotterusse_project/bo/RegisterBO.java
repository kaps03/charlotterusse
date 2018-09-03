package com.healthcheck.charlotterusse_project.bo;

public class RegisterBO {

	private Integer registerId;
	private String registerStatus;

	public Integer getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public String getRegisterStatus() {
		return registerStatus;
	}

	public void setRegisterStatus(String registerStatus) {
		this.registerStatus = registerStatus;
	}

	@Override
	public String toString() {
		return "RegisterDTO [registerId=" + registerId + ", registerStatus=" + registerStatus + "]";
	}

}

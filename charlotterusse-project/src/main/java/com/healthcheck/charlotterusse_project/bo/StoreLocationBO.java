package com.healthcheck.charlotterusse_project.bo;

public class StoreLocationBO {

	private Integer id;
	private String storeName;
	private String storeLocationName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreLocationName() {
		return storeLocationName;
	}

	public void setStoreLocationName(String storeLocationName) {
		this.storeLocationName = storeLocationName;
	}

	@Override
	public String toString() {
		return "StoreLocationBO [id=" + id + ", storeName=" + storeName + ", storeLocationName=" + storeLocationName
				+ "]";
	}

}

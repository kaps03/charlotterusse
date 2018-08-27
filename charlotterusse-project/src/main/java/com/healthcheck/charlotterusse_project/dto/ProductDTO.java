package com.healthcheck.charlotterusse_project.dto;

import java.util.Date;

/**
 * @author Admin
 *
 */
public class ProductDTO {

	private Integer id;
	private Integer skuNumber;
	private String description;
	private Double regularPrice;
	private Double promotionalPrice;
	private Date promotionalEffectiveDate;
	private Date promotionalExpireDate;
	private String promotion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSkuNumber() {
		return skuNumber;
	}

	public void setSkuNumber(Integer skuNumber) {
		this.skuNumber = skuNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getRegularPrice() {
		return regularPrice;
	}

	public void setRegularPrice(Double regularPrice) {
		this.regularPrice = regularPrice;
	}

	public Double getPromotionalPrice() {
		return promotionalPrice;
	}

	public void setPromotionalPrice(Double promotionalPrice) {
		this.promotionalPrice = promotionalPrice;
	}

	public Date getPromotionalEffectiveDate() {
		return promotionalEffectiveDate;
	}

	public void setPromotionalEffectiveDate(Date promotionalEffectiveDate) {
		this.promotionalEffectiveDate = promotionalEffectiveDate;
	}

	public Date getPromotionalExpireDate() {
		return promotionalExpireDate;
	}

	public void setPromotionalExpireDate(Date promotionalExpireDate) {
		this.promotionalExpireDate = promotionalExpireDate;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", skuNumber=" + skuNumber + ", description=" + description + ", regularPrice="
				+ regularPrice + ", promotionalPrice=" + promotionalPrice + ", promotionalEffectiveDate="
				+ promotionalEffectiveDate + ", promotionalExpireDate=" + promotionalExpireDate + ", promotion="
				+ promotion + "]";
	}

}

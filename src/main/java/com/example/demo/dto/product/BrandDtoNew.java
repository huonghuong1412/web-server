package com.example.demo.dto.product;

import com.example.demo.entity.product.Brand;

public class BrandDtoNew {

	private String name;
	private String code;
	private String madeIn;

	public BrandDtoNew() {
		// TODO Auto-generated constructor stub
	}

	public BrandDtoNew(Brand entity) {
		super();
		this.name = entity.getName();
		this.code = entity.getCode();
		this.madeIn = entity.getMadeIn();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMadeIn() {
		return madeIn;
	}

	public void setMadeIn(String madeIn) {
		this.madeIn = madeIn;
	}

}

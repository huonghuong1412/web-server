package com.example.demo.dto.user;

import com.example.demo.dto.AbstractDTO;
import com.example.demo.dto.category.CategoryDtoNew;
import com.example.demo.dto.category.SubcategoryDtoNew;
import com.example.demo.entity.category.Category;
import com.example.demo.entity.category.SubCategory;
import com.example.demo.entity.user.LikedProduct;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class LikedProductDto extends AbstractDTO<LikedProductDto> {

	private String username;
	private Long productId;
	private Long id;
	private String name;
	private String slug;
	private Long price;
	private Long list_price;
	@JsonInclude(value = Include.NON_NULL)
	private Double percent_discount;
	private String mainImage;
	private CategoryDtoNew category;
	private SubcategoryDtoNew subcategory;
	public LikedProductDto() {
		// TODO Auto-generated constructor stub
	}

	public LikedProductDto(LikedProduct entity) {
		// TODO Auto-generated constructor stub
		this.setId(entity.getId());
		this.username = entity.getUser().getUsername();
		this.productId = entity.getProduct().getId();
		this.id = entity.getProduct().getId();
		this.name = entity.getProduct().getName();
		this.slug = entity.getProduct().getSlug();
		this.price = entity.getProduct().getPrice();
		this.list_price = entity.getProduct().getList_price();
		if (this.price != null && this.list_price != null) {

			Double percent = (this.list_price.doubleValue() - this.price.doubleValue()) / this.list_price.doubleValue()
					* 100;

			this.percent_discount = (double) Math.round(percent * 10) / 10;
		} else {
			this.percent_discount = null;
		}
		this.mainImage = entity.getProduct().getMainIamge();
		category = new CategoryDtoNew();
		if (category != null) {
			Category item = entity.getProduct().getCategory();
			this.category = new CategoryDtoNew(item);
		}
		subcategory = new SubcategoryDtoNew();
		if (subcategory != null) {
			SubCategory item = entity.getProduct().getSubcategory();
			this.subcategory = new SubcategoryDtoNew(item);
		}
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getList_price() {
		return list_price;
	}

	public void setList_price(Long list_price) {
		this.list_price = list_price;
	}

	public Double getPercent_discount() {
		return percent_discount;
	}

	public void setPercent_discount(Double percent_discount) {
		this.percent_discount = percent_discount;
	}

	public String getMainImage() {
		return mainImage;
	}

	public void setMainImage(String mainImage) {
		this.mainImage = mainImage;
	}

	public CategoryDtoNew getCategory() {
		return category;
	}

	public void setCategory(CategoryDtoNew category) {
		this.category = category;
	}

	public SubcategoryDtoNew getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(SubcategoryDtoNew subcategory) {
		this.subcategory = subcategory;
	}

}

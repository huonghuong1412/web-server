package com.example.demo.dto.order;

import com.example.demo.dto.AbstractDTO;
import com.example.demo.dto.category.CategoryDtoNew;
import com.example.demo.dto.product.BrandDtoNew;
import com.example.demo.entity.category.Category;
import com.example.demo.entity.order.CartDetail;
import com.example.demo.entity.product.Brand;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class CartDetailDto extends AbstractDTO<CartDetailDto> {

	private Long cart_id;
	private Long product_id;
	private String color;
	private Integer quantity;
	private Integer selected;
	// info product
	private Integer type;
	private String name;
	private String slug;
	private Long price;
	private Long list_price;
	private String mainImage;
	@JsonInclude(value = Include.NON_NULL)
	private Integer in_stock;
	private CategoryDtoNew category;
	@JsonInclude(value = Include.NON_NULL)
	private BrandDtoNew brand;

	public CartDetailDto() {
		// TODO Auto-generated constructor stub
	}

	public CartDetailDto(CartDetail entity) {
		// TODO Auto-generated constructor stub
		this.setId(entity.getId());
		this.product_id = entity.getProduct().getId();
		this.color = entity.getColor();
		this.quantity = entity.getQuantity();
		this.cart_id = entity.getCart().getId();
		this.selected = entity.getSelected();
		this.type = entity.getProduct().getType();
		this.name = entity.getProduct().getName();
		this.slug = entity.getProduct().getSlug();
		this.price = entity.getProduct().getPrice();
		this.list_price = entity.getProduct().getList_price();
//		if (entity.getProduct().getInventory() != null) {
//			this.in_stock = entity.getProduct().getInventory().getQuantity_item();
//		}
		this.mainImage = entity.getProduct().getMainIamge();
		category = new CategoryDtoNew();
		if (category != null) {
			Category item = entity.getProduct().getCategory();
			this.category = new CategoryDtoNew(item);
		}
		this.brand = new BrandDtoNew();
		Brand brandEntity = entity.getProduct().getBrand();
		this.brand = new BrandDtoNew(brandEntity);
	}

	public Long getCart_id() {
		return cart_id;
	}

	public void setCart_id(Long cart_id) {
		this.cart_id = cart_id;
	}

	public Integer getSelected() {
		return selected;
	}

	public void setSelected(Integer selected) {
		this.selected = selected;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
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

	public Integer getIn_stock() {
		return in_stock;
	}

	public void setIn_stock(Integer in_stock) {
		this.in_stock = in_stock;
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

	public BrandDtoNew getBrand() {
		return brand;
	}

	public void setBrand(BrandDtoNew brand) {
		this.brand = brand;
	}

}

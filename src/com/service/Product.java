package com.service;

import javax.xml.bind.annotation.*;

import java.math.BigDecimal;

@XmlRootElement(name = "product")

@XmlAccessorType(XmlAccessType.FIELD)

public class Product {

    @XmlAttribute(name = "id")

    private String productId;

    @XmlElement(name = "description")

    private String description;

    @XmlElement(name = "imageUrl")

    private String imageUrl;

    @XmlElement(name = "price")

    private double price;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double d) {
		this.price = d;
	}

  

}
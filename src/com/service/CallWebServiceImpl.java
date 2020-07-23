package com.service;

import java.util.ArrayList;

import javax.jws.WebService;

@WebService(endpointInterface ="com.service.CallWebServices", serviceName = "CallWebServices")
public class CallWebServiceImpl implements CallWebServices {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public ArrayList<Product> getProductList(String a) {
		
		 ArrayList books = new ArrayList<Product>();
		 
		 
		 Product product=new Product();
		 product.setProductId("YES");
		 product.setPrice(1000000.0);
		 product.setImageUrl("URL1");
		 product.setDescription("ME MYSELF N I");
		 books.add(product);
		

		 
		 books.add(product);
		 
		
		return books;
	}

	@Override
	public Product getProduct(Product product) {
		
		
		System.out.println(product.getProductId());
		System.out.println(product.getPrice());
		System.out.println(product.getImageUrl());
		System.out.println(product.getDescription());
		
		return product;
	}

}

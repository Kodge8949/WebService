package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public interface CallWebServices {
	
	int add(int a, int b);
	ArrayList<Product> getProductList(String a);
	
	Product getProduct(Product product);
}

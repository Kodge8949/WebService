package com.junit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.service.CallWebServiceImpl;
import com.service.CallWebServices;
import com.service.Product;

class JunitCallWebservice {
	/*
	 * @Test void test() { CallWebServices callWebServices = new
	 * CallWebServiceImpl(); int add = callWebServices.add(10, 20); assertEquals(31,
	 * add);
	 * 
	 * }
	 * 
	 * 
	 * @Test void test1() {
	 * 
	 * ArrayList books = new ArrayList<Product>();
	 * 
	 * 
	 * Product product=new Product(); product.setProductId("YES");
	 * product.setPrice(1000000.0); product.setImageUrl("URL1");
	 * product.setDescription("ME MYSELF N I"); books.add(product);
	 * 
	 * CallWebServices callWebServices = new CallWebServiceImpl();
	 * 
	 * 
	 * 
	 * ArrayList<Product> add = callWebServices.getProductList("YES");
	 * 
	 * // assertArrayEquals(books.toArray(), add.toArray()); //
	 * assertTrue(books.equals(add));
	 * 
	 * // assertArrayEquals("YES", books);
	 * 
	 * assertThat(books, is(add));
	 * 
	 * 
	 * 
	 * 
	 * // assertEquals(books, add);
	 * 
	 * 
	 * 
	 * }
	 * 
	 * 
	 * private void compare(ArrayList lst, ArrayList lst1) { Object[] array =
	 * lst.toArray(); Object[] array1 = lst1.toArray();
	 * assertTrue("Arrays not the same length", array.length == array1.length);
	 * 
	 * assertTrue("YES", Arrays.equals(array,array1));
	 * 
	 * 
	 * assertEquals("should have gotten " + array + "\n" +" but instead got " +
	 * array1+ "\n", array, array1);
	 * 
	 * 
	 * 
	 * }
	 */
}

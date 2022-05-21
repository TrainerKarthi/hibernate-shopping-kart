package com.ty.shopping.controller;


import java.util.List;

import com.ty.shopping.dto.Product;
import com.ty.shopping.user_service.ProductService;

public class ProductController {

	public static void main(String[] args)
	{
		ProductService service = new ProductService();
		Product product = new Product();
		
//		product.setName("Tshirt");
//		product.setBrand("Adidas");
//		product.setPrice(50);
//		product.setType("RoundNeck");
//		product.setSize("medium");
//		product.setRating(4);
//		service.saveProduct(product);
		
		product = service.getProductById(4);
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getBrand());
		System.out.println(product.getPrice());
		System.out.println(product.getType());
		System.out.println(product.getRating());
		
//		service.getProductByBrand("karthik");
//		service.getProductByPrice(100);
//		service.getProductBySize("large");
//		service.getProductByType("cotton");
//		service.getProductByRating(5);
		
		List<Product> products = service.getAllProducts();
		
		for (Product product2 : products) {
			System.out.println(product2.getId());
			System.out.println(product2.getName());
			System.out.println(product2.getBrand());
			System.out.println(product2.getPrice());
			System.out.println(product2.getSize());
			System.out.println(product2.getType());
			System.out.println(product2.getRating());
			System.out.println("================================");
		}
		
		
		
	}
}

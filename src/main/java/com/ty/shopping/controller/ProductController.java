package com.ty.shopping.controller;



import com.ty.shopping.dto.Product;
import com.ty.shopping.user_service.ProductService;

public class ProductController {

	public static void main(String[] args) {
		ProductService service = new ProductService();
		Product product = new Product();
		//save product
//		service.saveProduct();
		
		//get the product by id
		service.getProductById(4,product);
		
		//get the product by brand
		service.getProductByBrand("karthik");
		
		//get all the products
		service.getAllProducts(product);
		
		product.setName("huddy");
		product.setBrand("Allen Solly");
		product.setPrice(987);
		product.setType("cotton");
		product.setRating(5);
		product = service.updateProductById(1, product);
		
	}
}

package com.ty.shopping.user_service;

import java.util.List;

import com.ty.shopping.dao.ProductDao;
import com.ty.shopping.dto.Product;

public class ProductService {

	public void saveProduct() {
		ProductDao dao = new ProductDao();
		Product product = dao.saveProduct();
		product.setName("Tshirt");
		product.setBrand("Adidas");
		product.setPrice(50);
		product.setType("RoundNeck");
		product.setSize("medium");
		product.setRating(4);
	

	}

	public void getProductById(int id,Product product) {
		ProductDao dao = new ProductDao();
		
		dao.getProductById(id);
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getBrand());
		System.out.println(product.getPrice());
		System.out.println(product.getType());
		System.out.println(product.getRating());
	}

	public void getProductByBrand(String brand) {
		ProductDao dao = new ProductDao();
		List<Product> products = dao.getProductByBrand(brand);
		if (dao.getProductByBrand(brand).size() > 0) {
			for (Product product : products) {

				System.out.println(product.getId());
				System.out.println(product.getName());
				System.out.println(product.getBrand());
				System.out.println(product.getPrice());
				System.out.println(product.getType());
				System.out.println(product.getRating());
			}
		} else {
			System.out.println("no product found");
		}
	}

	public void getProductByPrice(double price) {
		ProductDao dao = new ProductDao();
		List<Product> products = dao.getProductByPrice(price);
		if (dao.getProductByPrice(price).size() > 0) {
			for (Product product : products) {

				System.out.println(product.getId());
				System.out.println(product.getName());
				System.out.println(product.getBrand());
				System.out.println(product.getPrice());
				System.out.println(product.getType());
				System.out.println(product.getRating());
			}
		} else {
			System.out.println("no product found");
		}
	}

	public void getProductByType(String type) {
		ProductDao dao = new ProductDao();
		List<Product> products = dao.getProductByType(type);
		if (dao.getProductByType(type).size() > 0) {
			for (Product product : products) {

				System.out.println(product.getId());
				System.out.println(product.getName());
				System.out.println(product.getBrand());
				System.out.println(product.getPrice());
				System.out.println(product.getType());
				System.out.println(product.getRating());
			}
		} else {
			System.out.println("no product found");
		}
	}

	public void getProductBySize(String size) {
		ProductDao dao = new ProductDao();
		List<Product> products = dao.getProductByBrand(size);
		if (dao.getProductBySize(size).size() > 0) {
			for (Product product : products) {

				System.out.println(product.getId());
				System.out.println(product.getName());
				System.out.println(product.getBrand());
				System.out.println(product.getPrice());
				System.out.println(product.getType());
				System.out.println(product.getRating());
			}
		} else {
			System.out.println("no product found");
		}
	}

	public void getProductByRating(double rating) {
		ProductDao dao = new ProductDao();
		List<Product> products = dao.getProductByRating(rating);
		if (dao.getProductByRating(rating).size() > 0) {
			for (Product product : products) {

				System.out.println(product.getId());
				System.out.println(product.getName());
				System.out.println(product.getBrand());
				System.out.println(product.getPrice());
				System.out.println(product.getType());
				System.out.println(product.getRating());
			}
		} else {
			System.out.println("no product found");
		}
	}

	public void validateProduct(String name, String brand) {
		ProductDao dao = new ProductDao();
		dao.validateProduct(name, brand);
		
	}

	public Product deleteProductById(int id) {
		ProductDao dao = new ProductDao();

		return dao.deleteProductById(id);
	}

	public void getAllProducts(Product product) {

		ProductDao dao = new ProductDao();
		List<Product> products = dao.getAllProducts();

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
	public Product updateProductById(int id,Product product)
	{
		ProductDao dao = new ProductDao();
//		Product product = new Product();
//		
//		
		return dao.updateProductById(id, product);
		
		
		
	}
}

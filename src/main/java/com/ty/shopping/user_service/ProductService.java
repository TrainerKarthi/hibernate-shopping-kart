package com.ty.shopping.user_service;

import java.util.List;

import com.ty.shopping.dao.ProductDao;
import com.ty.shopping.dto.Product;

public class ProductService {
	
	ProductDao dao = new ProductDao();

	public Product saveProduct(Product product)
	{
		return dao.saveProduct(product);
	}
	public Product getProductById(int id)
	{
		return dao.getProductById(id);
	}
	public Product getProductByBrand(String brand)
	{
		return dao.getProductByBrand(brand);
	}
	public Product getProductByPrice(double price)
	{
		return dao.getProductByPrice(price);
	}
	public Product getProductByType(String type)
	{
		return dao.getProductByType(type);
	}
	public Product getProductBySize(String size)
	{
		return dao.getProductBySize(size);
	}
	public Product getProductByRating(double rating)
	{
		return dao.getProductByRating(rating);
	}
	public List<Product> validateProduct(String name,String brand)
	{
		return dao.validateProduct(name, brand);
	}
	public Product deleteProductById(int id)
	{
		return dao.deleteProductById(id);
	}
	public List<Product> getAllProducts()
	{
		return dao.getAllProducts();
	}
}

package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.Product;

public class ProductDao {
	public Product saveProduct(Product product) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();

		return product;
	}

	public Product getProductById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Product product = entityManager.find(Product.class, id);
//		System.out.println(product.getId());
//		System.out.println(product.getName());
//		System.out.println(product.getBrand());
//		System.out.println(product.getPrice());
//		System.out.println(product.getType());
//		System.out.println(product.getRating());
				return product;
		
	}

	public Product getProductByBrand(String brand) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Product product = entityManager.find(Product.class,brand);
		if (product != null) {
			return product;
		} else {
			return null;
		}
	}

	public Product getProductByPrice(double price) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Product product = entityManager.find(Product.class, price);
		if (product != null) {
			return product;
		} else {
			return null;
		}
	}

	public Product getProductByType(String type) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Product product = entityManager.find(Product.class, type);
		if (product != null) {
			return product;
		} else {
			return null;
		}
	}

	public Product getProductBySize(String size) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Product product = entityManager.find(Product.class, size);
		if (product != null) {
			return product;
		} else {
			return null;
		}
	}

	public Product getProductByRating(double rating) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Product product = entityManager.find(Product.class, rating);
		if (product != null) {
			return product;
		} else {
			return null;
		}
	}

	public List<Product> validateProduct(String name, String brand) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT p FROM Product p WHERE p.name =?1 AND p.brand = ?2";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, name);
		query.setParameter(2, brand);

		List<Product> products = query.getResultList();

		if (products.size() > 0) {
			return products;
		} else {
			System.out.println("No products found");
			return null;
		}
	}

	public List<Product> getAllProducts() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT p FROM Product p ";

		Query query = entityManager.createQuery(sql);

		List<Product> products = query.getResultList();

		return products;
	}
	
	public Product deleteProductById(int id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Product product = entityManager.find(Product.class,id);
		
		if (product != null) {
			entityTransaction.begin();
			entityManager.remove(product);
			entityTransaction.commit();
			
			return product;
		} else {
			
			System.out.println("No product found");
			return null;
		}
	}
	public Product updateProductById(int id,Product product)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		 product = entityManager.find(Product.class, id);
		
		entityTransaction.begin();
		entityManager.merge(product);
		entityTransaction.commit();
		
		return product;
		
	}
}

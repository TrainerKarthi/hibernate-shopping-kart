package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.Product;

public class ProductDao {
	public Product saveProduct() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Product product = new Product();
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();

		return product;
	}

	public Product getProductById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Product product = entityManager.find(Product.class, id);
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getBrand());
		System.out.println(product.getPrice());
		System.out.println(product.getType());
		System.out.println(product.getRating());
		return product;

	}

	public List getProductByBrand(String brand) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT p From Product p WHERE p.brand =?1";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, brand);

		List<Product> products = query.getResultList();
		if (products != null) {
			return products;
		} else {
			System.out.println("NO brand found");
			return null;
		}
	}

	public List<Product> getProductByPrice(double price) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String sql = "SELECT p From Product p WHERE p.price =?1";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, price);

		List<Product> products = query.getResultList();
		if (products != null) {
			return products;
		} else {
			System.out.println("NO brand found");
			return null;
		}

	}

	public List<Product> getProductByType(String type) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT p From Product p WHERE p.type =?1";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, type);

		List<Product> products = query.getResultList();
		if (products != null) {
			return products;
		} else {
			System.out.println("NO brand found");
			return null;
		}
	}

	public List<Product> getProductBySize(String size) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT p From Product p WHERE p.size =?1";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, size);

		List<Product> products = query.getResultList();
		if (products != null) {
			return products;
		} else {
			System.out.println("NO brand found");
			return null;
		}
	}

	public List<Product> getProductByRating(double rating) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String sql = "SELECT p From Product p WHERE p.rating =?1";

		Query query = entityManager.createQuery(sql);
		query.setParameter(1, rating);

		List<Product> products = query.getResultList();
		if (products != null) {
			return products;
		} else {
			System.out.println("NO brand found");
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

	public Product deleteProductById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Product product = entityManager.find(Product.class, id);

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

	public Product updateProductById(int id, Product product) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Product products = entityManager.find(Product.class, id);

		products.setBrand(product.getBrand());
		products.setName(product.getName());
		products.setPrice(product.getPrice());
		products.setRating(product.getRating());

		entityTransaction.begin();
		entityManager.merge(products);
		entityTransaction.commit();

		return product;

	}

}

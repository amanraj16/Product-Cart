package com.capgemini.repo;



import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.bean.Product;

@Transactional
@Repository
public class ProductRepoImpl implements ProductRepo {
	
	@PersistenceContext
	EntityManager entityManager;


	@Override
	public Product saveProduct(Product product) {

		entityManager.persist(product);
	
		return product;
	}

	@Override
	public Product findProduct(String productID) {

		Product product = entityManager.find(Product.class,productID);

		return product;
	}

	@Override
	public Product updateProduct(Product productSearch,Product newProduct) {
	
		productSearch.setProductID(newProduct.getProductID());
		productSearch.setProductName(newProduct.getProductName());
		productSearch.setProductModel(newProduct.getProductModel());
		productSearch.setProductPrice(newProduct.getProductPrice());
		productSearch.setProductQuantity(newProduct.getProductQuantity());
		return newProduct;
	}
	@Override
	public String deleteProduct(String productID) {

		Product product = entityManager.find(Product.class,productID);
		entityManager.remove(product);
		return "Successfully Deleted The Product with id:"+productID;
	}
	
}

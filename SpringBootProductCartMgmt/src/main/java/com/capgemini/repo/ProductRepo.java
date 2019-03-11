package com.capgemini.repo;

import java.util.List;

import com.capgemini.bean.Product;

public interface ProductRepo {
	
	public Product saveProduct(Product product);
	public Product findProduct(String productID);
	public Product updateProduct(Product product,Product newProduct);
	public String deleteProduct(String productID);
}

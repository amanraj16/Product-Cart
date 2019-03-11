package com.capgemini.service;

import com.capgemini.bean.Product;
import com.capgemini.exceptions.ProductIdAlreadyExistException;
import com.capgemini.exceptions.ProductIdDoesNotExistException;

public interface ProductService {

	public Product createProduct(Product product) throws ProductIdAlreadyExistException;
	public Product findProductByID(String productID) throws ProductIdDoesNotExistException;
	public String deleteProductByID(String productID) throws ProductIdDoesNotExistException;
	public Product showProductDetails(String productID) throws ProductIdDoesNotExistException;
	public Product updateProduct(Product product,String productID) throws ProductIdDoesNotExistException;
}

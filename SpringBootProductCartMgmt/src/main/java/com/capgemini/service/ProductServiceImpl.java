package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.Product;
import com.capgemini.exceptions.ProductIdAlreadyExistException;
import com.capgemini.exceptions.ProductIdDoesNotExistException;
import com.capgemini.repo.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductRepo productRepo;

	@Override
	public Product createProduct(Product product) throws ProductIdAlreadyExistException {
		if(productRepo.findProduct(product.getProductID())==null)
		{
			productRepo.saveProduct(product);
			return product;
		}
		else
			throw new ProductIdAlreadyExistException("This Product ID Already Exist");
	}

	@Override
	public Product findProductByID(String productID) throws ProductIdDoesNotExistException {
		Product product = productRepo.findProduct(productID);
		if(product!=null)
			return product;
		else
			throw new ProductIdDoesNotExistException("This Product ID Does Not Exist");
	}

	@Override
	public String deleteProductByID(String productID) throws ProductIdDoesNotExistException {
		Product product = productRepo.findProduct(productID);
		if(product!=null)
		{
			return productRepo.deleteProduct(productID);
		}
		else
			throw new ProductIdDoesNotExistException("This Product ID Does Not Exist");
	}

	@Override
	public Product showProductDetails(String productID) throws ProductIdDoesNotExistException {
		Product product = productRepo.findProduct(productID);
		if(product!=null)
		{
			return product;
		}
		else
			throw new ProductIdDoesNotExistException("This Product ID Does Not Exist");
		}

	public Product updateProduct(Product product,String productID) throws ProductIdDoesNotExistException {
		Product productSearch = productRepo.findProduct(productID);
		if(productSearch!=null)
		{
			return productRepo.updateProduct(productSearch, product);
		}
		else
			throw new ProductIdDoesNotExistException("This Product ID Does Not Exist");
	}
	

	

}

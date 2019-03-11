package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Product;
import com.capgemini.exceptions.ProductIdAlreadyExistException;
import com.capgemini.exceptions.ProductIdDoesNotExistException;
import com.capgemini.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value="/addProduct", method=RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) throws ProductIdAlreadyExistException
	{
		product = productService.createProduct(product);
		return product;
	}
	@RequestMapping(value="/deleteProduct/{id}",method=RequestMethod.DELETE)
	public String deleteProduct(@PathVariable String id) throws ProductIdDoesNotExistException
	{
		return productService.deleteProductByID(id);
		
	}
	@RequestMapping(value="/updateProduct/{productID}",method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product,@PathVariable String productID) throws ProductIdDoesNotExistException
	{
		
		return productService.updateProduct(product,productID);	
	}
	@RequestMapping(value="/productDetails/{productID}",method=RequestMethod.GET)
	public Product productDetails(@PathVariable String productID) throws ProductIdDoesNotExistException
	{
		return productService.showProductDetails(productID);
	}
}

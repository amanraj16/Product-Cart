package com.capgemini.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {

		@Id
		private String productID;
		
		@Column
		private String productName;
		
		@Column
		private String productModel;
		
		@Column
		private double productPrice;
		
		@Column
		private int productQuantity;

		public String getProductID() {
			return productID;
		}

		public void setProductID(String productID) {
			this.productID = productID;
		}

		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(String productID, String productName, String productModel, double productPrice,
				int productQuantity) {
			super();
			this.productID = productID;
			this.productName = productName;
			this.productModel = productModel;
			this.productPrice = productPrice;
			this.productQuantity = productQuantity;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getProductModel() {
			return productModel;
		}

		public void setProductModel(String productModel) {
			this.productModel = productModel;
		}

		public double getProductPrice() {
			return productPrice;
		}

		public void setProductPrice(double productPrice) {
			this.productPrice = productPrice;
		}

		public int getProductQuantity() {
			return productQuantity;
		}

		public void setProductQuantity(int productQuantity) {
			this.productQuantity = productQuantity;
		}
}

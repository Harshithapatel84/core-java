class StoreProduct{
	Product[] products;
	int curtIndex;
	
	StoreProduct(Product[] products)
	{
		this.products=products;
	}
	
	void add(Product product)
	{
		if(this.products!=null)
		{
			if(product!=null)
			{
				int index=this.products.length-1;
				if(curtIndex<=index)
				{
					this.products[curtIndex]=product;
					this.curtIndex++;
				}
			}
		}
		else
		{
			System.out.println("no product to store");
		}
	}
	boolean getDetailsByProductId(String productId)
	{
		if(this.products!=null)
		{
			if(productId!=null)
			{
				for(Product product:this.products)
				{
					if(product!=null)
					{
					System.out.println("product:"+product.productId);
					if(product.productId == productId)
					{
						System.out.println("product id is matching");
						return true;
					}
				}
				}
			}
		}
		else{
			System.out.println("no product id to display");
			}
			return false;
	}
	boolean ProductPriceByProductName(String name)
	{
		System.out.println("executing the product price by product name");
		{
			if(this.products!=null  && name!=null)
			{
				for(Product product:this.products)
				{
					if(product!=null)
					{
						System.out.println("product name is:");
						if(product.productName == name)
						{
							System.out.println("price:"+product.price);
							return true;
						}
					}
				}
			}
			else{
				System.out.println("no product to store");
			}
			return false;
		}
	}
	boolean getProductName(String companyName)
	{
		System.out.println("executing to get the product name by company name");
		if(products!=null && companyName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(product.productNameCompany == companyName)
					{
					  System.out.println("product name:"+product.productName);
					  return true;
					}
				}
			}
		
		}
		else
		{}
	  return false;
	}
	boolean getCompanyName(String productName)
	{
		System.out.println("get the company name by product name");
		if(products!=null && productName!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(product.productName == productName)
					{
						System.out.println("company name:"+product.productNameCompany);
						return true;
					}
				}
			}
		}
		else{}
		return false;
	}
	
	boolean getManuFAndExpDate(String name)
	{
		System.out.println("executing to get the expiry and manufacture date by name");
		if(this.products!=null && name!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(product.productName == name)
					{
						System.out.println("manufacture date & expiry date:"+product.manufactureDate );
						System.out.println(product.expDate);
					     return true;
					}
				}
			}
		}
		else{}
		return false;
	}
	
	boolean update(String name,double newPrice)
	{
		System.out.println("executing to update the price by product name");
		if( this.products!=null )
		{
			if(name!=null)
			{
				for(Product product:this.products)
				{
					if(product!=null)
					{
						if(product.productName == name)
						{
							product.price = newPrice;
							System.out.println("updated price:"+product.price);
							return true;
						}
					}
				}
			}
		}
		else
		{
			System.out.println("cannot update.......");
		}
		return false;
	}
	boolean updateManufactureAndExpiryDate(String name,int manu,int exp)
	{
		if(this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(product.productName == name)
					{
						product.manufactureDate=manu;
						product.expDate=exp;
						System.out.println("updated dates:"+product.manufactureDate);
						System.out.println("updated dates:"+product.expDate);
						return  true;
					}
				}
			}
		}
		else{}
		return false;
	}
	boolean getManufaDate(String name)
	{
		if(products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(product.productName == name)
						System.out.println(product.manufactureDate);
					return true;
				}
			}
		}
		else{}
		return false;
	}
	
	boolean getExpDate(String name)
	{
		if(products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(product.productName == name)
						System.out.println(product.expDate);
					return true;
				}
			}
		}
		else{}
		return false;
	}
	
	boolean getProductName(ProductType type)
	{
		System.out.println("executing to get the product type by name");
		{
			if(this.products!=null && type!=null)
			{
				for(Product product:this.products)
				{
					if(product!=null)
					{
						if(product.type == type)
						System.out.println(product.productName);
					    return true;
					}
				}
			}
			return false;
		}
	}
	
	boolean delete(String name)
	{
		System.out.println("executing to delete the product");
		if(this.products!=null)
		{
			int i=0;
			for(Product product:this.products)
			{
				if(product!=null)
				{
					if(product.productName==name)
						products[i]=null;
					    return true;
				}
			}
		}
		return false;
	}
	
	
}


	
	
	
	

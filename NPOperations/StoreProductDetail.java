class StoreProductDetail{
	Product[] products;
	int curtIndex;
	
	StoreProductDetail(Product[] products)
	{
		this.products=products;
	}
	void save(Product product)
	{
		System.out.println("executing to store the product details..");
		if(this.products!=null && product!=null)
		{
			int index=this.products.length-1;
			if(curtIndex<=index)
			{
				this.products[curtIndex]=product;
				this.curtIndex++;
				product.printInfo();
			}
		}
		else
		{
			System.out.println("no product to store");
		}
	}
	
	void save(Product[] products) {
		System.out.println("Executing save for multiple products...");
		if (this.products != null && products != null) {
			for (Product product : products) {
				if (curtIndex < 10) 
				{   
                this.products[curtIndex] = product;
                this.curtIndex++;
                product.printInfo();
                } 
            else {
                System.out.println("Cannot store more than 10 products");
                break;
                 }
				}
		 } else {
                System.out.println("No products to store");
            }
    }
	
    boolean searchByUniqueID(String prID)
	{
		System.out.println("executing the searby UniqueId in product..");
		if(this.products!=null && prID!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					System.out.println("checking the id matching:"+product.uniqueId);
					if(product.uniqueId == prID )
					{
						System.out.println("product is matching");
						return true;
					}
					
				}
			}
		}
		else{
			System.out.println("product is null,cannot search");
		}
		return false;
	}
	
	boolean searchByIdAndName(String uniqueId,String name)
	{
		System.out.println("executing to product by uniqueId and name");
		if(this.products!=null && uniqueId!=null && name!=null)
		{
			
			for(Product product:this.products)
			{
				if(product!=null)
				{
	                System.out.println("checking the id and name matching:"+product.uniqueId+","+product.name);
					if(product.uniqueId == uniqueId && product.name == name)
					{
					System.out.println("product id and name is matching");
					System.out.println("------------------------------------------------");
					product.printInfo();
					return true;
					}
				}
			}
		}
		else
		{
			System.out.println("product is null cannot search");
		}
		return false;
	}
	
	boolean searchByIDAndNameAndOriginCountry(String id,String name,String originCountry)
	{
		System.out.println("executing the product by name, UniqueId anf orogincountry");
		if(this.products!=null && id!=null && name!=null && originCountry!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
					System.out.println("check with conditions: " + product.uniqueId + " , " 
                    + product.name + " , " + product.originCountry);
					if(product.uniqueId == id && product.name == name && product.originCountry ==
					originCountry)
					{
						System.out.println("-----------match found-------------------");
						product.printInfo();
						return true;
					}
				}
			}
		}
		else
		{
			System.out.println("product is not null,cannot search");
		}
		return false;
	}
	
	void getAllCountry()
	{
		System.out.println("executing to display all the origin country");
		if(this.products!=null)
		{
			for(Product product:this.products)
			{
				if(product!=null)
				{
						System.out.println("product origin country:"+product.originCountry);
						
				}
			}
		}
		else{
			System.out.println("country is null, cannot search");
		}
	}
	
	boolean checkWarrantyById(String uniqueId)
   {
    System.out.println("executing to get the warranty expiration by unique id");

    if(this.products!=null && uniqueId!=null)
    {
        for(Product product:this.products)
        {
            if(product!=null)
            {
                if(product.uniqueId == uniqueId)
                {
                    if(product.warrantyExpired)
                    {
                        System.out.println("Warranty is expired");
						return true;
                    }
                    else
                    {
                        System.out.println("Warranty is valid");
                    }
                    
                }
            }
        }
    }
    else
    {
        System.out.println("product or id is null");
    }
    return false;
   }

        boolean getAllByType(ProductType type)
         {
            System.out.println("executing get all by type...");
			if(this.products!=null && type!=null)
			{
				boolean found=false;
			    for(Product product:this.products)
				{
					if(product!=null)
					{
						if(product.type == type)
						{
							product.printInfo();
							found=true;
						}
                    }
                }
            }
	        else
	        {
		    System.out.println("it is null,cannot get type");
	        }
			return false;
		}
		
		boolean getAllByWarrantyYear(WarrantyYear year)
		{
			System.out.println("executing get all by warranty year...");
			if(this.products!= null && year!= null)
			{
				boolean found=false;
				for(Product product:this.products)
				{
                if(product!= null)
				{
                    if(product.year == year)
                    {
                    product.printInfo();
                    found=true;
                    }
                }
            }
            return found;		
	        }		 
             else
            {
                 System.out.println("products or warranty year is null");
            }
	        return false;
		}
}
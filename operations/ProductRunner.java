class ProductRunner{
	public static void main(String... values)
	{
		Product[] product=new Product[3];
		StoreProduct storeProduct=new StoreProduct(product);
	
	    Product pr=new Product("B123","Parle-G",12,04,500.0,4,ProductType.GROCERY,"buiscket");
		Product pr1=new Product("MILK78","Nandini",28,10,650,2,ProductType.DAIRY,"mlik");
		Product pr2=new Product("F45","Usha",13,02,5000,8,ProductType.ELECTRONICS,"fan");
		storeProduct.add(pr);
		storeProduct.add(pr1);
		storeProduct.add(pr2);
		
		System.out.println("=========================================================");
		
		boolean productId=storeProduct.getDetailsByProductId("MILK78");
		System.out.println(productId);
		
		System.out.println("=========================================================");
		
		boolean product1=storeProduct.ProductPriceByProductName("mlik");
		System.out.println(product1);
		
		System.out.println("=========================================================");
		
		boolean productname=storeProduct.getProductName("Nandini");
		System.out.println(productname);
		
	    System.out.println("=========================================================");
		
		boolean productcompanyName=storeProduct.getCompanyName("fan");
		System.out.println(productcompanyName);
		
		System.out.println("=========================================================");
		
		boolean expdate=storeProduct.getManuFAndExpDate("buiscket");
		System.out.println(expdate);
		
		System.out.println("=========================================================");
		 
		 boolean update=storeProduct.update("buiscket",100);
		 System.out.println(update);
		 
		 System.out.println("=========================================================");
		 
		boolean update1=storeProduct.updateManufactureAndExpiryDate("buiscket",31,20);
	    System.out.println(update1);
		
		System.out.println("=========================================================");
		 
		boolean getmanuDate=storeProduct.getManufaDate("buiscket");
	    System.out.println(getmanuDate);
       
		System.out.println("=========================================================");
		  
		boolean getExpDate=storeProduct.getExpDate("buiscket");
	    System.out.println(getExpDate);
		
		System.out.println("=========================================================");
		
		boolean getProductType=storeProduct.getProductName(ProductType.DAIRY);
	    System.out.println(getProductType);
		
		boolean deleteByName=storeProduct.delete("fan");
	    System.out.println(deleteByName);
		
	}
}

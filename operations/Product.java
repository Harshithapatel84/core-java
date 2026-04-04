class Product{
	String productId;
	String productNameCompany;
	int manufactureDate;
	int expDate;
	double price;
	double weightInGram;
	ProductType type;
	String productName;
	
	
	Product(String productId,String productNameCompany,int manufactureDate,int expDate,double price,double weightInGram,ProductType type,String productName)
	{
		this.productId=productId;
		this.productNameCompany=productNameCompany;
		this.manufactureDate=manufactureDate;
		this.expDate=expDate;
		this.price=price;
		this.weightInGram=weightInGram;
		this.type=type;
		this.productName=productName;
		
		System.out.println("product id:"+this.productId+",productNameCompany:"+this.productNameCompany+
	   ",manufactureDate:"+this.manufactureDate+",expDate:"+this.expDate+",price:"+this.price+",weightInGram:"+this.weightInGram+
	   ",type:"+this.type+",product name:"+this.productName);
	   
	}
	
	
}

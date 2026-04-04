class Product{
	String name;
	int mfgDate;
	double cost;
	String seller;
	boolean warrantyExpired;
	String uniqueId;
	String originCountry;
	ProductType type;
	WarrantyYear year;
	
	Product(String name,int mfgDate,double cost,String seller,boolean warrantyExpired,
	String uniqueId,String originCountry,ProductType type,WarrantyYear year)
	{
		this.name=name;
		this.mfgDate=mfgDate;
		this.cost=cost;
		this.seller=seller;
		this.warrantyExpired=warrantyExpired;
		this.uniqueId=uniqueId;
		this.originCountry=originCountry;
		this.type=type;
		this.year=year;
	}
	void printInfo()
	{
		System.out.println("product name:"+this.name+",manufacture date:"+this.mfgDate+",cost:"+this.cost
		);
		System.out.println("seller:"+this.seller+",warrantyExpired:"+this.warrantyExpired+",uniqueId:"+this.uniqueId);
		System.out.println("originCountry:"+this.originCountry+",product type:"+this.type+",warranty year:"+year);
	}
	
	
	
	
	
}
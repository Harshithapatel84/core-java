class Dmart{
	String location;
	Product product;
	Section type;
	Dmart(String location,Product product,Section type)
	{
		this.location=location;
		this.product=product;
		this.type=type;
	}
	void showData()
	{
		System.out.println("dmart location:"+this.location );
		if(this.product!=null)
		{
			this.product.getInfo();
		}
		if(type!=null)
		{
			System.out.println("section type:"+this.type);
		}
	}
	
	
}
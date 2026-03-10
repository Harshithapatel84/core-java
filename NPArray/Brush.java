class Brush{
	String brushType;
	double price;
	
	Brush(String brushType,double price)
	{
		this.brushType=brushType;
		this.price=price;
	}
	void getInfo()
	{
		System.out.println("brush type:"+this.brushType);
		System.out.println("brush price:"+this.price);
	}
}
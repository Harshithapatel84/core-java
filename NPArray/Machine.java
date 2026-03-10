class Machine{
	String location;
	double price;
	
	Machine(String location,double price)
	{
		this.location=location;
		this.price=price;
	}
	void printData()
	{
		System.out.println("manufacture location:"+this.location);
		System.out.println("executing the printer machine price:"+this.price);
	}
}
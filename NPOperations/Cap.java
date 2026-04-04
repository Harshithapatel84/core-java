class Cap{
	String brand;
	double price;
	String color;
	String material;
	int quantity;
	
	Cap(String brand,double price,String color,String material,int quantity)
	{
		this.brand=brand;
		this.price=price;
		this.color=color;
		this.material=material;
		this.quantity=quantity;
	}
	void printInfo()
	{
		System.out.println("executing the cap with details..");
		System.out.println("cap brand:"+this.brand+",price:"+this.price+",color:"+this.color+",material:"+this.material+
		",quantity:"+this.quantity);
	}
}
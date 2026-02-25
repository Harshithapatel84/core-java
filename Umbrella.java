class Umbrella{
	String color;
	double price;
	boolean open;
	String material;
	boolean useful;
	
	Umbrella(){
		
	}
	Umbrella(String color,double price,boolean open,String material,boolean useful){
		this.color=color;
		this.price=price;
		this.open=open;
		this.material=material;
		this.useful=useful;
	}
	Umbrella(String color){
	 this.color=color;	
	}
	Umbrella(String color,double price)
	{
		this.color=color;
		this.price=price;
	}
	Umbrella(double price,String material)
	{
	this.price=price;
	this.material=material;
	}
	Umbrella(boolean useful){
		this.useful=useful;
	}
}
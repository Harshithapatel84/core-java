class HairDryer{
	String brand;
	double cost;
	boolean warranty;
	String  version;
	String color;
	
	HairDryer(String brand,double cost,	boolean warranty,String  version,String color){
		this.brand=brand;
		this.cost=cost;
		this.warranty=warranty;
		this.version=version;
		this.color=color;
	}
	HairDryer(){
		
	}
	HairDryer(String brand,double cost)
	{
		this.brand=brand;
		this.cost=cost;
	}
	HairDryer(String brand,boolean warranty){
		this.brand=brand;
		this.warranty=warranty;
	}
	HairDryer(String color){
		this.color=color;
	}
	HairDryer(double cost,String color){
		this.cost=cost;
		this.color=color;
		
	}
	
}
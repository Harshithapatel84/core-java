class Drop{
	String type;
	double weight;
	String color;
	String shape;
	boolean evaporate;
	
	
	Drop(){
		
	}
	
	Drop(String type,double weight,String color,String shape,boolean evaporate)
	{
		this.type=type;
		this.color=color;
		this.weight=weight;
		this.shape=shape;
		this.evaporate=evaporate;
	}
	Drop(String type,double weight)
	{
		this.type=type;
		this.weight=weight;
	}
	Drop(String color,boolean evaporate,String type)
	{
		this.type=type;
		this.evaporate=evaporate;
		this.color=color;
	}
	Drop(String type)
	{
		this.type=type;
	}
	Drop(double weight,String color){
		this.color=color;
		this.weight=weight;
	}
}
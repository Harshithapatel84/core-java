class Snow{
	String color;
	String locationOfSnowAvailable;
	double weight;
	boolean seasonal;
	int noOfPlace;
	
	Snow(){
		
	}
	
	Snow(String color,String locationOfSnowAvailable,double weight,boolean seasonal,int noOfPlace){
		this.color=color;
		this.locationOfSnowAvailable=locationOfSnowAvailable;
		this.weight=weight;
		this.seasonal=seasonal;
		this.noOfPlace=noOfPlace;
	}
	Snow(String locationOfSnowAvailable){
		this.locationOfSnowAvailable=locationOfSnowAvailable;
	}
	Snow(String locationOfSnowAvailable,double weight){
		this.locationOfSnowAvailable=locationOfSnowAvailable;
		this.weight=weight;
	}
	Snow(boolean seasonal,int noOfPlace )
	{
		this.seasonal=seasonal;
		this.noOfPlace=noOfPlace;
	}
	Snow(int noOfPlace)
	{
		this.noOfPlace=noOfPlace;
	}
}

class Aquarium{
	int noOfFish;
	double temp;
	boolean light;
	double width;
	String material;
	Fish fish;
	Water water;
	Glass glass;
	Plant plant;
	Stone stone;
	
	Aquarium(int noOfFish,double temp,
	boolean light,double width,String material,Fish fish,Water water,Glass glass,Plant plant,Stone stone)
	{
		this.noOfFish=noOfFish;
		this.temp=temp;
		this.light=light;
		this.width=width;
		this.material=material;
		this.fish=fish;
		this.water=water;
		this.glass=glass;
		this.plant=plant;
		this.stone=stone;
	}
	void display()
	{
		System.out.println("no of fish:"+this.noOfFish+",temperature:"+this.temp+",light:"+this.light+",width:"+this.width+",material:"+this.material);
        if(this.fish!=null)
		{
			this.fish.getInfo();
		}	
        if(this.water!=null)
		{
			this.water.getDetails();
		}	
        if(this.glass!=null)
		{
			this.glass.showData();
		}			
	    if(this.plant!=null)
		{
		   this.plant.printDetails();
		}
        if(this.stone!=null)
		{
			this.stone.display();
		}
}
}
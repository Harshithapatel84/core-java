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
}
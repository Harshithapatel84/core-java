class Pumpkin{
	String color;
	Farm farm;
	PumpkinColor shade;
	
	Pumpkin(String color,Farm farm,PumpkinColor shade)
	{
		this.color=color;
		this.farm=farm;
		this.shade=shade;
	}
	void printInfo()
	{
		System.out.println("pumpkin color:"+this.color);
		if(farm!=null)
		{
			System.out.println("pumpkin price:"+this.farm.price);
		}
		if(shade!=null)
		{
			System.out.println("shades:"+this.shade);
		}
	}
	
}
class Walnut{
	double weight;
	Garden garden;
	WalnutType type;
	
	Walnut(double weight,Garden garden,WalnutType type)
	{
		this.weight=weight;
		this.garden=garden;
		this.type=type;
	}
	void printInfo()
	{
		System.out.println("walnut weight:"+this.weight);
		if(garden!=null)
		{
			System.out.println("garden location:"+this.garden.location);
		}
		if(type!=null)
		{
			System.out.println("walnut type:"+this.type);
		}
	}
}
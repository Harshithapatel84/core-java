class Paneer{
	double weight;
	Brand brand;
	PaneerType type;
	
	Paneer(double weight,Brand brand,PaneerType type)
	{
		this.weight=weight;
		this.brand=brand;
		this.type=type;
	}
	void printInfo()
	{
		System.out.println("paneer weight:"+this.weight);
		if(brand!=null)
		{
			System.out.println("brand:"+this.brand.name);
		}
		if(type!=null)
		{
			System.out.println("paneer type:"+this.type);
		}
	}
}
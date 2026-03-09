class Horlicks{
	int quantity;
	Manufacture manufacture;
	FlavorType flavor;
	
	Horlicks(int quantity,Manufacture manufacture,FlavorType flavor)
	{
		this.quantity=quantity;
		this.manufacture=manufacture;
		this.flavor=flavor;
	}
	void printInfo()
	{
		System.out.println("horlicks quantity:"+this.quantity);
		if(manufacture!=null)
		{
			System.out.println("company name:"+this.manufacture.name);
		}
		if(flavor!=null)
		{
			System.out.println("flavor:"+this.flavor);
		}
	}
}
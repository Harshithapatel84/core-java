class Mushroom{
	int quantity;
	FarmHouse farmhouse;
	MushroomType type;
	
	Mushroom(int quantity,FarmHouse farmhouse,MushroomType type)
	{
		this.quantity=quantity;
		this.farmhouse=farmhouse;
		this.type=type;
	}
	void printInfo()
	{
		System.out.println("mushroom quantity:"+this.quantity);
		if(farmhouse!=null)
		{
			System.out.println("farmhouse location:"+this.farmhouse.location);
		}
		if(type!=null)
		{
			System.out.println("mushroom type:"+this.type);
		}
	}
}
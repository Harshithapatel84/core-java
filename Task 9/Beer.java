class Beer{
	boolean strong;
	Location location;
	BeerType type;
	
	Beer(boolean strong,Location location,BeerType type)
	{
		this.strong=strong;
		this.location=location;
		this.type=type;
	}
	void printInfo()
	{
		System.out.println("is strong:"+this.strong);
		if(location!=null)
		{
			System.out.println("manufacture location:"+this.location.place);
		}
		if(type!=null)
		{
			System.out.println("beer type:"+this.type);
		}
	}
}
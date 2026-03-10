class Tower
{
	String[] locations;
	Network[] networks;
	
	Tower(String[] locations,Network[] networks)
	{
		this.locations=locations;
		this.networks=networks;
	}
	void display()
	{
		System.out.println("executing the tower locations...");
		if(this.locations!=null)
		{
			System.out.println("total tower:"+this.locations.length);
			for(String location:locations)
			{
				System.out.println("locations:"+location);
			}
		}
		if(networks!=null)
		{
			System.out.println("total network:"+this.networks.length);
			for(Network network:networks)
			{
				network.getInfo();
			}
		}
	}
}
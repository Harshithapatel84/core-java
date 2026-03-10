class Jamoon{
	String[] ingredients;
	Packet[] packets;
	
	Jamoon(String[] ingredients,Packet[] packets)
	{
		this.ingredients=ingredients;
		this.packets=packets;
	}
	void display()
	{
		System.out.println("executing the ingredients of jamoon");
		if(this.ingredients!=null)
		{
			System.out.println("total ingredients:"+this.ingredients.length);
			for(String ingredient:ingredients)
			{
				System.out.println("Ingredients:"+ingredient);
			}
		}
		if(this.packets!=null)
		{
			System.out.println("total no:"+this.packets.length);
			for(Packet pack:packets)
			{
				pack.getInfo();
			}
		}
	}
	
}
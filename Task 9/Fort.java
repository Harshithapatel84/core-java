class Fort{
	String name;
	History history;
	Region division;
	
	Fort(String name,History history,Region division)
	{
		this.name=name;
		this.history=history;
		this.division=division;
	}
	void printInfo()
	{
		System.out.println("fort name:"+this.name);
		if(history!=null)
		{
			this.history.getInfo();
		}
		if(division!=null)
		{
			System.out.println("devision:"+this.division);
		}
			
	}
	
}
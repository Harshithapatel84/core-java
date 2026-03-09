class Parliament{
     int member;
     State state;
	 PoliticalParty type;
	 
	Parliament(int member,State state, PoliticalParty type)
	{
		this.member=member;
		this.state=state;
		this.type=type;
	}
	void printInfo()
	{
		System.out.println("parliament members:"+this.member);
		if(this.state!=null)
		{
			this.state.getInfo();
		}
		if(type!=null)
		{
		System.out.println("party type:"+this.type);
		}
	}
	
}
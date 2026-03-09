class Court{
	int noOfJudge;
	Lawyer lawyer;
	CourtType type;
	
	Court(int noOfJudge,Lawyer lawyer,CourtType type)
	{
		this.noOfJudge=noOfJudge;
		this.lawyer=lawyer;
		this.type=type;
	}
	void printInfo()
    {
		System.out.println("no of judges in court:"+this.noOfJudge);
		if(this.lawyer!=null)
		{
			System.out.println("lawyer name:"+this.lawyer.name);
		}
		if(type!=null)
		{
			System.out.println("court type:"+this.type);
		}
	}
}
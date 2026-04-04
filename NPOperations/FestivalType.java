class FestivalType{
	Festival[] festivals;
	int curtIndex=0;
	
	FestivalType(Festival[] festivals)
	{
		this.festivals=festivals;
	}
	void save(Festival festival)
	{
		if(festival!=null && this.festivals!=null)
		{
			System.out.println("festival is not null....");
			int index=this.festivals.length-1;
			if(curtIndex<=index)
			{
				this.festivals[curtIndex]=festival;
				this.curtIndex++;
				festival.showInfo();
			}
			else
			{
				System.out.println("festival name is null");
			}
		}
		else
		{
			System.out.println("it is null....");
		}
	}
}
class Calendar{
	String country;
	Year year;
	Season month;
	
	Calendar(String country,Year year,Season month)
	{
		this.country=country;
		this.year=year;
		this.month=month;
	}
	void printInfo()
	{
		System.out.println("calendar country:"+this.country);
		if(year!=null)
		{
			System.out.println("year:"+this.year.year);
		}
		if(month!=null)
		{
			System.out.println("month:"+this.month);
		}
	}
}
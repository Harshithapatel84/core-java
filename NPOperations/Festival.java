class Festival{
	String name;
	int date;
	String religion;
	
	Festival(String name,int date,String religion)
	{
		this.name=name;
		this.date=date;
		this.religion=religion;
	}
	void showInfo()
	{
		System.out.println("executing the festival.....");
		System.out.println("name:"+this.name);
		System.out.println("date:"+this.date);
		System.out.println("religion:"+this.religion);
		
	}
}
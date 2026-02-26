class StadiumCreator{
	static void getInfo()
	{
	Stadium stadium= new Stadium("Cricket stadium");
	System.out.println("stadium sport type:"+stadium.type);
	System.out.println("executing the stadium type");
	}
	
	static void getInfo( String type)
	{
		Stadium stadium=new Stadium(type);
		System.out.println("stadium type:"+stadium.type);
		System.out.println("creating the stadium type with name arg");
	}
	static void getInfo(String type,int seatingCapacity)
	{
		Stadium stadium=new Stadium(type,seatingCapacity);
		System.out.println("stadium type is:"+stadium.type);
		System.out.println("stadium seat capacity is:"+stadium.seatingCapacity);
		System.out.println("executing the stadium type with type and seating capacity args");
	}
}
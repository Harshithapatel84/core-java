class MusuemCreator{
	static void getInfo()
	{
		System.out.println("executing the musuem");
		Musuem musuem=new Musuem("Indian Musuem");
		System.out.println(" musuem name is:"+musuem.name);
		System.out.println("executing the name of the musuem");
	}
	
	static void getInfo(String name)
	{
		Musuem musuem=new Musuem(name);
		System.out.println(" musuem name is:"+musuem.name);
		System.out.println("executing the name of the musuem with args");
	
	}
	static void getInfo(String name,String location)
	{
		Musuem musuem=new Musuem(name,location);
		System.out.println(" musuem name is:"+musuem.name);
		System.out.println(" musuem location is:"+musuem.location);
		System.out.println("executing the name and location of the musuem with args");
	
	}
	
}
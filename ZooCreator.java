class ZooCreator{
	static void getZooInfo()
	{
		Zoo zoo=new Zoo("Bhannerghatta Abhayaranya");
		System.out.println("executing the zoo with name");
		System.out.println("Zoo name:"+zoo.name);
		System.out.println();
	}
	
	static void getZooInfo(String name)
	{
	Zoo zoo=new Zoo(name);
	System.out.println("Zoo name is:"+zoo.name);
	System.out.println("executing the zoo name with arg");
	}
	
	static void getZooInfo(String name,int noOfAnimal)
	{
	Zoo zoo=new Zoo(name,noOfAnimal);
	System.out.println("Zoo name is:"+zoo.name);
	System.out.println("Zoo name is:"+zoo.noOfAnimal);
	System.out.println("executing the zoo name with no of animal args");
	}
	
}
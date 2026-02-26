class MusuemRunner{
	public static void main(String... values)
	{
		MusuemCreator.getInfo();
		MusuemCreator.getInfo("National musuem");
		MusuemCreator.getInfo("British musuem","London");
		
		System.out.println("===========================================");
		
		ZooCreator.getZooInfo();
		ZooCreator.getZooInfo("mysore zoo");
		ZooCreator.getZooInfo("mysore zoo",100);
		
		System.out.println("===========================================");
		
		StadiumCreator.getInfo();
		StadiumCreator.getInfo("Tennis");
		StadiumCreator.getInfo("Foot Ball",70000);
		
		
	}
	
	
}
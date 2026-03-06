class MouseRunner{
	public static void main(String... values)
	{
		Light light = new Light(true);
		if(light!=null){
		light.display();
		}
		Button button = new Button(3,"black");
		if(button!=null){
		button.displayInfo();
		}
		Cable cable = new Cable(5.3);
		if(cable!=null){
		cable.getInfo();
		}
		Chip chip = new Chip(true);
		if(chip!=null){
		chip.getDetails();
		}
		Cursor cursor = new Cursor(6);
		if(cursor!=null){
		cursor.displayDetails();
		}
		Mouse mouse = new Mouse("hp",500,true,"hp company",8,light,button,cable,cursor,chip);
		if(mouse!=null){
	    mouse.displayDetials();
		}
		
		System.out.println("========================================================================");
		
		Memory memory=new Memory(128);
		if(memory!=null){
		memory.printDetails();
		}
		Location location=new Location("win/desktop/....","C drive");
		if(location!=null){
		location.getInfo();
		}
		else
		{
			System.out.println("there is no location path");
		}
		BackUp backUp= new BackUp(true,"12/5/26");
		if(backUp!=null){
		backUp.getDetails();
		}
		Extension extension=new Extension("html","used for frontend");
		if(extension!=null){
		extension.showData();
		}
		Permission permission=new Permission(false,true);
		if(permission!=null){
		permission.showDetails();
		}
		File file=new File("internship",56,128,true,"U87",memory,location,backUp,extension,permission);
		if(file!=null)
		{
	    file.getInfo();
		}
		
		System.out.println("========================================================================");
		
		Gear gear=new Gear(3);
		Wire wire=new Wire("white & green");
		CoolingFan coolingFan=new CoolingFan(true);
		Shaft shaft=new Shaft(4);
		Battery battery=new Battery(true);
		Motor motor=new Motor("Bosch",1600,5600,true,3000,gear,wire,coolingFan,null,battery);
		motor.showDetails();
	
	    System.out.println("========================================================================");
		
		Fish fish=new Fish("red");
		Water water=new Water(5.5);
		Plant plant=new Plant(1.2,10);
		Glass glass=new Glass("visible pure glass");
		Stone stone=new Stone("small");
		Aquarium aquarium=new Aquarium(8,12.5,false,46.3,"glass",fish,water,glass,plant,stone);
		aquarium.display();
		
		System.out.println("========================================================================");
		
		Ball ball=new Ball(16);
		Ampire ampire=new Ampire("nitin");
		Stadium stadium=new Stadium("Bangalore");
		Player player=new Player(11);
		Sponser sponser=new Sponser("vivo");
		Ipl ipl=new Ipl("RCB","CSK",5,122,"RCB",ball,ampire,stadium,player,sponser);
	    ipl.getInfo();
		  
		
	}
}
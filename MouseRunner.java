class MouseRunner{
	public static void main(String... values)
	{
		Light light = new Light();
		Button button = new Button(3,"black");
		Cable cable = new Cable(5.3);
		Chip chip = new Chip();
		Cursor cursor = new Cursor(6);
		Mouse mouse = new Mouse("hp",500,true,"hp company",8,light,button,cable,cursor,chip);
		System.out.println("brand:"+mouse.brand);
		System.out.println("price:"+mouse.price);
		System.out.println("Drag:"+mouse.drag);
		System.out.println("manufacture company:"+mouse.manufacture);
		System.out.println("No Of Mouse:"+mouse.noOfMouse);
		System.out.println("light:"+mouse.light);
		System.out.println("no of button:"+mouse.button.noOfButton);
		System.out.println("no of button:"+mouse.button.color);
		System.out.println("length:"+mouse.cable.length);
		System.out.println("warranty:"+mouse.chip);
		System.out.println("cursor:"+mouse.cursor.noOfMove);
		
		System.out.println("========================================================================");
		
		Memory memory=new Memory(128);
		Location location=new Location("win/desktop/....","C drive");
		BackUp backUp= new BackUp(true,"12/5/26");
		Extension extension=new Extension("html","used for frontend");
		Permission permission=new Permission(false,true);
		File file=new File("internship",56,128,true,"U87",memory,location,backUp,extension,permission);
		System.out.println("file name:"+file.name);
		System.out.println("file size:"+file.size);
		System.out.println("file storage:"+file.storage);
		System.out.println("space:"+file.space);
		System.out.println("user Id:"+file.userId);
		System.out.println("memory:"+file.memory.size);
		System.out.println("location:"+file.location.path);
		System.out.println("location:"+file.location.driveName);
		System.out.println("back up available:"+file.backUp.backUpDate);
		System.out.println("back up available:"+file.backUp.backupAvailabe);
		System.out.println("file extension:"+file.extension.description);
		System.out.println("permossion:"+file.permission.edit);
		System.out.println("permossion:"+file.permission.read);
		
		System.out.println("========================================================================");
		
		Gear gear=new Gear(3);
		Wire wire=new Wire("white & green");
		CoolingFan coolingFan=new CoolingFan(true);
		Shaft shaft=new Shaft(4);
		Battery battery=new Battery(true);
		Motor motor=new Motor("Bosch",1600,5600,true,3000,gear,wire,coolingFan,shaft,battery);
		System.out.println("motor company:"+motor.companyName);
		System.out.println("price:"+motor.price);
		System.out.println("capacity:"+motor.capacity);
		System.out.println("is automatic:"+motor.automatic);
		System.out.println("rpm:"+motor.rpm);
		System.out.println("gear:"+motor.gear.noOfGear);
		System.out.println("wire:"+motor.wire.color);
		System.out.println("cooling fan:"+motor.coolingFan.fan);
		System.out.println("shaft:"+motor.shaft.noOfShaft);
		System.out.println("battery:"+motor.battery.working);
		
		
		System.out.println("========================================================================");
		
		Fish fish=new Fish("red");
		Water water=new Water(5.5);
		Plant plant=new Plant(1.2,10);
		Glass glass=new Glass("visible pure glass");
		Stone stone=new Stone("small");
		Aquarium aquarium=new Aquarium(8,12.5,false,46.3,"glass",fish,water,glass,plant,stone);
		System.out.println("no of fish:"+aquarium.noOfFish);
		System.out.println("temp:"+aquarium.temp);
		System.out.println("has light:"+aquarium.light);
		System.out.println("aquarium width:"+aquarium.width);
		System.out.println("materisl:"+aquarium.material);
		System.out.println("fish color:"+aquarium.fish.color);
		System.out.println("water level:"+aquarium.water.litre);
		System.out.println("made by:"+aquarium.glass.color);
		System.out.println("plant inside aquarium:"+aquarium.plant.height);
		System.out.println("plant inside aquarium:"+aquarium.plant.no);
		System.out.println("stones:"+aquarium.stone.size);
		
		System.out.println("========================================================================");
		
		Ball ball=new Ball(16);
		Ampire ampire=new Ampire("nitin");
		Stadium stadium=new Stadium("Bangalore");
		Player player=new Player(11);
		Sponser sponser=new Sponser("vivo");
		Ipl ipl=new Ipl("RCB","CSK",5,122,"RCB",ball,ampire,stadium,player,sponser);
		System.out.println("team A:"+ipl.teamA);
		 System.out.println("team B:"+ipl.teamB);
         System.out.println("overs:"+ipl.over);
         System.out.println("run rate:"+ipl.runRate);
         System.out.println("winner:"+ipl.winner);	
        System.out.println("ball left:"+ipl.ball.no);
		System.out.println("ampire name:"+ipl.ampire.name);
		System.out.println("stadium:"+ipl.stadium.location);
		System.out.println("players:"+ipl.player.noOfPlayer);	
		System.out.println("sponser:"+ipl.sponser.sName);
		  
		
	}
}
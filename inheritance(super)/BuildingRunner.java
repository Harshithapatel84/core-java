class BuildingRunner{
	public static void main(String... values)
	{
		SchoolBuilding schoolBuilding=new SchoolBuilding();
		System.out.println(schoolBuilding.location);
		System.out.println(schoolBuilding.year);
		System.out.println(schoolBuilding.noOfFloor);
		
		SchoolBuilding schoolBuilding1=new SchoolBuilding("mysore",1998,6);
		System.out.println(schoolBuilding1.location);
		System.out.println(schoolBuilding1.year);
		System.out.println(schoolBuilding1.noOfFloor);
		
		SchoolBuilding schoolBuilding2=new SchoolBuilding("Hyderabad",2004,8);
		System.out.println(schoolBuilding2.location+","+schoolBuilding2.year+","+schoolBuilding2.noOfFloor);
		
		System.out.println("==============================================================");
		
		StringMusicalInstrument instrument=new StringMusicalInstrument();
		System.out.println(instrument.name+","+instrument.price+","+instrument.type);
		
		StringMusicalInstrument instrument2=new StringMusicalInstrument("guitar",15000,"string");
		System.out.println(instrument2.name+","+instrument2.price+","+instrument2.type);
		
		StringMusicalInstrument instrument3=new StringMusicalInstrument("piano",2000,"wind");
		System.out.println(instrument3.name+","+instrument3.price+","+instrument3.type);
		
		System.out.println("==============================================================");
		
		BreedGermanShepherd breed=new BreedGermanShepherd();
		System.out.println(breed.originCountry+","+breed.lifeSpan+","+breed.gender);
		
		BreedGermanShepherd breed1=new BreedGermanShepherd("Deutschland",16,"female");
		System.out.println(breed1.originCountry+","+breed1.lifeSpan+","+breed1.gender);
		
		BreedGermanShepherd breed2=new BreedGermanShepherd("german",14,"male");
		System.out.println(breed2.originCountry+","+breed2.lifeSpan+","+breed2.gender);
		
		System.out.println("==============================================================");
		
		EventStage stage=new EventStage();
		System.out.println(stage.name+","+stage.capacity+","+stage.startTime);
		
		EventStage stage1=new EventStage("marriage stage",500,6);
		System.out.println(stage1.name+","+stage1.capacity+","+stage1.startTime);
		
		EventStage stage2=new EventStage("function",100,4);
		System.out.println(stage2.name+","+stage2.capacity+","+stage2.startTime);
		
		
		System.out.println("==============================================================");
		
		DairyButter butter=new DairyButter();
		System.out.println(butter.color+","+butter.quantity+","+butter.cost);
		
		DairyButter butter1=new DairyButter("white",2,1200);
		System.out.println(butter1.color+","+butter1.quantity+","+butter1.cost);
		
		DairyButter butter2=new DairyButter("golden hue",3,2000);
		System.out.println(butter2.color+","+butter2.quantity+","+butter2.cost);
		
		System.out.println("==============================================================");
	
		ChickenShawarma s1=new ChickenShawarma();
		System.out.println(s1.type+","+s1.size+","+s1.spicy);

		ChickenShawarma s2=new ChickenShawarma("veg","medium",false);
		System.out.println(s2.type+","+s2.size+","+s2.spicy);

		ChickenShawarma s3=new ChickenShawarma("paneer","small",true);
		System.out.println(s3.type+","+s3.size+","+s3.spicy);
		
		System.out.println("==============================================================");
		
		HomeStaircase st1=new HomeStaircase();
		System.out.println(st1.noOfStep+","+st1.tilesColor+","+st1.material);

		HomeStaircase st2=new HomeStaircase(15,"black","granite");
		System.out.println(st2.noOfStep+","+st2.tilesColor+","+st2.material);

		HomeStaircase st3=new HomeStaircase(25,"brown","wood");
		System.out.println(st3.noOfStep+","+st3.tilesColor+","+st3.material);
		
		System.out.println("==============================================================");
		
		OceanBlueWhale w1=new OceanBlueWhale();
		System.out.println(w1.length+","+w1.age+","+w1.speciesOrigin);

		OceanBlueWhale w2=new OceanBlueWhale(28.0,20,"Pacific");
		System.out.println(w2.length+","+w2.age+","+w2.speciesOrigin);

		OceanBlueWhale w3=new OceanBlueWhale(32.0,30,"Indian");
		System.out.println(w3.length+","+w3.age+","+w3.speciesOrigin);
		
		System.out.println("==============================================================");
		
		GrilledChicken c1=new GrilledChicken();
		System.out.println(c1.type+","+c1.quantity+","+c1.fresh);

		GrilledChicken c2=new GrilledChicken("spicy grilled",3,true);
		System.out.println(c2.type+","+c2.quantity+","+c2.fresh);

		GrilledChicken c3=new GrilledChicken("bbq grilled",5,false);
		System.out.println(c3.type+","+c3.quantity+","+c3.fresh);
		
		System.out.println("==============================================================");
		
		
		InstagramReel r1=new InstagramReel();
		System.out.println(r1.account+","+r1.noOfFollower+","+r1.duration);

		InstagramReel r2=new InstagramReel("personal_blog",15000,45.0);
		System.out.println(r2.account+","+r2.noOfFollower+","+r2.duration);

		InstagramReel r3=new InstagramReel("travel",8000,25.5);
		System.out.println(r3.account+","+r3.noOfFollower+","+r3.duration);
	}
}
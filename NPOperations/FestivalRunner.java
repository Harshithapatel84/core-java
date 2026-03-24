class FestivalRunner{
	public static void main(String... args)
	{
        Festival[] fest=new Festival[10];
        FestivalType festivalType=new FestivalType(fest); 
        
        Festival f1=new Festival("ugadi",19,"Hindu");
		Festival f2=new Festival("varamahalaxmi",23,"Hindu");
		Festival f3=new Festival("gowri",21,"Hindu");
		Festival f4=new Festival("ganesha",14,"Hindu");
		Festival f5=new Festival("sankranthi",18,"Hindu");
		Festival f6=new Festival("ramzan",8,"Muslim");
		Festival f7=new Festival("ram navami",30,"Hindu");
		Festival f8=new Festival("ratha sapthami",16,"Hindu");
		Festival f9=new Festival("christmas",25,"Christian");
		Festival f10=new Festival("shivrathri",14,"Hindu");

        festivalType.save(f1);
		festivalType.save(f2);
		festivalType.save(f3);
		festivalType.save(f4);
		festivalType.save(f5);
		festivalType.save(f6);
		festivalType.save(f7);
		festivalType.save(f8);
		festivalType.save(f9);
		festivalType.save(f10);
		
		System.out.println("====================================================");
		
        Map[] maps=new Map[10];
        MapDetail store=new MapDetail(maps);

        Map m1=new Map("circle","india","india",1400,3245);
		Map m2=new Map("square","malaysia","malaysia",345,9833);
	    Map m3=new Map("triangle","singapore","singapore",560,242);
		Map m4=new Map("rectangle","canada","canada",380045,998);
		Map m5=new Map("oval","australia","australia",260,769);
		Map m6=new Map("hexagon","germany","germany",830,357);
		Map m7=new Map("pentagon","france","france",650,5516);
		Map m8=new Map("star","japan","japan",3450,377);
		Map m9=new Map("diamond","china","china",768,959);
		Map m10=new Map("ellipse","switzerland","switzerland",456,85157);

        store.save(m1);
		store.save(m2);
		store.save(m3);
		store.save(m4);
		store.save(m5);
		store.save(m6);
		store.save(m7);
		store.save(m8);
		store.save(m9);
		store.save(m10);
		
		System.out.println("====================================================");
		
		
        Cloth[] cloths=new Cloth[10];
        StoreClothType type=new StoreClothType(cloths);

        Cloth c1=new Cloth(520,"cotton","black",40,true);
		Cloth c2=new Cloth(750,"wool","red",38,true);
		Cloth c3=new Cloth(600,"silk","blue",42,false);
		Cloth c4=new Cloth(450,"linen","white",36,true);
		Cloth c5=new Cloth(550,"denim","green",40,true);
		Cloth c6=new Cloth(650,"polyester","grey",32,false);
		Cloth c7=new Cloth(400,"cotton","yellow",37,true);
		Cloth c8=new Cloth(1200,"leather","brown",20,true);
		Cloth c9=new Cloth(110,"wool","navy",28,false);

        type.save(c1);
		type.save(c2);
		type.save(c3);
		type.save(c4);
		type.save(c5);
		type.save(c6);
		type.save(c7);
		type.save(c8);
		type.save(c9);
		
		System.out.println("====================================================");

        Profile[] profiles=new Profile[10];
        StoreProfileDetail storeProfile=new StoreProfileDetail(profiles);

        Profile p1=new Profile("mohan",1000,false,"blogget","male");
		Profile p2=new Profile("siya",2000,true,"travel_lover","female");
		Profile p3=new Profile("raj",1500,false,"epiotic","male");
		Profile p4=new Profile("sita",1800,true,"traveller","female");
		Profile p5=new Profile("ramya",1200,false,"softwareengineer","male");
		Profile p6=new Profile("maya",2200,true,"artist","female");
		Profile p7=new Profile("siya",900,false,"fitness","male");
		Profile p8=new Profile("lisa",2500,true,"blogger","female");
		Profile p9=new Profile("ram",1300,false,"developer","male");
		Profile p10=new Profile("neha",1700,true,"designer","female");

        storeProfile.save(p1);
		storeProfile.save(p2);
		storeProfile.save(p3);
		storeProfile.save(p4);
		storeProfile.save(p5);
		storeProfile.save(p6);
		storeProfile.save(p7);
		storeProfile.save(p8);
		storeProfile.save(p9);
		storeProfile.save(p10);
		
		System.out.println("====================================================");
		
        Statue[] statues=new Statue[10];
        StoreStatueDetail storeStatue=new StoreStatueDetail(statues);

       Statue s1=new Statue("liberty","usa",93,1886,"copper");
	   Statue s2=new Statue("Statueofunity","india",182,2018,"bronze");
	   Statue s3=new Statue("christ","brazil",38,1931,"concrete");
	   Statue s4=new Statue("greatbuddhastatue","bihar",13,1252,"bronze");
	   Statue s5=new Statue("Ahimsa","india_maharashtra",20,2500,"limestone");
	   Statue s6=new Statue("david","italy",5,1504,"marble");
	   Statue s7=new Statue("adiyogi","india_coimbatore",2,100,"marble");
	   Statue s8=new Statue("moai","chile",10,1400,"stone");
	   Statue s9=new Statue("merlion","singapore",8,1972,"concrete");
	   Statue s10=new Statue("thinker","france",1.8,1904,"bronze");

       storeStatue.save(s1);
	   storeStatue.save(s2);
	   storeStatue.save(s3);
	   storeStatue.save(s4);
	   storeStatue.save(s5);
	   storeStatue.save(s6);
	   storeStatue.save(s7);
	   storeStatue.save(s8);
	   storeStatue.save(s9);
	   storeStatue.save(s10);
	   
		System.out.println("====================================================");
		
        TollGate[] tolls=new TollGate[10];
        StoreTollGateDetail storeGate=new StoreTollGateDetail(tolls);

        storeGate.save(new TollGate("nice",2005,6,"bangalore",50));
        storeGate.save(new TollGate("hebbal",2010,4,"bangalore",30));
        storeGate.save(new TollGate("krpuram",2012,5,"bangalore",40));
        storeGate.save(new TollGate("tumkurroad",2008,6,"tumkur",60));
        storeGate.save(new TollGate("nelamangala",2015,4,"bangalore",35));
        storeGate.save(new TollGate("bidadi",2011,5,"ramanagara",45));
        storeGate.save(new TollGate("mysoreroad",2013,4,"mysore",30));
        storeGate.save(new TollGate("mandya",2016,6,"mandya",55));
        storeGate.save(new TollGate("davanagere",2014,5,"davanagere",50));
        storeGate.save(new TollGate("hubli",2017,6,"hubli",65));
		
	    System.out.println("====================================================");
	
        CloudSoftware[] clouds=new CloudSoftware[10];
        CloudSoftwareDetail storeCloud=new CloudSoftwareDetail(clouds);

        storeCloud.save(new CloudSoftware("aws","v1",1000,true,"public"));
        storeCloud.save(new CloudSoftware("azure","v2",2000,true,"hybrid"));
        storeCloud.save(new CloudSoftware("gcp","v3",1500,true,"public"));
        storeCloud.save(new CloudSoftware("oracle","v1",120,false,"private"));
        storeCloud.save(new CloudSoftware("ibm","v2",1800,true,"hybrid"));
        storeCloud.save(new CloudSoftware("salesforce","v5",900,true,"public"));
        storeCloud.save(new CloudSoftware("sap","v4",1100,false,"private"));
        storeCloud.save(new CloudSoftware("digitalocean","v3",800,true,"public"));
        storeCloud.save(new CloudSoftware("heroku","v2",700,true,"public"));
        storeCloud.save(new CloudSoftware("alibaba","v6",1600,true,"hybrid"));
		
		System.out.println("====================================================");

        Acid[] acids=new Acid[10];
        AcidDetail store1=new AcidDetail(acids);

        Acid a1=new Acid("hcl",true,"liquid","colorless",1.0f);
		Acid a2=new Acid("h2so4",true,"liquid","colorless",0.5f);
		Acid a3=new Acid("hno3",true,"liquid","yellow",1.5f);
		Acid a4=new Acid("ch3cooh",false,"liquid","colorless",3.0f);
		Acid a5=new Acid("h3po4",false,"liquid","colorless",2.2f);
		Acid a6=new Acid("citric",false,"solid","white",3.2f);
		Acid a7=new Acid("carbonic",false,"liquid","colorless",4.5f);
		Acid a8=new Acid("lactic",false,"liquid","white",3.8f);
		Acid a9=new Acid("formic",false,"liquid","colorless",2.8f);
		Acid a10=new Acid("oxalic",false,"solid","white",1.3f);

        store1.save(a1);
		store1.save(a2);
		store1.save(a3);
		store1.save(a4);
		store1.save(a5);
		store1.save(a6);
		store1.save(a7);
		store1.save(a8);
		store1.save(a9);
		store1.save(a10);
		
		System.out.println("====================================================");

        Farmer[] farmers=new Farmer[10];
        StoreFarmerDetail cropType=new StoreFarmerDetail(farmers);

        Farmer farm1=new Farmer("ravi","agriculture","mandya",50000,"paddy");
		Farmer farm2=new Farmer("suresh","agriculture","mysore",60000,"sugarcane");
		Farmer farm3=new Farmer("mahesh","agriculture","tumkur",45000,"ragi");
		Farmer farm4=new Farmer("ganesh","agriculture","belgaum",70000,"maize");
		Farmer farm5=new Farmer("raju","agriculture","dharwad",55000,"wheat");
		Farmer farm6=new Farmer("manju","agriculture","hassan",65000,"coffee");
		Farmer farm7=new Farmer("kiran","agriculture","shivamogga",48000,"pepper");
		Farmer farm8=new Farmer("naveen","agriculture","chitradurga",52000,"groundnut");
		Farmer farm9=new Farmer("arun","agriculture","bellary",75000,"cotton");
		Farmer farm10=new Farmer("vijay","agriculture","bidar",58000,"tur");

        cropType.save(farm1);
		cropType.save(farm2);
		cropType.save(farm3);
		cropType.save(farm4);
		cropType.save(farm5);
		cropType.save(farm6);
		cropType.save(farm7);
		cropType.save(farm8);
		cropType.save(farm9);
		cropType.save(farm10);
		
		System.out.println("====================================================");

        Salt[] salts=new Salt[10];
        StoreSaltDetail storeSalt=new StoreSaltDetail(salts);

        Salt salt1=new Salt("white","solid",20,801,"sea");
		Salt salt2=new Salt("pink","solid",50,800,"himalayan");
		Salt salt3=new Salt("black","solid",60,790,"india");
		Salt salt4=new Salt("grey","solid",40,795,"france");
		Salt salt5=new Salt("brown","solid",30,785,"hawaii");
		Salt salt6=new Salt("white","solid",25,801,"rock");
		Salt salt7=new Salt("pink","solid",55,800,"pakistan");
		Salt salt8=new Salt("black","solid",65,79,"nepal");
		Salt salt9=new Salt("grey","solid",45,795,"spain");
		Salt salt10=new Salt("white","solid",22,801,"china");

        storeSalt.save(salt1);
		storeSalt.save(salt2);
		storeSalt.save(salt3);
		storeSalt.save(salt4);
		storeSalt.save(salt5);
		storeSalt.save(salt6);
		storeSalt.save(salt7);
		storeSalt.save(salt8);
		storeSalt.save(salt9);
		storeSalt.save(salt10);
    }
}
    

    
    
    
    
    
    
    
	


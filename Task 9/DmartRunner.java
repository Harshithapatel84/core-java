class DmartRunner
{
	public static void main(String... values)
	{
		Product product=new Product(504);
		Dmart dmart=new Dmart("bangalore",product,Section.CLOTH) ;
		dmart.showData();
		
		Product product1=new Product(620);
		Dmart dmart1=new Dmart("Mysore",product1,Section.GROCERIES) ;
		dmart1.showData();
		
		Product product2=new Product(160);
		Dmart dmart2=new Dmart("Tumkur",product2,Section.FRUIT) ;
		dmart2.showData();
		
		Product product3=new Product(100);
		Dmart dmart3=new Dmart("Chikkamagaluru",product3,Section.VEGETABLE) ;
		dmart3.showData();
		
		System.out.println("=====================================================================");
		 
		State state=new State("karnataka");
		Parliament parliament=new Parliament(545,state,PoliticalParty.BJP);
		parliament.printInfo();
		
		State state1=new State("Telangana");
		Parliament parliament1=new Parliament(555,state1,PoliticalParty.CONGRESS);
		parliament1.printInfo();
		
		State state2=new State("Delhi");
		Parliament parliament2=new Parliament(535,state2,PoliticalParty.OTHER);
		parliament2.printInfo();
		
		State state3=new State("Bihar");
		Parliament parliament3=new Parliament(515,state3,PoliticalParty.AAP);
		parliament3.printInfo();
		
		System.out.println("=====================================================================");
		 
		History history=new History(156);
		Fort fort=new Fort("mysore fort",history,Region.SOUTH);
		fort.printInfo();
		
		History history1=new History(65);
		Fort fort1=new Fort("Red fort",history1,Region.NORTH);
		fort1.printInfo();
		
		History history2=new History(126);
		Fort fort2=new Fort("Chitradurga fort",history2,Region.EAST);
		fort2.printInfo();
		
		History history3=new History(243);
		Fort fort3=new Fort("Golkand fort",history3,Region.WEST);
		fort3.printInfo();
		
		System.out.println("=====================================================================");
		 
		Farm farm=new Farm(120); 
		Pumpkin pumpkin=new Pumpkin("orange",farm,PumpkinColor.YELLOW);
		pumpkin.printInfo();
		
		Farm farm1=new Farm(110); 
		Pumpkin pumpkin1=new Pumpkin("bottle green",farm1,PumpkinColor.ORANGE);
		pumpkin1.printInfo();
		
		Farm farm2=new Farm(90); 
		Pumpkin pumpkin2=new Pumpkin("red",farm2,PumpkinColor.GREEN);
		pumpkin2.printInfo();
		
		Farm farm3=new Farm(60); 
		Pumpkin pumpkin3=new Pumpkin("white",farm3,PumpkinColor.PEACH);
		pumpkin3.printInfo();
		
		System.out.println("=====================================================================");
		
		Year year=new Year(2026);
		Calendar calendar=new Calendar("India",year,Season.MARCH);
		calendar.printInfo();
		
		Year year1=new Year(2025);
		Calendar calendar1=new Calendar("UK",year1,Season.JANUARY);
		calendar1.printInfo();
		
		Year year2=new Year(1998);
		Calendar calendar2=new Calendar("USA",year2,Season.FEBRUARY);
		calendar2.printInfo();
		
		Year year3=new Year(2004);
		Calendar calendar3=new Calendar("Canada",year3,Season.APRIL);
		calendar3.printInfo();
		
		System.out.println("=====================================================================");
		
		Factory factory=new Factory(850);
		Cashew cashew=new Cashew("cream",factory,CashewType.ROASTED);
		cashew.printInfo();
		
		Factory factory1=new Factory(900);
		Cashew cashew1=new Cashew("yellow",factory1,CashewType.SWEET);
		cashew1.printInfo();
		
		Factory factory2=new Factory(1200);
		Cashew cashew2=new Cashew("peach",factory2,CashewType.SALTED);
		cashew2.printInfo();
		
		Factory factory3=new Factory(550);
		Cashew cashew3=new Cashew("white",factory3,CashewType.RAW);
		cashew3.printInfo();
	}
	
 
}

class Runner
{
	public static void main(String...values)
	{
		Manufacture manufacture=new Manufacture("HindustanUnilever");
		Horlicks horlicks=new Horlicks(500,manufacture,FlavorType.WOMENS);
		horlicks.printInfo();
		
		Manufacture manufacture1=new Manufacture("britania");
		Horlicks horlicks1=new Horlicks(500,manufacture1,FlavorType.MOTHERS);
		horlicks1.printInfo();
		
		Manufacture manufacture2=new Manufacture("Unilever");
		Horlicks horlicks2=new Horlicks(500,manufacture2,FlavorType.CHACOLATE);
		horlicks2.printInfo();
		
		Manufacture manufacture3=new Manufacture("GlaxoSmithKline");
		Horlicks horlicks3=new Horlicks(500,manufacture3,FlavorType.PROTEIN_PLUS);
		horlicks3.printInfo();
		
		System.out.println("=================================================================");
		
		Garden garden=new Garden("Kashmir");
		Walnut walnut=new Walnut(2.5,garden,WalnutType.KASHMIRI);
		walnut.printInfo();
		
		Garden garden1=new Garden("Himachal");
		Walnut walnut1=new Walnut(3.0,garden1,WalnutType.ORGANIC);
		walnut1.printInfo();

        Garden garden2=new Garden("California");
		Walnut walnut2=new Walnut(1.8,garden2,WalnutType.CALIFORNIA);
		walnut2.printInfo();

        Garden garden3=new Garden("Uttarakhand");
		Walnut walnut3=new Walnut(2.2,garden3,WalnutType.LOCAL);
		walnut3.printInfo();
		
		System.out.println("=================================================================");
		
		Brand brand=new Brand("Nandini");
		Paneer paneer=new Paneer(2.5,brand,PaneerType.CUBES);
		paneer.printInfo();
		
		Brand brand1=new Brand("Amul");
		Paneer paneer1=new Paneer(3.0,brand1,PaneerType.GRATED);
		paneer1.printInfo();
		
		Brand brand2=new Brand("MilkyMist");
		Paneer paneer2=new Paneer(1.8,brand2,PaneerType.SMOKED);
		paneer2.printInfo();
		
		Brand brand3=new Brand("Heritage");
		Paneer paneer3=new Paneer(2.2,brand3,PaneerType.SPICED);
		paneer3.printInfo();
		
		System.out.println("=================================================================");
		
		FarmHouse farmhouse=new FarmHouse("Coorg");
		Mushroom mushroom=new Mushroom(650,farmhouse,MushroomType.BUTTON);
		mushroom.printInfo();
		
		FarmHouse farmhouse1=new FarmHouse("malnad");
		Mushroom mushroom1=new Mushroom(200,farmhouse1,MushroomType.OYSTER);
		mushroom1.printInfo();
		
		FarmHouse farmhouse2=new FarmHouse("himalaya");
		Mushroom mushroom2=new Mushroom(2000,farmhouse2,MushroomType.SHIITAKE);
		mushroom2.printInfo();
		
		FarmHouse farmhouse3=new FarmHouse("madikeri");
		Mushroom mushroom3=new Mushroom(100,farmhouse3,MushroomType.PORTOBELLO);
		mushroom3.printInfo();
		
		
		System.out.println("=================================================================");
		
		Location location=new Location("Bangalore");
		Beer beer=new Beer(true,location,BeerType.LIGHT);
		beer.printInfo();
		
		Location location1=new Location("mudigere");
		Beer beer1=new Beer(true,location1,BeerType.STRONG);
		beer1.printInfo();
		
		Location location2=new Location("madkeri");
		Beer beer2=new Beer(false,location2,BeerType.CRAFT);
		beer2.printInfo();
		
		Location location3=new Location("Delhi");
		Beer beer3=new Beer(false,location3,BeerType.WHEAT);
		beer3.printInfo();
		
		System.out.println("==============================================================");
		
		Lawyer lawyer=new Lawyer("Purushotham");
		Court court=new Court(6,lawyer,CourtType.CIVIL);
		court.printInfo();
		
		Lawyer lawyer1=new Lawyer("Ramesh");
		Court court1=new Court(3,lawyer1,CourtType.CRIMINAL);
		court1.printInfo();
		
		Lawyer lawyer2=new Lawyer("vidya");
		Court court2=new Court(5,lawyer2,CourtType.FAMILY);
		court2.printInfo();
		
		Lawyer lawyer3=new Lawyer("divakar");
		Court court3=new Court(8,lawyer3,CourtType.CONSUMER);
		court3.printInfo();
	}
}
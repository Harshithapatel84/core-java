class BatteryPowerBankRunner
{
	public static void main(String... values)
	{
		BatteryPowerBank battery=new BatteryPowerBank();
		//System.out.println("Battery Power Bank with args");
		battery.brand="samsung";
		battery.capacity=2000;
		battery.price=1500;
		battery.warranty=true;
		battery.model="SM102";
		battery.voltage=220;
		battery.cycle=2;
		battery.color="black";
		battery.store();
		battery.save();
		battery.display();
		
		PowerBank bank=new BatteryPowerBank();
		bank.brand="oppo";
		bank.capacity=1000;
		bank.price=2500;
		bank.store();
		bank.save();
		
		PowerBank powerBank =new PowerBank();
		powerBank.brand="xiaomi";
		powerBank.capacity=500;
		powerBank.price=5500;
		powerBank.store();
		powerBank.save();
		
		System.out.println("====================================================================");
	
        SteelCarrier c1=new SteelCarrier();
        c1.name="Truck Carrier";
        c1.type="Road";
        c1.capacity=50;
        c1.steelType="Alloy";
        c1.weight=30;
        c1.destination="Bangalore";
        c1.heavyLoad=true;
        c1.company="Tata";
        c1.start();
        c1.detail();
        c1.display();

        System.out.println("------------------");

        SteelCarrier c2=new SteelCarrier();
        c2.name="Ship Carrier";
        c2.type="Water";
        c2.capacity=500;
        c2.steelType="Carbon";
        c2.weight=300;
        c2.destination="Mumbai";
        c2.heavyLoad=true;
        c2.company="Adani";
        c2.start();
        c2.detail();
        c2.display();

        System.out.println("------------------------");

        Carrier c3=new SteelCarrier();
        c3.name="Mini Carrier";
        c3.type="Road";
        c3.capacity=20;
        c3.start();
        c3.detail();

        System.out.println("------------------");

        Carrier c4=new SteelCarrier();
        c4.name="Big Carrier";
        c4.type="Rail";
        c4.capacity=200;
        c4.start();
        c4.detail();

        System.out.println("--------------------");

        Carrier c5=new Carrier();
        c5.name="Normal Carrier";
        c5.type="Road";
        c5.capacity=10;
        c5.start();
        c5.detail();

        System.out.println("------------------");

        Carrier c6=new Carrier();
        c6.name="Water Carrier";
        c6.type="Water";
        c6.capacity=100;
        c6.start();
        c6.detail();

        System.out.println("=====================================================");
		
        MusicInstrument m1=new MusicInstrument();
        m1.name="Keyboard";
        m1.price=25000;
        m1.tune="Standard";
        m1.category="Electronic";
        m1.brand="Casio";
        m1.warranty=2;
        m1.portable=true;
        m1.origin="Japan";
        m1.play();
        m1.detail();
        m1.display();

        System.out.println("------------------");

        MusicInstrument m2=new MusicInstrument();
        m2.name="Drum Pad";
        m2.price=15000;
        m2.tune="Digital";
        m2.category="Percussion";
        m2.brand="Roland";
        m2.warranty=1;
        m2.portable=true;
        m2.origin="USA";
        m2.play();
        m2.detail();
        m2.display();

        System.out.println("------------------------");

        Instrument m3=new MusicInstrument();
        m3.name="Piano";
        m3.price=50000;
        m3.tune="Classical";
        m3.play();
        m3.detail();

        System.out.println("------------------");

        Instrument m4=new MusicInstrument();
        m4.name="Harmonium";
        m4.price=10000;
        m4.tune="Indian";
        m4.play();
        m4.detail();

        System.out.println("--------------------");

        Instrument m5=new Instrument();
        m5.name="Flute";
        m5.price=3000;
        m5.tune="C";
        m5.play();
        m5.detail();

        System.out.println("------------------");

        Instrument m6=new Instrument();
        m6.name="Tabla";
        m6.price=7000;
        m6.tune="Standard";
        m6.play();
        m6.detail();

        System.out.println("=====================================================");
		
        BottleOpener o1=new BottleOpener();
        o1.name="Classic Opener";
        o1.type="Manual";
        o1.price=150;
        o1.material="Steel";
        o1.brand="Prestige";
        o1.portable=true;
        o1.weight=0.2;
        o1.color="Silver";
        o1.open();
        o1.detail();
        o1.display();

        System.out.println("------------------");

        BottleOpener o2=new BottleOpener();
        o2.name="Premium Opener";
        o2.type="Automatic";
        o2.price=500;
        o2.material="Aluminium";
        o2.brand="Philips";
        o2.portable=false;
        o2.weight=0.5;
        o2.color="Black";
        o2.open();
        o2.detail();
        o2.display();

        System.out.println("------------------------");

        Opener o3=new BottleOpener();
        o3.name="Mini Opener";
        o3.type="Manual";
        o3.price=100;
        o3.open();
        o3.detail();

        System.out.println("------------------");

        Opener o4=new BottleOpener();
        o4.name="Travel Opener";
        o4.type="Compact";
        o4.price=200;
        o4.open();
        o4.detail();

        System.out.println("--------------------");

        Opener o5=new Opener();
        o5.name="Simple Opener";
        o5.type="Basic";
        o5.price=80;
        o5.open();
        o5.detail();

        System.out.println("------------------");

        Opener o6=new Opener();
        o6.name="Kitchen Opener";
        o6.type="Standard";
        o6.price=120;
        o6.open();
        o6.detail();

        System.out.println("=====================================================");

        IndianSlodier s1=new IndianSlodier();
        s1.name="Arjun";
        s1.unit="Infantry";
        s1.age=28;
        s1.regiment="Madras Regiment";
        s1.weapon="Rifle";
        s1.experience=5;
        s1.active=true;
        s1.location="Kashmir";
        s1.duty();
        s1.detail();
        s1.display();

        System.out.println("------------------");

        IndianSlodier s2=new IndianSlodier();
        s2.name="Ravi";
        s2.unit="Artillery";
        s2.age=30;
        s2.regiment="Punjab Regiment";
        s2.weapon="Cannon";
        s2.experience=8;
        s2.active=true;
        s2.location="Rajasthan";
        s2.duty();
        s2.detail();
        s2.display();

        System.out.println("------------------------");

        Soldier s3=new IndianSlodier();
        s3.name="Kiran";
        s3.unit="Signals";
        s3.age=26;
        s3.duty();
        s3.detail();

        System.out.println("------------------");

        Soldier s4=new IndianSlodier();
        s4.name="Manoj";
        s4.unit="Engineers";
        s4.age=32;
        s4.duty();
        s4.detail();

        System.out.println("--------------------");

        Soldier s5=new Soldier();
        s5.name="Suresh";
        s5.unit="Support";
        s5.age=35;
        s5.duty();
        s5.detail();

        System.out.println("------------------");

        Soldier s6=new Soldier();
        s6.name="Ramesh";
        s6.unit="Logistics";
        s6.age=40;
        s6.duty();
        s6.detail();

        System.out.println("=====================================================");
		
        WorldWar w1=new WorldWar();
        w1.name="World War I";
        w1.year=1914;
        w1.country="Europe";
        w1.countriesInvolved=30;
        w1.duration=4;
        w1.result="Allied Victory";
        w1.impact=true;
        w1.leader="Multiple";
        w1.fight();
        w1.detail();
        w1.display();

        System.out.println("------------------");

        WorldWar w2=new WorldWar();
        w2.name="World War II";
        w2.year=1939;
        w2.country="Global";
        w2.countriesInvolved=50;
        w2.duration=6;
        w2.result="Allied Victory";
        w2.impact=true;
        w2.leader="Churchill";
        w2.fight();
        w2.detail();
        w2.display();

        System.out.println("------------------------");

        War w3=new WorldWar();
        w3.name="Cold War";
        w3.year=1947;
        w3.country="Global";
        w3.fight();
        w3.detail();

        System.out.println("------------------");

        War w4=new WorldWar();
        w4.name="Gulf War";
        w4.year=1990;
        w4.country="Iraq";
        w4.fight();
        w4.detail();

        System.out.println("--------------------");

        War w5=new War();
        w5.name="Kargil War";
        w5.year=1999;
        w5.country="India";
        w5.fight();
        w5.detail();

        System.out.println("------------------");

        War w6=new War();
        w6.name="Indo-Pak War";
        w6.year=1971;
        w6.country="India-Pakistan";
        w6.fight();
        w6.detail();
		
		System.out.println("=====================================================");
		
        ChessGameBoard g1=new ChessGameBoard();
        g1.name="Chess Board";
        g1.size=8;
        g1.material="Wood";
        g1.square=64;
        g1.color="Black & White";
        g1.player=2;
        g1.timer=true;
        g1.brand="Classic";
        g1.start();
        g1.detail();
        g1.display();

        System.out.println("------------------");

        ChessGameBoard g2=new ChessGameBoard();
        g2.name="Tournament Board";
        g2.size=8;
        g2.material="Plastic";
        g2.square=64;
        g2.color="Green & White";
        g2.player=2;
        g2.timer=true;
        g2.brand="FIDE";
        g2.start();
        g2.detail();
        g2.display();

        System.out.println("------------------------");

        GameBoard g3=new ChessGameBoard();
        g3.name="Mini Board";
        g3.size=6;
        g3.material="Wood";
        g3.start();
        g3.detail();

        System.out.println("------------------");

        GameBoard g4=new ChessGameBoard();
        g4.name="Travel Board";
        g4.size=8;
        g4.material="Magnetic";
        g4.start();
        g4.detail();

        System.out.println("--------------------");

        GameBoard g5=new GameBoard();
        g5.name="Basic Board";
        g5.size=5;
        g5.material="Plastic";
        g5.start();
        g5.detail();

        System.out.println("------------------");

        GameBoard g6=new GameBoard();
        g6.name="Kids Board";
        g6.size=4;
        g6.material="Rubber";
        g6.start();
        g6.detail();

        
    }
}

 
  
		

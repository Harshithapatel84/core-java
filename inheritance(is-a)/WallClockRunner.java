class WallClockRunner{
	public static void main(String... values)
	{
		WallClock wallClock=new WallClock();
		System.out.println("");
		wallClock.showTime();
		wallClock.display();
		wallClock.display();
		
		Clock clock=new WallClock();
		System.out.println("");
		clock.showTime();
		clock.display();
		
		Clock clock1=new Clock();
		System.out.println("");
		clock.showTime();
		clock.display();
		
		System.out.println("======================================================================");

        WaterBallon wb1=new WaterBallon();
        wb1.capacity=500;
        wb1.noOfBallon=10;
        wb1.shape="Round";
        wb1.tied=true;
        wb1.elasticity=0.8;
		wb1.color="Red";
		wb1.type="Water";
		wb1.cost=20;
        wb1.store();
        wb1.show();
        wb1.display();

        System.out.println("------------------");

        WaterBallon wb2=new WaterBallon();
        wb2.capacity=300;
        wb2.noOfBallon=5;
        wb2.shape="Oval";
        wb2.tied=false;
        wb2.elasticity=0.5;
        wb2.store();
        wb2.show();
        wb2.display();

        System.out.println("------------------");

        Ballon ballon=new WaterBallon();
        ballon.color="Yellow";
        ballon.type="Water";
        ballon.cost=25;
        ballon.store();
        ballon.show();

        Ballon ballon3=new WaterBallon();
        ballon3.color="Gray";
        ballon3.type="Water";
        ballon3.cost=30;
        ballon3.store();
        ballon3.show();

        System.out.println("------------------");

        Ballon balloon1=new Ballon();
        balloon1.color="Green";
        balloon1.type="Air";
        balloon1.cost=10;
        balloon1.store();
        balloon1.show();

        Ballon balloon2=new Ballon();
        balloon2.color="Pink";
        balloon2.type="Water";
        balloon2.cost=15;
        balloon2.store();
        balloon2.show();
		
		System.out.println("======================================================================");
	
        ClothFactory cf1=new ClothFactory();
        cf1.name="ABC Factory";
        cf1.year=2000;
        cf1.type="Textile";
        cf1.clothName="Cotton";
        cf1.price=500;
        cf1.material="Natural";
        cf1.quantity=100;
        cf1.factoryArea=2500;
        cf1.produce();
        cf1.detail();
        cf1.display();

        System.out.println("------------------");

        ClothFactory cf2=new ClothFactory();
        cf2.name="XYZ Factory";
        cf2.year=2010;
        cf2.type="Garments";
        cf2.clothName="Silk";
        cf2.price=1500;
        cf2.material="Premium";
        cf2.quantity=50;
        cf2.factoryArea=3000;
        cf2.produce();
        cf2.detail();
        cf2.display();

        System.out.println("-------------------");

        Factory f1=new ClothFactory();
        f1.name="PQR Factory";
        f1.year=2005;
        f1.type="Clothing";
        f1.produce();
        f1.detail();

        System.out.println("------------------");

        Factory f2=new ClothFactory();
        f2.name="LMN Factory";
        f2.year=2015;
        f2.type="Export";
        f2.produce();
        f2.detail();

        System.out.println("--------------------");

        Factory f3=new Factory();
        f3.name="Basic Factory";
        f3.year=1995;
        f3.type="Local";
        f3.produce();
        f3.detail();

        System.out.println("------------------");

        Factory f4=new Factory();
        f4.name="Small Factory";
        f4.year=1990;
        f4.type="Handmade";
        f4.produce();
        f4.detail();
		
		System.out.println("======================================================================");
	
        SatelliteOrbit so1=new SatelliteOrbit();
        so1.name="Earth Orbit";
        so1.speed=30000;
        so1.radius=150000000;
        so1.satelliteName="INSAT";
        so1.color="White";
        so1.period=24;
        so1.active=true;
        so1.weight=2000;
        so1.rotate();
        so1.detail();
        so1.display();

        System.out.println("------------------");

        SatelliteOrbit so2=new SatelliteOrbit();
        so2.name="Mars Orbit";
        so2.speed=24000;
        so2.radius=220000000;
        so2.satelliteName="Mangalyaan";
        so2.color="Silver";
        so2.period=48;
        so2.active=true;
        so2.weight=1500;
        so2.rotate();
        so2.detail();
        so2.display();

        System.out.println("------------------------");
		
        Orbit o1=new SatelliteOrbit();
        o1.name="Jupiter Orbit";
        o1.speed=13000;
        o1.radius=778000000;
        o1.rotate();
        o1.detail();

        System.out.println("------------------");

        Orbit o2=new SatelliteOrbit();
        o2.name="Saturn Orbit";
        o2.speed=9700;
        o2.radius=1400000000;
        o2.rotate();
        o2.detail();

        System.out.println("--------------------");
		
        Orbit o3=new Orbit();
        o3.name="Venus Orbit";
        o3.speed=35000;
        o3.radius=108000000;
        o3.rotate();
        o3.detail();

        System.out.println("------------------");

        Orbit o4=new Orbit();
        o4.name="Mercury Orbit";
        o4.speed=47000;
        o4.radius=58000000;
        o4.rotate();
        o4.detail();
		
		System.out.println("======================================================================");

        WineBar w1=new WineBar();
        w1.name="Royal Bar";
        w1.location="Bangalore";
        w1.rent=50000;
        w1.wineName="Red Wine";
        w1.color="Dark Red";
        w1.price=1500;
        w1.strong=true;
        w1.make="France";
        w1.open();
		w1.detail();
        w1.display();

        System.out.println("------------------");

        WineBar w2=new WineBar();
        w2.name="Elite Bar";
        w2.location="Mumbai";
        w2.rent=70000;
        w2.wineName="White Wine";
        w2.color="Light Yellow";
        w2.price=1800;
        w2.strong=false;
        w2.make="Italy";
        w2.open();
        w2.detail();
		w2.display();

		System.out.println("------------------------");

        Bar b1=new WineBar();
        b1.name="Luxury Bar";
        b1.location="Delhi";
        b1.rent=90000;
        b1.open();
		b1.detail();

        System.out.println("------------------");

        Bar b2=new WineBar();
        b2.name="Classic Bar";
        b2.location="Chennai";
        b2.rent=40000;
        b2.open();
		b2.detail();
		
        System.out.println("--------------------");

        Bar b3=new Bar();
        b3.name="Simple Bar";
        b3.location="Hyderabad";
        b3.rent=30000;
        b3.open();
		b3.detail();

        System.out.println("------------------");

        Bar b4=new Bar();
        b4.name="Mini Bar";
        b4.location="Pune";
        b4.rent=20000;
        b4.open();
		b4.detail();

        System.out.println("======================================================================");
	
        SocilaMedia s1=new SocilaMedia();
        s1.name="Instagram";
        s1.customer=1000000;
        s1.worker=5000;
        s1.platformName="Instagram";
        s1.launchYear=2010;
        s1.country="USA";
        s1.headquarter="California";
        s1.active=true;
        s1.showData();
        s1.detail();
        s1.display();

        System.out.println("------------------");

        SocilaMedia s2=new SocilaMedia();
        s2.name="YouTube";
        s2.customer=2000000;
        s2.worker=8000;
        s2.platformName="YouTube";
        s2.launchYear=2005;
        s2.country="USA";
        s2.headquarter="California";
        s2.active=true;
        s2.showData();
        s2.detail();
        s2.display();

        System.out.println("------------------------");

        Media m1=new SocilaMedia();
        m1.name="Facebook";
        m1.customer=1500000;
        m1.worker=6000;
        m1.showData();
        m1.detail();

        System.out.println("------------------");

        Media m2=new SocilaMedia();
        m2.name="Twitter";
        m2.customer=1200000;
        m2.worker=4000;
        m2.showData();
        m2.detail();

        System.out.println("--------------------");

        Media m3=new Media();
        m3.name="Newspaper";
        m3.customer=50000;
        m3.worker=200;
        m3.showData();
        m3.detail();

        System.out.println("------------------");

        Media m4=new Media();
        m4.name="Radio";
        m4.customer=30000;
        m4.worker=150;
        m4.showData();
        m4.detail();

        System.out.println("=====================================================");
		
        PresentationSlide slide1=new PresentationSlide();
        slide1.title="Introduction";
        slide1.number=1;
        slide1.theme="Light";
        slide1.content="Welcome Slide";
        slide1.author="Harshitha";
        slide1.duration=2.5;
        slide1.animated=true;
        slide1.backgroundColor="White";
        slide1.show();
        slide1.detail();
        slide1.display();

        System.out.println("------------------");

        PresentationSlide slide2=new PresentationSlide();
        slide2.title="Conclusion";
        slide2.number=10;
        slide2.theme="Dark";
        slide2.content="Thank You";
        slide2.author="Harshitha";
        slide2.duration=1.5;
        slide2.animated=false;
        slide2.backgroundColor="Black";
        slide2.show();
        slide2.detail();
        slide2.display();

        System.out.println("------------------------");

        Slide slide3=new PresentationSlide();
        slide3.title="Overview";
        slide3.number=2;
        slide3.theme="Blue";
        slide3.show();
        slide3.detail();

        System.out.println("------------------");

        Slide slide4=new PresentationSlide();
        slide4.title="Agenda";
        slide4.number=3;
        slide4.theme="Green";
        slide4.show();
        slide4.detail();

        System.out.println("--------------------");

        Slide slide5=new Slide();
        slide5.title="Simple Slide";
        slide5.number=5;
        slide5.theme="Yellow";
        slide5.show();
        slide5.detail();

        System.out.println("------------------");

        Slide slide6=new Slide();
        slide6.title="Final Slide";
        slide6.number=6;
        slide6.theme="Purple";
        slide6.show();
        slide6.detail();

        System.out.println("=====================================================");
    }
}


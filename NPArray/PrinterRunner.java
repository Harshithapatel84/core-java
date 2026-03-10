class PrinterRunner{
	public static void main(String... args)
	{
		String[] manufacture=new String[3];
		manufacture[0]="HP";
		manufacture[1]="canon";
		manufacture[2]="Epson";
		
		Machine[] machine=new Machine[3];
		Machine m1=new Machine("Bangalore",40000);
		Machine m2=new Machine("gujrat",67000);
		Machine m3=new Machine("china",80000);
		machine[1]=m1;
		machine[0]=m2;
		machine[2]=m3;
		
		Printer printer=new Printer(manufacture,machine);
		printer.display();
		
		System.out.println("============================================================");
		
		String[] color=new String[3];
		color[0]="pink";
		color[1]="peach";
		color[2]="gray";
		
		Brush[] brush=new Brush[3];
		Brush b1=new Brush("Flat Brush",20);
		Brush b2=new Brush("round Brush",10);
		Brush b3=new Brush("Fan Brush",30);
		brush[0]=b1;
		brush[1]=b2;
		brush[2]=b3;
		
		Painter painter=new Painter(color,brush);
		painter.display();
		
		System.out.println("============================================================");
		
		String[] material=new String[3];
		material[0]="wood";
		material[1]="Hammer";
		material[2]="screw";
		
		Location[] location=new Location[3];
		Location l1=new Location("BTM",true);
		Location l2=new Location("banashankari",false);
		Location l3=new Location("yashvanthpura",true);
		location[0]=l1;
		location[1]=l2;
		location[2]=l3;
		
		Carpenter carpenter=new Carpenter(material,location);
		carpenter.display();
		
		System.out.println("============================================================");
		
		String[] ingredients =new String[]{"jamoon powder","milk","water"};
		
		Packet[] packet=new Packet[3];
		Packet p1=new Packet(8,false);
		Packet p2=new Packet(5,false);
		Packet p3=new Packet(2,true);
		packet[0]=p1;
		packet[1]=p2;
		packet[2]=p3;
		
		Jamoon jamoon = new Jamoon(ingredients,packet);
		jamoon.display();
		
		System.out.println("======================================================");
        String[] types=new String[3];
        types[0]="birthday";
        types[1]="wedding";
        types[2]="welcome";

        Image[] images=new Image[3];

        Image i1=new Image("PNG",500);
        Image i2=new Image("JPG",700);
        Image i3=new Image("SVG",300);

        images[0]=i1;
        images[1]=i2;
        images[2]=i3;

        Banner banner=new Banner(types,images);
        banner.display();
		
		System.out.println("=======================================================================");
		
        String[] services=new String[3];
        services[0]="Web Server";
        services[1]="Database Server";
        services[2]="File Server";

        Client[] clients=new Client[3];
		Client c1=new Client(8080,true);
        Client c2=new Client(3306,false);
        Client c3=new Client(443,true);
		clients[0]=c1;
        clients[1]=c2;
        clients[2]=c3;

        Server server=new Server(services,clients);
        server.display();
		
		System.out.println("===================================================================");
		
        String[] actions=new String[3];
        actions[0]="Laughing";
        actions[1]="Pranking";
        actions[2]="Dancing";

        Drama[] dramas=new Drama[3];
		Drama d1=new Drama("Comedy Show",30);
        Drama d2=new Drama("Stage Drama",45);
        Drama d3=new Drama("Circus Drama",40);
		dramas[0]=d1;
        dramas[1]=d2;
        dramas[2]=d3;

        Joker joker=new Joker(actions,dramas);
        joker.display();

        System.out.println("=======================================================================");		

        String[] fields=new String[3];
        fields[0]="house rent";
        fields[1]="marriage";
        fields[2]="land";

        Customer[] customers=new Customer[3];

        Customer cu1=new Customer("krithi",500000);
        Customer cu2=new Customer("suhas",300000);
        Customer cu3=new Customer("Rahul",700000);

        customers[0]=cu1;
        customers[1]=cu2;
        customers[2]=cu3;

        Broker broker=new Broker(fields,customers);
        broker.display();
		
		
        System.out.println("=======================================================================");
		
        String[] areas=new String[3];
        areas[0]="Payment";
        areas[1]="Hospital scan";
        areas[2]="barcode";

        Bill[] bills=new Bill[3];
		Bill b11=new Bill(101,250.50);
        Bill b12=new Bill(102,300.75);
        Bill b13=new Bill(103,150.25);
		bills[0]=b11;
        bills[1]=b12;
        bills[2]=b13;

        Scanner scanner=new Scanner(areas,bills);
        scanner.display();
		
		System.out.println("=============================================================================");
		
        String[] varities=new String[3];
        varities[0]="wood";
        varities[1]="iron";
        varities[2]="rubber";

        Work[] works=new Work[3];

        Work w1=new Work("Carpentry",true);
        Work w2=new Work("Metal Work",false);
        Work w3=new Work("Construction",true);

        works[0]=w1;
        works[1]=w2;
        works[2]=w3;

        Hammer hammer=new Hammer(varities,works);
        hammer.display();
		
		System.out.println("=============================================================================");
		
		String[] address=new String[3];
		address[0]="bangalore";
		address[1]="tumkur";
		address[2]="btm";
		
		Network[] network=new Network[3];
		network[0]=new Network("jio",500);
		network[1]=new Network("bsnl",68);
		network[2]=new Network("airtel",200);
		
		Tower tower=new Tower(address,network);
	    tower.display();
		
		System.out.println("======================================================================");
		
		String[] carrotHalwa=new String[3];
        carrotHalwa[0]="Carrot";
        carrotHalwa[1]="Milk";
        carrotHalwa[2]="Sugar";

        Carrot[] carrots=new Carrot[3];
        carrots[0]=new Carrot("Orange",5);
        carrots[1]=new Carrot("Red",3);
        carrots[2]=new Carrot("Orange",4);

        CarrotHalwa halwa=new CarrotHalwa(carrotHalwa,carrots);
        halwa.display();
    }
}
		
		
 

    
    
    
		
		
    
		

class LionRunner{
	public static void main(String[] args)
	{
		Cave cave=new Cave("bannergatta cave");
		Tail tail=new Tail(1.5);
		Leg leg=new Leg(4);
		Heart heart=new Heart(true);
		Food food=new Food("Meat");
		Lion lion=new Lion(8,190.5,true,"Savannah",true,cave,tail,leg,heart,food);
	    lion.getInfo();
		
		System.out.println("==========================================================");
		
        Team team = new Team("India");
        Strategy strategy = new Strategy("Offensive");
        Training training = new Training(6);
        Assistant assistant = new Assistant("Rahul");
        Contract contract = new Contract(3);
		Coach coach = new Coach(45,500000,true,"Cricket",true,team,strategy,training,assistant,contract);
	    coach.getInfo();
		
		System.out.println("==========================================================");
		
        Massage massage=new Massage("thai");
        Oil oil=new Oil("lavender");
        Customer customer=new Customer("ravi");
        Music music=new Music("pleasent");
		Payment payment=new Payment(2500);
        Spa spa=new Spa(2500.5,true,"Bangalore",true,15, massage,oil,customer,music,payment);
		spa.display();
		
		System.out.println("==========================================================");

        Cup cup=new Cup("ceramic");
        Milk milk=new Milk(true);
        Sugar sugar=new Sugar(2);
		Leaf leaf=new Leaf("Green Tea");
		Vessel vessel=new Vessel("Prestige");
		Tea tea=new Tea(20.5,true,"Masala",1,true,cup,milk,sugar,leaf,vessel);
        tea.display();
        
		
	   System.out.println("==============================================================");

        Hammer hammer=new Hammer("iron");
        Metal metal=new Metal("brass");
        Rope rope=new Rope(2.5);
        Sound sound=new Sound("loud");
        Stand stand=new Stand("silver");
        Bell bell=new Bell(500,true,"TempleBell",10,false, hammer,metal,rope,sound,stand);
	    bell.display();

       System.out.println("============================================================================");
	   
		Server server=new Server(500);
		Region region=new Region("Asia","Zone-1");
		Security security=new Security(true);
		Backup1 backup=new Backup1(true,"12/06/26");
		Account account=new Account("Harshitha");
		Cloud cloud=new Cloud("DriveCloud",1024,true,"Google","U90",server,region,security,backup,account);
        cloud.display();
		
	}

}
   
   
    
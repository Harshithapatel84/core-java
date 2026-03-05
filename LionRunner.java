class LionRunner{
	public static void main(String[] args)
	{
		Cave cave=new Cave("bannergatta cave");
		Tail tail=new Tail(1.5);
		Leg leg=new Leg(4);
		Heart heart=new Heart(true);
		Food food=new Food("Meat");
		Lion lion=new Lion(8,190.5,true,"Savannah",true,cave,tail,leg,heart,food);
		System.out.println("lion age:"+lion.age);
		System.out.println("lion weight: " + lion.weight);
		System.out.println("male:" +lion.male);
		System.out.println("habitat:"+lion.habitat);
		System.out.println("non veg:"+ lion.nonVeg);
		System.out.println("cave: " + lion.cave.location);
		System.out.println("tail length: " + lion.tail.length);
		System.out.println("legs: " + lion.leg.numberOfLeg);
		System.out.println("heart healthy: " + lion.heart.healthy);
		System.out.println("food: " + lion.food.type);
		
		System.out.println("==========================================================");
		
        Team team = new Team("India");
        Strategy strategy = new Strategy("Offensive");
        Training training = new Training(6);
        Assistant assistant = new Assistant("Rahul");
        Contract contract = new Contract(3);
		Coach coach = new Coach(45,500000,true,"Cricket",true,team,strategy,training,assistant,contract);
		System.out.println("age: " + coach.age);
        System.out.println("salary: " + coach.salary);
        System.out.println("sport: " + coach.sport);
		System.out.println("experienced: " + coach.experienced);
        System.out.println("international coach: " + coach.international);
		System.out.println("team: " + coach.team.name);
        System.out.println("strategy: " + coach.strategy.plan);
        System.out.println("training hours: " + coach.training.hour);
        System.out.println("assistant: " + coach.assistant.assistantName);
        System.out.println("contract years: " + coach.contract.year);
		
		System.out.println("==========================================================");
		
        Massage massage=new Massage("thai");
        Oil oil=new Oil("lavender");
        Customer customer=new Customer("ravi");
        Music music=new Music();
		Payment payment=new Payment(2500);
        Spa spa=new Spa(2500.5,true,"Bangalore",true,15, massage,oil,customer,music,payment);
		System.out.println("price:"+spa.price);
        System.out.println("open:"+spa.open);
        System.out.println("location:"+spa.location);
        System.out.println("luxury service:"+spa.luxuryService);
        System.out.println("staff count:"+spa.staffCount);
		System.out.println("massage type:"+spa.massage.type);
        System.out.println("oil fragrance:"+spa.oil.fragrance);
        System.out.println("customer name:"+spa.customer.name);
        System.out.println("music type:"+spa.music);
        System.out.println("payment amount:"+spa.payment.amount);
		
		System.out.println("==========================================================");

        Cup cup=new Cup("ceramic");
        Milk milk=new Milk(true);
        Sugar sugar=new Sugar(2);
		Leaf leaf=new Leaf("Green Tea");
		Vessel vessel=new Vessel("Prestige");
		Tea tea=new Tea(20.5,true,"Masala",1,true,cup,milk,sugar,leaf,vessel);

        System.out.println("price:"+tea.price);
        System.out.println("hot:"+tea.hot);
        System.out.println("flavor:"+tea.flavor);
        System.out.println("quantity:"+tea.quantity);
        System.out.println("organic:"+tea.organic);
		System.out.println("cup material:"+tea.cup.material);
        System.out.println("milk added:"+tea.milk.added);
        System.out.println("sugar spoons:"+tea.sugar.spoon);
        System.out.println("leaf type:"+tea.leaf.type);
        System.out.println("kettle brand:"+tea.vessel.brand);
		
	  System.out.println("==============================================================");

        Hammer hammer=new Hammer("iron");
        Metal metal=new Metal("brass");
        Rope rope=new Rope(2.5);
        Sound sound=new Sound("loud");
        Stand stand=new Stand("silver");
        Bell bell=new Bell(500,true,"TempleBell",10,false, hammer,metal,rope,sound,stand);

        System.out.println("price:"+bell.price);
        System.out.println("ringing:"+bell.ringing);
        System.out.println("brand:"+bell.brand);
        System.out.println("size:"+bell.size);
        System.out.println("electric:"+bell.electric);
		System.out.println("hammer type:"+bell.hammer.type);
        System.out.println("metal material:"+bell.metal.material);
        System.out.println("rope length:"+bell.rope.length);
        System.out.println("sound tone:"+bell.sound.tone);
        System.out.println("stand color:"+bell.stand.color);
    }
}
   
   
    
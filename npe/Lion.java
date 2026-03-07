class Lion{
	int age;
    double weight;
	boolean male;
	String habitat;
	boolean nonVeg;
	Cave cave;
    Tail tail;
	Leg leg;
    Heart heart;
    Food food;
	
	 Lion(int age,double weight,boolean male,String habitat,boolean nonVeg,
          Cave cave,Tail tail,Leg leg,Heart heart,Food food)
    {
        this.age = age;
        this.weight = weight;
        this.male = male;
        this.habitat = habitat;
        this.nonVeg = nonVeg;
		this.cave = cave;
        this.tail = tail;
        this.leg = leg;
        this.heart = heart;
        this.food = food;
    }
	void getInfo()
	{
		System.out.println("lion age:"+this.age+",weight:"+this.weight+",gender:"+this.male+",habitat:"+this.habitat+",nonVeg:"+this.nonVeg);
		if(this.cave!=null)
		{
			this.cave.display();
		}
		if(this.tail!=null)
		{
			this.tail.getDetails();
		}
		if(this.leg!=null)
		{
			this.leg.showData();
		}
		if(this.heart!=null)
		{
			this.heart.printData();
		}
		if(food!=null)
		{
			this.food.getDetails();
		}
	
	}
}
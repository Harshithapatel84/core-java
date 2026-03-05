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
}
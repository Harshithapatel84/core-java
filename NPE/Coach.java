class Coach{
    int age;
    double salary;
    boolean experienced;
    String sport;
    boolean international;
    Team team;
    Strategy strategy;
    Training training;
    Assistant assistant;
    Contract contract;

    Coach(int age,double salary,boolean experienced,String sport,boolean international,
          Team team,Strategy strategy,Training training,Assistant assistant,Contract contract){
        this.age = age;
        this.salary = salary;
        this.experienced = experienced;
        this.sport = sport;
        this.international = international;
		this.team = team;
        this.strategy = strategy;
        this.training = training;
        this.assistant = assistant;
        this.contract = contract;
    }
	void getInfo()
	{
		System.out.println("coach age:"+this.age+",salary:"+this.salary+",is experienced:"+this.experienced+",sport:"+this.sport+",is international:"+this.international);
		if(this.team!=null)
		{
			this.team.getDetails();
		}
		if(this.strategy!=null)
		{
			this.strategy.showData();
		}
		if(this.training!=null)
		{
			this.training.printDetails();
		}
		if(this.assistant!=null)
		{
			this.assistant.getInfo();
		}
		if(this.contract!=null)
		{
			this.contract. info();
		}
	}
}
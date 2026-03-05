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
}
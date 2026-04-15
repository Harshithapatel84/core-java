package com.xworkz.string.actor;

public class FilmActor extends Actor {

    int salary;
    String language;

    public FilmActor(String name,ActorType type,String[] movies,
                     Industry industry,int age, int salary,String language){
        super(name,type,movies,industry,age);
        this.salary=salary;
        this.language=language;
    }

    @Override
    void act(){
        System.out.println("Film actor is acting in movies");
    }

    @Override
    void promote(){
        System.out.println("Film actor is promoting films");
    }

    @Override
    public String toString(){
        return super.toString()+
                ",salary="+salary+
                ",language="+language;
    }
}
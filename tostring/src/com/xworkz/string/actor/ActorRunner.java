package com.xworkz.string.actor;

public class ActorRunner {
    public static void main(String[] args) {

        String[] movies={"KGF","Salaar","Ugram"};

        ActorType type=ActorType.HERO;

        Industry industry=new Industry("Sandalwood");


        Actor actor=new Actor("Yash",type,movies,industry,35);
        actor.act();
        actor.promote();
        System.out.println(actor);

        System.out.println("==========================================================");


        FilmActor filmActor=new FilmActor("Yash",type,movies,industry,35,5000000,"Kannada");
        filmActor.act();
        filmActor.promote();
        System.out.println(filmActor);
    }
}
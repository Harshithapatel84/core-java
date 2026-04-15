package com.xworkz.string.movie;

public class HitMovie extends Movie {

    int duration;
    String language;

    public HitMovie(String name,double budget,MovieType type,String[] actors,
                    Production production,int duration,String language){
        super(name,budget,type,actors,production);
        this.duration=duration;
        this.language=language;
    }

    @Override
    void play(){
        System.out.println("Hit movie is now playing");
    }

    @Override
    void stop(){
        System.out.println("Hit movie has ended");
    }

    @Override
    public String toString(){
        return super.toString()+
                ",duration="+duration+
                ",language="+language;
    }
}
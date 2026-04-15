package com.xworkz.string.movie;

public class MovieRunner {
    public static void main(String[] args) {

        String[] actors={"Yash","Prabhas","Allu Arjun"};
        MovieType type=MovieType.ACTION;
        Production production=new Production("Hombale Films");

        Movie movie=new Movie("KGF",100,type,actors,production);
        movie.play();
        movie.stop();
        System.out.println(movie);

        System.out.println("==========================================================");

        HitMovie movie1=new HitMovie("Salaar",200,type,actors,production,180,"Kannada");
        movie1.play();
        movie1.stop();
        System.out.println(movie1);
    }
}
package com.xworkz.string.Concert;

public class MusicConcert extends Concert{
    String city;
    String venue;


    public MusicConcert(String name, double entryFee, ConcertType type, String[] singers, Location location, String city, String venue) {
        super(name, entryFee, type, singers, location);
        this.city = city;
        this.venue = venue;
    }

    @Override
    void start() {
        super.start();
    }

    @Override
    void end() {
        super.end();
    }

    @Override
    public String toString() {
        return super.toString()+"city:"+city+",venue:"+venue;
    }
}

package com.xworkz.string.Concert;

public class ConcertRunner {
    public static void main(String[] args) {

        String[] Singers={"sinchith hegde","arman malik","arjith singh"};
        ConcertType type=ConcertType.MUSIC;
        Location location=new Location("Palace");
        Concert concert=new Concert("music concert",500,type,Singers, location);
        concert.start();
        concert.end();
        System.out.println(concert);

        System.out.println("==========================================================");

        MusicConcert concert1=new MusicConcert("music concert",500,type,Singers,location,"bangalore","rv college");
        concert1.start();
        concert1.end();
        System.out.println(concert1);
    }
}

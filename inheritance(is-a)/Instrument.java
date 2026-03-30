class Instrument{
    String name;
    double price;
    String tune;

    Instrument(){
        System.out.println("Instrument object created");
    }

    void play(){
        System.out.println("Instrument is playing...");
    }

    void detail(){
        System.out.println("Name:"+name+",Price:"+price+",Tune:"+tune);
    }
}
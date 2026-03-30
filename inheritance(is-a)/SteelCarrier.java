class SteelCarrier extends Carrier{
    String steelType;
    double weight;
    String destination;
    boolean heavyLoad;
    String company;

    SteelCarrier(){
        super();
        System.out.println("SteelCarrier object created");
    }

    void display(){
        System.out.println("SteelType:"+steelType+",Weight:"+weight+",Destination:"+destination+
        ",HeavyLoad:"+heavyLoad+",Company:"+company);
    }
}
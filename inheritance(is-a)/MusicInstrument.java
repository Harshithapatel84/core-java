class MusicInstrument extends Instrument{
    String category;
    String brand;
    int warranty;
    boolean portable;
    String origin;

    MusicInstrument(){
        super();
        System.out.println("executing the MusicInstrument object ");
    }

    void display(){
        System.out.println("Category:"+category+",Brand:"+brand+",Warranty:"+warranty+
        ",Portable:"+portable+",Origin:"+origin);
    }
}
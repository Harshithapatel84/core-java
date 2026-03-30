class Opener{
    String name;
    String type;
    double price;

    Opener(){
        System.out.println(" executing the Opener object ");
    }

    void open(){
        System.out.println("Opening...");
    }

    void detail(){
        System.out.println("Name:"+name+",Type:"+type+
        ",Price:"+price);
    }
}
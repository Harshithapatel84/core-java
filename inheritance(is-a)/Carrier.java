class Carrier{
    String name;
    String type;
    double capacity;

    Carrier(){
        System.out.println("executing the carrier ");
    }

    void start(){
        System.out.println("Carrier is starting...");
    }

    void detail(){
        System.out.println("Name:"+name+",Type:"+type+",Capacity:"+capacity);
    }
}
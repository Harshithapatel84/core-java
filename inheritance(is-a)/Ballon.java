class Ballon{
    String color;
    String type;
    double cost;
    
    Ballon(){
        System.out.println("Ballon object created");
    }

    void store(){
        System.out.println("Executing to store the ballon...");
    }

    void show(){
        System.out.println("Executing to ballon data");
        System.out.println("Color:"+color+",Type:"+type+",Cost:"+cost);
    }
}
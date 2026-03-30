class Bar{
    String name;
    String location;
    double rent;

    Bar(){
        System.out.println("Bar object created with no args");
    }

    void open(){
        System.out.println("Bar is open");
    }

    void detail(){
        System.out.println("Name:"+name+",Location:"+location+",Rent:"+rent);
    }
}
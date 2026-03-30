class War{
    String name;
    int year;
    String country;

    War(){
        System.out.println("executing the War object with...");
    }

    void fight(){
        System.out.println("War is happening...");
    }

    void detail(){
        System.out.println("Name:"+name+",Year:"+year+",Country:"+country);
    }
}
class Soldier{
    String name;
    String unit;
    int age;

    Soldier(){
        System.out.println("Soldier object created");
    }

    void duty(){
        System.out.println("Soldier is on duty...");
    }

    void detail(){
        System.out.println("Name:"+name+",Unit:"+unit+",Age:"+age);
    }
}
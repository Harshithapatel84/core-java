class Orbit{
    String name;
    double speed;
    double radius;

    Orbit(){
        System.out.println("Orbit object created");
    }

    void rotate(){
        System.out.println("Orbit is rotating...");
    }

    void detail(){
        System.out.println("Name:"+name+",Speed:"+speed+",Radius:"+radius);
    }
}
class BottleOpener extends Opener{
    String material;
    String brand;
    boolean portable;
    double weight;
    String color;

    BottleOpener(){
        super();
        System.out.println("BottleOpener object created");
    }

    void display(){
        System.out.println("Material:"+material+",Brand:"+brand+
        ",Portable:"+portable+",Weight:"+weight+",Color:"+color);
    }
}
class SatelliteOrbit extends Orbit{
    String satelliteName;
    String color;
    double period;
    boolean active;
    double weight;

    SatelliteOrbit(){
        super();
        System.out.println("SatelliteOrbit object created");
    }

    void display(){
        System.out.println("SatelliteName:"+satelliteName+",Color:"+color+
        ",Period:"+period+",Active:"+active+",Weight:"+weight);
    }
}
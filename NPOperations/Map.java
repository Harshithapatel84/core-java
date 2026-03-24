class Map{
    String shape;
    String location;
    String country;
    long population;
    double area;

    Map(String shape,String location,String country,long population,double area){
        this.shape=shape;
        this.location=location;
        this.country=country;
        this.population=population;
        this.area=area;
    }

    void printInfo(){
        System.out.println("executing the map with details..");
        System.out.println("shape:"+this.shape+",location:"+this.location+
        ",country:"+this.country+",population:"+this.population+
        ",area:"+this.area);
    }
}
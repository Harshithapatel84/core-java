class Salt{
    String color;
    String state;
    double price;
    double mP;
    String origin;

    Salt(String color,String state,double price,double mP,String origin){
        this.color=color;
        this.state=state;
        this.price=price;
        this.mP=mP;
        this.origin=origin;
    }

    void printInfo(){
        System.out.println("salt details execution started..");
        System.out.println("color:"+this.color+",state:"+this.state+
        ",price:"+this.price+",meltingPoint:"+this.mP+
        ",origin:"+this.origin);
    }
}
class Cloth{
    double price;
    String material;
    String color;
    int size;
    boolean quality;

    Cloth(double price,String material,String color,int size,boolean quality){
        this.price=price;
        this.material=material;
        this.color=color;
        this.size=size;
        this.quality=quality;
    }

    void printInfo(){
        System.out.println("executing the cloth details..");
        System.out.println("price:"+this.price+",material:"+this.material+
        ",color:"+this.color+",size:"+this.size+",quality:"+this.quality);
    }
}
class ClothFactory extends Factory{
    String clothName;
    double price;
    String material;
    int quantity;
    double factoryArea;

    ClothFactory(){
        super();
        System.out.println("ClothFactory object created");
    }

    void display(){
        System.out.println("ClothName:"+clothName+",Price:"+price+",Material:"+material+",Quantity:"+quantity+",FactoryArea:"+factoryArea);
    }
}
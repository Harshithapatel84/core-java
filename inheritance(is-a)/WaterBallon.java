class WaterBallon extends Ballon{
    double capacity;
    int noOfBallon;
    String shape;
    boolean tied;
    double elasticity;
    
    WaterBallon()
	{
        super();
    }

    void display(){
        System.out.println("execute to display the waterballon material..");
        System.out.println("Capacity:"+capacity+",NoOfBallon:"+noOfBallon+",Shape:"+shape+",Tied:"+tied+",Elasticity:"+elasticity);
    }
}
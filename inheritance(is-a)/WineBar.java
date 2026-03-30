class WineBar extends Bar{
    String wineName;
    String color;
    double price;
    boolean strong;
    String make;

    WineBar(){
        super();
        System.out.println("WineBar object created");
    }

    void display(){
		System.out.println("executing the wine bar with details");
        System.out.println("WineName:"+wineName+",Color:"+color+
        ",Price:"+price+",Strong:"+strong+",Make:"+make);
    }
}
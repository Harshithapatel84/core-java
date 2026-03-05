class Tea{

    double price;
    boolean hot;
    String flavor;
    int quantity;
    boolean organic;
	Cup cup;
    Milk milk;
    Sugar sugar;
    Leaf leaf;
    Vessel vessel;

    Tea(double price,boolean hot,String flavor,int quantity,boolean organic,
        Cup cup,Milk milk,Sugar sugar,Leaf leaf,Vessel vessel)
    {
        this.price=price;
        this.hot=hot;
        this.flavor=flavor;
        this.quantity=quantity;
        this.organic=organic;
		this.cup=cup;
        this.milk=milk;
        this.sugar=sugar;
        this.leaf=leaf;
        this.vessel=vessel;
    }
}
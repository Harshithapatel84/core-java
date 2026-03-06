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
	void display()
    {
        System.out.println("price:"+price+",hot:" +hot + ", flavor:" + flavor +", quantity:" + quantity + ", organic:" + organic);

        if(this.cup!=null)
        {
            this.cup.getInfo();
        }

        if(this.milk!=null)
        {
            this.milk.getDetails();
        }

        if(this.sugar!=null)
        {
            this.sugar.showData();
        }

        if(this.leaf!=null)
        {
            this.leaf.printData();
        }

        if(this.vessel!=null)
        {
            this.vessel.displayShop();
        }
    }
}

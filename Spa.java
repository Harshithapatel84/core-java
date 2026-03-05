class Spa{

    double price;
    boolean open;
    String location;
    boolean luxuryService;
    int staffCount;
	Massage massage;
    Oil oil;
    Customer customer;
    Music music;
    Payment payment;

    Spa(double price,boolean open,String location,boolean luxuryService,int staffCount,
        Massage massage,Oil oil,Customer customer,Music music,Payment payment)
    {
        this.price=price;
        this.open=open;
        this.location=location;
        this.luxuryService=luxuryService;
        this.staffCount=staffCount;
		this.massage=massage;
        this.oil=oil;
        this.customer=customer;
        this.music=music;
        this.payment=payment;
    }
}
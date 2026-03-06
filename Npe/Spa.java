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
	void display()
	{
		System.out.println("price:"+price+",open:"+this.open+",loction:"+this.location+",luxuryService:"+this.luxuryService+",staffCount:"+this.staffCount);
		if(this.massage!=null)
		{
		this.massage.getInfo();
		}
		if(this.oil!=null)
		{this.oil.getDetails();
		}
		if(music!=null)
		{
			this.music.showData();
		}
		if(this.payment!=null)
		{
			this.payment.details();
		}
		if(customer!=null)
		{
			this.customer.printData();
		}
	}
}
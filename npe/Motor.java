class Motor{
	String companyName;
	double capacity;
	double price;
	boolean automatic;
	int rpm;
	Gear gear;
	Wire wire;
	CoolingFan coolingFan;
	Shaft shaft;
	Battery battery;
	
	Motor(String companyName,double capacity,double price,boolean automatic,
	int rpm,Gear gear,Wire wire,CoolingFan coolingFan,Shaft shaft,Battery battery)
	{
		this.companyName=companyName;
		this.capacity=capacity;
		this.price=price;
		this.automatic=automatic;
		this.rpm=rpm;
		this.gear=gear;
		this.wire=wire;
		this.coolingFan=coolingFan;
		this.shaft=shaft;
		this.battery=battery;
	}
	void showDetails()
	{
		System.out.println("motor company name:"+this.companyName+",capacity:"+this.capacity+",price:"+this.price+",automatic:"+this.automatic+",rpm:"+this.rpm);
		if(this.gear!=null)
		{
			this.gear.getInfo();
		}
		if(this.wire!=null){
			this.wire.display();
		}
		if(this.coolingFan!=null){
		coolingFan.details();
		}
		if(this.shaft!=null){
		shaft.getDetails();
		}
		else{
			System.out.println("there is no shaft");
		}
		if(this.battery!=null){
		battery.showData();
		}
	}
}
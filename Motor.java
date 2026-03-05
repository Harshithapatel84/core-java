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
	
}
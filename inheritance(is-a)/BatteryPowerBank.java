class BatteryPowerBank extends PowerBank{
	boolean warranty;
	String model;
	int voltage;
	int cycle;
	String color;
	
	BatteryPowerBank()
	{
		super();
	}
	void display()
	{
		System.out.println("executing to store the power bank with....");
		System.out.println("warranty:"+warranty+",model:"+model+",voltage:"+voltage+",cycle:"+cycle+",color:"+color);
	}
	
}
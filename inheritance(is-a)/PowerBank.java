class PowerBank{
	String brand;
	double capacity;
	double price;
	
	PowerBank()
	{

		System.out.println("power bank with cons args.");
	}
	void store()
	{
		System.out.println("Executing to power bank capacity");
		System.out.println("Brand:"+brand);
        System.out.println("Capacity:"+capacity);
        System.out.println("Price:"+price);
	}
	void save()
	{
		System.out.println("execute to keep the charge...");
	}
}
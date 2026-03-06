class Light{
	boolean on;
	
	Light(boolean on)
	{
		this.on=on;
	}
	void display()
	{
		System.out.println("light is on:"+this.on);
	}
}
class Button{
	int noOfButton;
	String color;
	
	Button(int noOfButton,String color)
	{
		this.noOfButton=noOfButton;
		this.color=color;
	}
	void displayInfo()
	{
		System.out.println("number of button in mouse:"+this.noOfButton);
		System.out.println("color:"+this.color);
	}
}
class Mouse{
	String brand;
	double price;
	boolean drag;
	String manufacture;
	int noOfMouse;
	Light light;
	Button button;
	Cable cable;
	Cursor cursor;
	Chip chip;
	
	Mouse(String brand,double price,boolean drag,String manufacture,int noOfMouse,Light light,
	Button button,Cable cable,Cursor cursor,Chip chip)
	{
		this.brand=brand;
		this.price=price;
		this.drag=drag;
		this.manufacture=manufacture;
		this.noOfMouse=noOfMouse;
		this.light=light;
		this.button=button;
		this.cable=cable;
		this.cursor=cursor;
		this.chip=chip;
	}
	void displayDetials()
	{
		System.out.println("brand:"+this.brand+",price:"+this.price+",drag:"+this.drag+",manufacture:"+this.manufacture+",no of mouse:"+noOfMouse);
	}
}
class Chip
{
	boolean warranty;
	Chip(boolean warranty)
	{
		this.warranty=warranty;
	}
	
	void getDetails()
	{
		System.out.println("warranty:"+this.warranty);
	}
}
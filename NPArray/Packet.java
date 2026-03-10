class Packet{
    int quantity;
    boolean expire;	
	
	Packet(int quantity,boolean expire)
	{
		this.quantity=quantity;
		this.expire=expire;
	}
	void getInfo()
	{
		System.out.println("packet quantity:"+this.quantity);
		System.out.println(" has expired:"+this.expire);
	}
}
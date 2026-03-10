class Location{
	String shopName;
	boolean open;
	
	Location(String shopName,boolean open)
	{
		this.shopName=shopName;
		this.open=open;
	}
	void getInfo()
	{
		System.out.println("shop name:"+this.shopName);
		System.out.println("shop open:"+this.open);
	}
}
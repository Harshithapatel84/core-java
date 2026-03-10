class Network {
	String type;
	double height;
	
	Network(String type,double height)
	{
		this.type=type;
		this.height=height;
	}
	void getInfo()
	{
		System.out.println("tower type:"+this.type);
		System.out.println("tower height:"+this.height);
	}
}
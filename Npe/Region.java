class Region{
	String location;
	String zone;

	Region(String location,String zone){
		this.location=location;
		this.zone=zone;
	}
	void details()
	{
		System.out.println("location:"+this.location+",zone:"+this.zone);
	}
}
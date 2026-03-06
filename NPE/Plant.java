class Plant{
	double height;
	int no;
	
	Plant(double height,int no){
		this.height=height;
		this.no=no;
	}
	void printDetails()
	{
		System.out.println("plant height:"+this.height+",no of plant:"+this.no);
	}
}
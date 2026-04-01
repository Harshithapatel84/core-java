class Stage{
	String name;
	int capacity;
	int startTime;
	
	Stage(String name,int capacity,int startTime)
	{
		this.name=name;
		this.capacity=capacity;
		this.startTime=startTime;
		System.out.println("executing the stage with details...");
	}
	
}
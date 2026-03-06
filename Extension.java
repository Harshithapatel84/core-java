class Extension{
	String extensionName;
	String description;
	
	Extension(String extensionName,String description)
	{
		this.extensionName=extensionName;
		this.description=description;
	}
	void showData()
	{
		System.out.println("extension name:"+this.extensionName+",description of file:"+this.description);
	}
}

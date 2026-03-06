class Location{
	String path;
	String driveName;
	
	Location(String path,String driveName)
	{
	  this.path=path;
      this.driveName=driveName;	  
	}
	void getInfo()
	{
		System.out.println("location:"+this.path+",drive name:"+this.driveName);
	}
}
class File{
	String name;
	double size;
	double storage;
	boolean space;
	String userId;
    Memory memory;
	Location location;
	BackUp backUp;
	Extension extension;
	Permission permission;
	
	File(String name,double size,double storage,boolean space,String userId,Memory memory,
	Location location,BackUp backUp,Extension extension,Permission permission)
	{
		this.name=name;
		this.size=size;
		this.storage=storage;
		this.space=space;
		this.userId=userId;
		this.memory=memory;
		this.location=location;
		this.backUp=backUp;
		this.extension=extension;
		this.permission=permission;
	}
	
	void getInfo()
	{
		System.out.println("file name:"+this.name+",size:"+this.size+",storage:"+this.storage+",space:"+this.space+",userId:"+this.userId);
	}
}
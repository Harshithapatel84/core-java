class Permission{
	boolean edit;
	boolean read;
	
	Permission(boolean edit,boolean read)
	{
	this.edit=edit;
	this.read=read;
	}
	void showDetails()
	{
		System.out.println("edit available:"+this.edit+",read:"+this.read);
	}
}
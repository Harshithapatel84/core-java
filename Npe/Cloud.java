class Cloud{
	String name;
	double storage;
	boolean active;
	String provider;
	String userId;
	Server server;
	Region region;
	Security security;
	Backup1 backUp;
	Account account;

	Cloud(String name,double storage,boolean active,String provider,String userId,
	      Server server,Region region,Security security,Backup1 backup,Account account)
	{
		this.name=name;
		this.storage=storage;
		this.active=active;
		this.provider=provider;
		this.userId=userId;
		this.server=server;
		this.region=region;
		this.security=security;
		this.backUp=backUp;
		this.account=account;
	}
	void display()
	{
		System.out.println("name:"+this.name+",storage:"+this.storage+",active:"+this.active+",provider:"+this.provider+",userId:"+this.userId);
		if(this.server!=null)
		{
			this.server.getInfo();
		}
		if(this.region!=null)
		{
			this.region.details();
		}
		if(this.security!=null)
		{
			this.security.showData();
		}
		if(this.backUp!=null)
		{
			this.backUp.printData();
		}
		if(this.account!=null)
		{
			this.account.getDetails();
		}
	}
}
class Backup1{
	boolean enabled;
	String backupDate;

	Backup1(boolean enabled,String backupDate){
		this.enabled=enabled;
		this.backupDate=backupDate;
	}
	void printData()
	{
		System.out.println("enable:"+this.enabled+",backupDate:"+this.backupDate);
	}
}
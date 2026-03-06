class BackUp{
	boolean backupAvailabe;
	String backUpDate;
	
	BackUp(boolean backupAvailabe,String backUpDate)
	{
		this.backupAvailabe=backupAvailabe;
		this.backUpDate=backUpDate;
	}
	void getDetails()
	{
		System.out.println("backUp available:"+this.backupAvailabe+",backUp data:"+this.backUpDate);
	}
}
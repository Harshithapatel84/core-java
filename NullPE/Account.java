class Account{
	String accountName;

	Account(String accountName){
		this.accountName=accountName;
	}
	void getDetails()
	{
		System.out.println("account name is:"+this.accountName);
	}
}
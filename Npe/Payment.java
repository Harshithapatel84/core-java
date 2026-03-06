class Payment{
    double amount;
	
	Payment( double amount)
	{
		this.amount=amount;
	}
	void details()
	{
		System.out.println("cost:"+this.amount);
	}
}
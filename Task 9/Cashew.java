class Cashew{
	String color;
	Factory factory;
	CashewType type;
	
	Cashew(String color,Factory factory,CashewType type)
	{
		this.color=color;
		this.factory=factory;
		this.type=type;
	}
	void printInfo()
	{
		System.out.println("cashew color:"+this.color);
		if(factory!=null)
		{
			System.out.println("cashew price:"+this.factory.price);
		}
		if(type!=null)
		{
			System.out.println("cashew type:"+this.type);
		}
	}
}



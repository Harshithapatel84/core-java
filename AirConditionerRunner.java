class AirConditionerRunner{
	public static void main(String[] values)
	{
		AirConditioner ac=new AirConditioner();
		ac.brand="LG";
		ac.model="dualCool";
		ac.price=56000.50;
		ac.type="Split ac";
		ac.colors=new String[]{"white","grey","peach"};
		ac.warranty=7;
		ac.working=true;
		System.out.println("Brand name of AirConditioner:"+ac.brand);
		System.out.println("ac model is:"+ac.model);
		System.out.println("price of ac:"+ac.price);
		System.out.println("ac type:"+ac.type);
		System.out.println("ac available colors are:"+ac.colors);
		for(int i=0;i<ac.colors.length;i++)
		{
			System.out.println(ac.colors[i]);
		}
		System.out.println("warranty given to ac is:"+ac.warranty);
		System.out.println("is ac working:"+ac.working);
		
		
		AirConditioner ac1=new AirConditioner();
		ac1.brand="Daikin";
		ac1.model="FTM20";
		ac1.price=86700.60;
		ac1.type="invertor split type";
		ac1.colors=new String[]{"silver","white","black"};
		ac1.warranty=10;
		ac1.working=true;
	    System.out.println("Brand name of AirConditioner:"+ac1.brand);
		System.out.println("ac model is:"+ac1.model);
		System.out.println("price of ac:"+ac1.price);
		System.out.println("ac type:"+ac1.type);
		System.out.println("ac available colors are:"+ac1.colors);
		for(int i=0;i<ac1.colors.length;i++)
		{
			System.out.println(ac1.colors[i]);
		}
		System.out.println("warranty given to ac is:"+ac1.warranty);
		System.out.println("is ac working:"+ac1.working);
		
	}
}
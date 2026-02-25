class HairDryerRunner{
	public static void main(String[] values)
	{
		HairDryer hairDryer=new HairDryer();
		System.out.println(hairDryer.brand);
		System.out.println(hairDryer.cost);
		System.out.println(hairDryer.warranty);
		System.out.println(hairDryer.version);
		System.out.println(hairDryer.color);
		
		HairDryer hairDryer1=new HairDryer("Philips",2500,true,"Ph503","black & pink");
		System.out.println("hair dryer brand name:"+hairDryer1.brand);
		System.out.println("hair dryer cost:"+hairDryer1.cost);
		System.out.println("is there warranty:"+hairDryer1.warranty);
		System.out.println("hari dryer version:"+hairDryer1.version);
		System.out.println("hair dryer color:"+hairDryer1.color);
	}
}
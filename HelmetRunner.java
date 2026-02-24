class HelmetRunner{
	public static void main(String[] args)
	{
		Helmet helmet=new Helmet("black & white",1200,true);
		System.out.println("helmet color:"+helmet.color);
		System.out.println("helmet price:"+helmet.price);
		System.out.println("helmet gives protection:"+helmet.protection);
	}
}
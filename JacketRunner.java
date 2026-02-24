class JacketRunner{
	public static void main(String[] values)
	{
		Jacket jacket=new Jacket(28,"Black",true,500,"adidas");
		System.out.println("Jacket size:"+ jacket.size);
		System.out.println("Jacket color:"+jacket.color);
		System.out.println("Jacket type:"+ jacket.hoodie);
		System.out.println("Jacket cost:"+jacket.cost);
	    System.out.println("Jacket brand:"+ jacket.brand);			
	}
}
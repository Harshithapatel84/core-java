class PocketRunner{
	public static void main(String[] value)
	{
		Pocket pocket=new Pocket("Bag Pocket",2,false);
		System.out.println("Pocket name:"+pocket.name);
		System.out.println("Pocket capacity:"+pocket.capacity+"item");
		System.out.println("Pocket has zip:"+pocket.zip);
	}
} 
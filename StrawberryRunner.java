class StrawberryRunner{
	public static void main(String... anything)
	{
		Strawberry strawberry=new Strawberry(150,true,"Camarosa","USA",250);
		System.out.println("Strawberry price:"+strawberry.price);
		System.out.println("Strawberry seasonal fruit:"+strawberry.seasonal);
		System.out.println("Strawberry variety:"+strawberry.variety);
		System.out.println("Strawberry origin country:"+strawberry.originCountry);
		System.out.println("Strawberry weight in grams:"+strawberry.weight);
	}
}
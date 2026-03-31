class BirdRunner{
	public static void main(String... values)
	{
		BirdPeacock birdPeacock=new BirdPeacock();
		birdPeacock.chirp();
		birdPeacock.fly();
		birdPeacock.eat();
		
		Bird bird=new BirdPeacock();
		bird.fly();
		bird.eat();
		
		
	}
}
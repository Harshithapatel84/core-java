class ClipRunner{
	public static void main(String[] args)
	{
		Clip clip=new Clip("claw","fiber",4,30,"black");
		System.out.println("Clip type:"+clip.type);
		System.out.println("Clip material:"+clip.material);
		System.out.println("Clip quantity in pack:"+clip.quantityInPack);
		System.out.println("Clip price:"+clip.price);
		System.out.println("Clip color:"+clip.color);
	}
}
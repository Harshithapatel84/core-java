class FiberRunner{
	public static void main(String[] args)
	{
		Fiber fiber=new Fiber();
		fiber.name="Nylon";
		fiber.length=12.4;
		fiber.vendors=new String[]{"Silk line traders","Eco thread vendors","Prime fiber distributos"};
		System.out.println("fiber name is:"+fiber.name);
		System.out.println("length of the fiber:"+fiber.length);
		System.out.println("fiber vendors are:"+fiber.vendors);
		for (int index =0;index <fiber.vendors.length; index++) 
		{
			System.out.println(fiber.vendors[index]);
		}
		
		Fiber fiber1 = new Fiber();
        fiber1.name = "silk";
        fiber1.length = 15;
        fiber1.vendors = new String[]{"cotton trader vendor","silk merchant vendor"};
		System.out.println("fiber name is:" + fiber1.name);
        System.out.println("fiber length is:" + fiber1.length);

        for(int i = 0; i < fiber1.vendors.length; i++)
       {
         System.out.println(fiber1.vendors[i]);
        }
	}
}	
class BunRunner{
    public static void main(String[] values)
	{
		Bun bun=new Bun();
		bun.name="cream bun";
		bun.type="sweet";
		bun.price=50.0;
		bun.weight=1.25;
		bun.flavours=new String[]{"chaco","strawberry"};
		bun.shape="circle";
		bun.color="brown";
		bun.ingredients=new String[]{"Strawberry","sugar","venilla sause"};
		bun.fresh=true;
		bun.quantity=10;
		System.out.println("bun name is:"+bun.name);
		System.out.println("bun type is:"+bun.type);
		System.out.println("price of the bun is:"+bun.price);
		System.out.println("weight of bun:"+bun.weight);
		System.out.println("flavours included in the bun:"+bun.flavours);
		for(int j=0;j<bun.flavours.length;j++)
		{
			System.out.println(bun.flavours[j]);
		}
		System.out.println("bun shape is:"+bun.shape);
		System.out.println("bun available in" +bun.color+ "color");
		System.out.println("ingredients added to the bun flavours are:"+bun.ingredients);
		for(int i=0;i<bun.ingredients.length;i++)
		{
			System.out.println(bun.ingredients[i]);
		}
		System.out.println("quality of bun:"+bun.fresh);
		System.out.println("bun quantity:"+bun.quantity);
		
		
		Bun bun1=new Bun();
		bun1.name="masala bun";
		bun1.type="spicy";
		bun1.price=30.0;
		bun1.weight=50.25;
		bun1.flavours=new String[]{"galic masala","chilli flavour"};
		bun1.shape="circle";
		bun1.color="brown";
		bun1.ingredients=new String[]{"garlic","chilli","salt","onion"};
		bun1.fresh=true;
		bun1.quantity=8;
		System.out.println("bun name is:"+bun1.name);
		System.out.println("bun type is:"+bun1.type);
		System.out.println("price of the bun is:"+bun1.price);
		System.out.println("weight of bun:"+bun1.weight);
		System.out.println("flavours included in the bun:"+bun1.flavours);
		for(int j=0;j<bun1.flavours.length;j++)
		{
			System.out.println(bun1.flavours[j]);
		}
		System.out.println("bun shape is:"+bun1.shape);
		System.out.println("bun available in" +bun1.color+ "color");
		System.out.println("ingredients added to the bun flavours are:"+bun1.ingredients);
		for(int i=0;i<bun1.ingredients.length;i++)
		{
			System.out.println(bun1.ingredients[i]);
		}
		System.out.println("quality of bun:"+bun1.fresh);
		System.out.println("bun quantity:"+bun1.quantity);
		
	}
	}
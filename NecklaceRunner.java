class NecklaceRunner{
	public static void main(String[] args)
	{
		Necklace necklace=new Necklace("short chain","gold ",5,"gold color","GRT jewellers",
		22000,2,"Diamond","round",5.3,6,60,true,true,"vasuda",3.22,"choker",false,50,"pearl");
		System.out.println("necklace type is:"+necklace.type);
		System.out.println("necklace is made by is:"+necklace.material);
		System.out.println("gram:"+necklace.gram);
		System.out.println("necklace color:"+necklace.color);
		System.out.println("shop name:"+necklace.shopName);
	    System.out.println("prive per gram:"+necklace.price);
	    System.out.println("wastage:"+necklace.wastage);	
		System.out.println("gen type used:"+necklace.gemType);
		System.out.println("gem shape:"+necklace.gemCut);
	    System.out.println("length is:"+necklace.length);	
		System.out.println("weight is:"+necklace.weight);
		System.out.println("no of stones:"+necklace.stoneCount);
		System.out.println("quality:"+necklace.original);
		System.out.println("has hook:"+necklace.hook);
		System.out.println("designer name:"+necklace.designer);
		System.out.println("thickness:"+necklace.thickness);
		System.out.println("style:"+necklace.style);
		System.out.println("is adjustable:"+necklace.adjustable);
		System.out.println("number of beads:"+necklace.noOfBead);
        System.out.println("stone type:"+necklace.stoneType);		
	
	}
}
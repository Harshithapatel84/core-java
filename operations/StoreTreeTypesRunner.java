class StoreTreeTypesRunner{
	public static void main(String... values)
	{
		String[] types=new String[10];
		StoreTreeTypes tree=new StoreTreeTypes(types);
		tree.save("mango tree");
		tree.save("Banyan tree");
		tree.save("Banana plant");
		tree.save("coconut tree");
		tree.save("silver tree");
		tree.save("sandal wood tree");
		tree.save("Apple tree");
		tree.save("Ashoka tree");
		tree.save("Teak tree");
		tree.save("sapota tree");
		
		System.out.println("-----------------------------------------------");
		
		boolean found=tree.search("silver tree");
		System.out.println("tree name found:"+found);
		
		System.out.println("================================================");
		
		String[] type=new String[10];
		StoreSteelType steelType=new StoreSteelType(type);
		steelType.store("stainless steel");
		steelType.store("aluminium steel");
		steelType.store("carbon steel");
		steelType.store("alloy steel");
		steelType.store("tool steel");
		steelType.store("mild steel");
		steelType.store("high speed steel");
		steelType.store("spring steel");
		steelType.store("galvanized steel");
		steelType.store("cast steel");
		
		System.out.println("-----------------------------------------------");
		
		boolean foundType=steelType.find("spring steel");
		System.out.println("type found:"+foundType);
		
		System.out.println("================================================");
		
		String[] brand=new String[10];
		CylinderCompanyName brandName=new CylinderCompanyName(brand);
		brandName.save("HP");
		brandName.save("Indane");
		brandName.save("Bharat gas");
		brandName.save("linde");
		brandName.save("air liquid");
		brandName.save("INOX");
		brandName.save("adani");
		brandName.save("methason");
		brandName.save("SOL group");
		brandName.save("gulf gas");
		
		System.out.println("-----------------------------------------------");
		
		int found1=brandName.search("linde");
		System.out.println("name found:"+found1);
		
		System.out.println("================================================");
		
		String[] pastaShape=new String[10];
		StorePastaShape pasta=new StorePastaShape(pastaShape);

		pasta.save("Spaghetti");
		pasta.save("Penne");
		pasta.save("Fusilli");
		pasta.save("Macaroni");
		pasta.save("Ravioli");
		pasta.save("Lasagna");
		pasta.save("Farfalle");
		pasta.save("Rigatoni");
		pasta.save("Tortellini");
		pasta.save("Tagliatelle");
		
		System.out.println("-----------------------------------------------");
		
		int foundShape=pasta.search("Macaroni");
		System.out.println("shape name found:"+foundShape);
		
		System.out.println("================================================");
		
		String[] companies=new String[10];
		KettleCompanyName kettle=new KettleCompanyName(companies);
		kettle.save("Philips");
		kettle.save("Prestige");
		kettle.save("Havells");
		kettle.save("Bajaj");
		kettle.save("Pigeon");
		kettle.save("Butterfly");
		kettle.save("Morphy Richards");
		kettle.save("Kenwood");
		kettle.save("Panasonic");
		kettle.save("Russell Hobbs");

		System.out.println("-----------------------------------");

		boolean found2=kettle.search("Prestige");
		System.out.println("brand found:"+found2);
		
		System.out.println("================================================");
		
		String[] turbineType=new String[10];

		TurbineType turbine=new TurbineType(turbineType);
		turbine.save("Windmill Turbine");
		turbine.save("Hydroelectric Turbine");
		turbine.save("Thermal Turbine");
		turbine.save("Combined Cycle Turbine");
		turbine.save("Micro Turbine");
		turbine.save("Vertical Axis Turbine");
		turbine.save("Horizontal Axis Turbine");
		turbine.save("Tidal Turbine");
		turbine.save("Wave Energy Turbine");
		turbine.save("Solar Turbine");

		System.out.println("--------------------------------------");

		boolean found3=turbine.search("Vertical Axis Turbine");
		System.out.println("type found:"+found3);
	}
}


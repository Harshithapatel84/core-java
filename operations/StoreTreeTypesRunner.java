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
		
		System.out.println("-----------------------------------------------");
		
		boolean update=tree.update(3,"peeple tree");
		System.out.println(update);
		
		System.out.println("-----------------------------------------------");
		
		boolean updateName=tree.updateNewName("Teak tree","guava tree");
		System.out.println(updateName);
		
		System.out.println("-----------------------------------------------");
		 
		 boolean delete=tree.delete(8,"Teak tree");
		 System.out.println(delete);
		 
		System.out.println("-----------------------------------------------");
		 
        boolean deleteName=tree.deleteByName("Banana plant");
		System.out.println(deleteName);
		
		
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
		
		System.out.println("-----------------------------------------------");
		
		boolean update1=steelType.update(2,"metal steel");
		System.out.println(update1);
		
		System.out.println("-----------------------------------------------");
		
		boolean updateNewname=steelType.updateNewName("tool steel","iron steel");
		System.out.println(updateNewname);
		
		System.out.println("-----------------------------------------------");
		
		boolean deleteIndex=steelType.delete(9,"cast steel");
		System.out.println(deleteIndex);
		
		boolean deleteSteelName=steelType.deleteByName("galvanized steel");
		System.out.println(deleteSteelName);
		 
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
		
		System.out.println("-----------------------------------------------");
		
		boolean updateCompanyName=brandName.update(6,"Airmax");
		System.out.println(update);
		
		System.out.println("-----------------------------------------------");
		
		boolean updateName1=brandName.updateNewName("INOX","oxygen cylinder");
		System.out.println(updateName1);
		
		System.out.println("-----------------------------------------------");
		
		boolean deleteByName=brandName.delete(8,"SOL group");
		System.out.println(deleteByName);
		
		boolean deleteName2=brandName.deleteByName("linde");
		System.out.println(deleteName2);
		 
		
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
		
		System.out.println("-----------------------------------");

		boolean updateShape=pasta.update(4,"fusilli");
		System.out.println(updateShape);
		
		System.out.println("-----------------------------------");
		
		boolean updateShapeName=pasta.updateNewName("Lasagna","orecchiette");
		System.out.println(updateShapeName);
		
		System.out.println("-----------------------------------");
		
		boolean deleteByIndex=pasta.delete(7,"Rigatoni");
		System.out.println(deleteByIndex);
		
		boolean deleteName3=pasta.deleteByName("Macaroni");
		System.out.println(deleteName3);
		 
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
		
		System.out.println("-----------------------------------");

		boolean updateBrand=kettle.update(5,"butterfly");
		System.out.println(updateBrand);
		
		System.out.println("-----------------------------------");

        boolean updateName2=kettle.updateNewName("Kenwood","acer");
		System.out.println(updateName2);

        System.out.println("-----------------------------------");
		
		boolean deleteByIndexValue=kettle.delete(3,"Bajaj");
		System.out.println(deleteByIndexValue);

        System.out.println("-----------------------------------");
         
		boolean deleteName4=kettle.deleteByName("Pigeon");
		System.out.println(deleteName4);
		
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
		
		System.out.println("-----------------------------------");

		boolean updateByIndex=turbine.update(6,"francis turbine");
		System.out.println(updateByIndex);
		
		System.out.println("-----------------------------------");
		
		boolean updateName3=turbine.updateNewName("Micro Turbine","water turbine");
		System.out.println(updateName3);
		
		System.out.println("-----------------------------------");
		
		boolean deleteByIndexValue1=turbine.delete(4,"Micro Turbine");
		System.out.println(deleteByIndexValue1);
		
		System.out.println("-----------------------------------");
		
		boolean deleteName5=turbine.deleteByName("Combined Cycle Turbine");
		System.out.println(deleteName5);



	}
}


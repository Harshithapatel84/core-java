class BreadRunner{
public static void main(String[] anything)
{
	Bread bread=new Bread();
	bread.type="white bread";
	bread.outletNames=new String[]{"Reliance","D-mart","V-mart"};
	bread.ingredients=new String[]{"Wheat flour","yeast","salt","H2o"};
	bread.shape="square";
	System.out.println("Bread type is:"+bread.type);
	System.out.println("bread available outlet nmes are:"+bread.outletNames);
	for(int i=0;i<bread.outletNames.length;i++)
	{
		System.out.println(bread.outletNames[i]);
	}
	System.out.println("ingredients used for bread:"+bread.ingredients);
	for(int i=0;i<bread.ingredients.length;i++)
	{
		System.out.println(bread.ingredients[i]);
	}
	System.out.println("shape of the bread is:"+bread.shape);
	
	Bread bread1=new Bread();
	bread1.type="brown bread";
	bread1.outletNames=new String[]{"ayyangar bekary","udupi-bekary","smart-point"};
	bread1.ingredients=new String[]{"maida","sugar","oil"};
	bread1.shape="oval";
	System.out.println("Bread type is:"+bread1.type);
	System.out.println("bread available outlet nmes are:"+bread1.outletNames);
	for(int i=0;i<bread1.outletNames.length;i++)
	{
		System.out.println(bread1.outletNames[i]);
	}
	System.out.println("ingredients used for bread:"+bread1.ingredients);
	for(int i=0;i<bread1.ingredients.length;i++)
	{
		System.out.println(bread1.ingredients[i]);
	}
	System.out.println("shape of the bread is:"+bread1.shape);
}
  }
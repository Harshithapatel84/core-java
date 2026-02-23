class HappyDentRunner
{
	public static void main(String[] args)
	{
		HappyDent hd1 = new HappyDent();

hd1.brand = "HappyDent";
hd1.flavor = "Peppermint";
hd1.price = 45.5;
hd1.weight = 20;
hd1.sugarFree = true;
hd1.color = "White";
hd1.shape = "Rectangle";
hd1.coatingType = "Sugar Coat";
hd1.chewDuration = 10;
hd1.manufactureDate = "01-02-2025";
hd1.expiryDate = "01-02-2026";
hd1.manufacturer = "Perfetti Van Melle";
hd1.country = "India";
hd1.piecesPerPack = 12;
hd1.packType = "Box";
hd1.mintLevel = 8;
hd1.freshnessLevel = 9;
hd1.isImported = false;
hd1.hasSugar = false;
hd1.dentistRecommended = true;
hd1.barcode = "HD23456789";
hd1.batchNumber = "B123";
hd1.texture = "Soft";
hd1.aroma = "Minty";
hd1.coolingEffect = true;
hd1.shelfLifeMonths = 12;
hd1.storageTemp = 25;
hd1.wrapperType = "Foil";
hd1.ingredients = new String[]{"Sorbitol","Mint","Xylitol"};
hd1.availableSizes = new String[]{"Small","Medium","Large"};

System.out.println("Brand is: " + hd1.brand);
System.out.println("Flavor is: " + hd1.flavor);
System.out.println("Price is: " + hd1.price);
System.out.println("Weight is: " + hd1.weight);
System.out.println("Sugar free: " + hd1.sugarFree);
System.out.println("Color is: " + hd1.color);
System.out.println("Shape is: " + hd1.shape);
System.out.println("Coating type: " + hd1.coatingType);
System.out.println("Chew duration: " + hd1.chewDuration);
System.out.println("Manufacture date: " + hd1.manufactureDate);
System.out.println("Expiry date: " + hd1.expiryDate);
System.out.println("Manufacturer: " + hd1.manufacturer);
System.out.println("Country: " + hd1.country);
System.out.println("Pieces per pack: " + hd1.piecesPerPack);
System.out.println("Pack type: " + hd1.packType);
System.out.println("Mint level: " + hd1.mintLevel);
System.out.println("Freshness level: " + hd1.freshnessLevel);
System.out.println("Is imported: " + hd1.isImported);
System.out.println("Has sugar: " + hd1.hasSugar);
System.out.println("Dentist recommended: " + hd1.dentistRecommended);
System.out.println("Barcode: " + hd1.barcode);
System.out.println("Batch number: " + hd1.batchNumber);
System.out.println("Texture: " + hd1.texture);
System.out.println("Aroma: " + hd1.aroma);
System.out.println("Cooling effect: " + hd1.coolingEffect);
System.out.println("Shelf life months: " + hd1.shelfLifeMonths);
System.out.println("Storage temperature: " + hd1.storageTemp);
System.out.println("Wrapper type: " + hd1.wrapperType);

System.out.println("Ingredients:");
for(int i = 0; i < hd1.ingredients.length; i++)
{
    System.out.println(hd1.ingredients[i]);
}

System.out.println("Available Sizes:");
for(int j = 0; j < hd1.availableSizes.length; j++)
{
    System.out.println(hd1.availableSizes[j]);
}

HappyDent hd2 = new HappyDent();

hd2.brand = "HappyDent";
hd2.flavor = "Strawberry";
hd2.price = 50;
hd2.weight = 25;
hd2.sugarFree = false;
hd2.color = "Pink";
hd2.shape = "Square";
hd2.coatingType = "Glossy Coat";
hd2.chewDuration = 8;
hd2.manufactureDate = "10-03-2025";
hd2.expiryDate = "10-03-2026";
hd2.manufacturer = "Perfetti";
hd2.country = "India";
hd2.piecesPerPack = 10;
hd2.packType = "Pouch";
hd2.mintLevel = 5;
hd2.freshnessLevel = 7;
hd2.isImported = false;
hd2.hasSugar = true;
hd2.dentistRecommended = false;
hd2.barcode = "HD98765432";
hd2.batchNumber = "B456";
hd2.texture = "Chewy";
hd2.aroma = "Fruity";
hd2.coolingEffect = false;
hd2.shelfLifeMonths = 10;
hd2.storageTemp = 22;
hd2.wrapperType = "Plastic";
hd2.ingredients = new String[]{"Sugar","Flavor","Color"};
hd2.availableSizes = new String[]{"Mini","Regular"};

System.out.println("Brand is: " + hd2.brand);
System.out.println("Flavor is: " + hd2.flavor);
System.out.println("Price is: " + hd2.price);
System.out.println("Weight is: " + hd2.weight);
System.out.println("Sugar free: " + hd2.sugarFree);
System.out.println("Color is: " + hd2.color);
System.out.println("Shape is: " + hd2.shape);
System.out.println("Coating type: " + hd2.coatingType);
System.out.println("Chew duration: " + hd2.chewDuration);
System.out.println("Manufacture date: " + hd2.manufactureDate);
System.out.println("Expiry date: " + hd2.expiryDate);
System.out.println("Manufacturer: " + hd2.manufacturer);
System.out.println("Country: " + hd2.country);
System.out.println("Pieces per pack: " + hd2.piecesPerPack);
System.out.println("Pack type: " + hd2.packType);
System.out.println("Mint level: " + hd2.mintLevel);
System.out.println("Freshness level: " + hd2.freshnessLevel);
System.out.println("Is imported: " + hd2.isImported);
System.out.println("Has sugar: " + hd2.hasSugar);
System.out.println("Dentist recommended: " + hd2.dentistRecommended);
System.out.println("Barcode: " + hd2.barcode);
System.out.println("Batch number: " + hd2.batchNumber);
System.out.println("Texture: " + hd2.texture);
System.out.println("Aroma: " + hd2.aroma);
System.out.println("Cooling effect: " + hd2.coolingEffect);
System.out.println("Shelf life months: " + hd2.shelfLifeMonths);
System.out.println("Storage temperature: " + hd2.storageTemp);
System.out.println("Wrapper type: " + hd2.wrapperType);

System.out.println("Ingredients:");
for(int i = 0; i < hd2.ingredients.length; i++)
{
    System.out.println(hd2.ingredients[i]);
}

System.out.println("Available Sizes:");
for(int j = 0; j < hd2.availableSizes.length; j++)
{
    System.out.println(hd2.availableSizes[j]);
}
	}
}
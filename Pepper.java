class Pepper{
    String name;
    String type;              
    String originCountry;
    String brand;
    String packagingType;
    String grade;
    String flavorProfile;
    String harvestSeason;
    String processingMethod;
    int quantityInGram;
    int shelfLifeMonth;
    int stockAvailable;
    int spiceLevel;          
    double pricePerKg;
    double moistureContent;
    double purityPercentage;
    float averageBerrySize;
    boolean isOrganic;
    boolean wholePepper;
    boolean exportQuality;
	
	Pepper(String name,String type,String originCountry,String brand,
    String packagingType, String grade,
    String flavorProfile, String harvestSeason,
    String processingMethod,int quantityInGram, int shelfLifeMonth, int stockAvailable,
    int spiceLevel,double pricePerKg,double moistureContent,
    double purityPercentage,float averageBerrySize,
    boolean isOrganic,boolean wholePepper,boolean exportQuality)
	{
		this.name=name;
		this.type=type;
		this.originCountry=originCountry;
		this.brand=brand;
		this.packagingType=packagingType;
		this.grade=grade;
		this.flavorProfile=flavorProfile;
		this.harvestSeason=harvestSeason;
		this.processingMethod=processingMethod;
		this.quantityInGram=quantityInGram;
		this.shelfLifeMonth=shelfLifeMonth;
		this.stockAvailable=stockAvailable;
		this.spiceLevel=spiceLevel;
		this.pricePerKg=pricePerKg;
		this.moistureContent=moistureContent;
		this.purityPercentage=purityPercentage;
		this.averageBerrySize=averageBerrySize;
		this.isOrganic=isOrganic;
		this.wholePepper=wholePepper;
		this.exportQuality=exportQuality;
	}
	void pepperInfo()
	{
		System.out.println("pepper name:"+this.name);
		System.out.println("pepper type:"+this.type);
		System.out.println("pepper originCountry:"+this.originCountry);
		System.out.println("pepper brand:"+this.brand);
		System.out.println("pepper packagingType:"+this.packagingType);
		System.out.println("pepper grade:"+this.grade);
		System.out.println("pepper flavorProfile:"+this.flavorProfile);
		System.out.println("pepper harvestSeason:"+this.harvestSeason);
		System.out.println("pepper processingMethod:"+this.processingMethod);
		System.out.println("pepper quantityInGram:"+this.quantityInGram);
		System.out.println("pepper shelfLifeMonth:"+this.shelfLifeMonth);
		System.out.println("pepper stockAvailable:"+this.stockAvailable);
		System.out.println("pepper spiceLevel:"+this.spiceLevel);
		System.out.println("pepper pricePerKg:"+this.pricePerKg);
		System.out.println("pepper moistureContent:"+this.moistureContent);
		System.out.println("pepper purityPercentage:"+this.purityPercentage);
		System.out.println("pepper averageBerrySize:"+this.averageBerrySize);
		System.out.println("pepper isOrganic:"+this.isOrganic);
		System.out.println("pepper wholePepper:"+this.wholePepper);
		System.out.println("pepper exportQuality:"+this.exportQuality);
		
	}

}

class Garlic{
	 String name;
    String variety;
    String originCountry;
    String brand;
    String packagingType;
    String grade;
    String flavorProfile;
    String harvestSeason;
    String storageType;
    int quantityInKg;
    int shelfLifeMonths;
    int stockAvailable;
    int clovesPerBulb;
    double pricePerKg;
    double moistureContent;
    double purityPercentage;
    float averageBulbSize;
    boolean organic;
    boolean peeled;
    boolean exportQuality;
	
	Garlic(String name, String variety,String originCountry,String brand,String packagingType,
    String grade,String flavorProfile,String harvestSeason,String storageType,int quantityInKg,
    int shelfLifeMonths,int stockAvailable,int clovesPerBulb,double pricePerKg,
    double moistureContent,double purityPercentage, float averageBulbSize,
    boolean organic,boolean peeled,boolean exportQuality)
	{
		this.name=name;
		this.variety=variety;
		this.originCountry=originCountry;
		this.brand=brand;
		this.packagingType=packagingType;
		this.grade=grade;
		this.flavorProfile=flavorProfile;
		this.harvestSeason=harvestSeason;
		this.storageType=storageType;
		this.quantityInKg=quantityInKg;
		this.shelfLifeMonths=shelfLifeMonths;
		this.stockAvailable=stockAvailable;
		this.clovesPerBulb=clovesPerBulb;
		this.pricePerKg=pricePerKg;
		this.moistureContent=moistureContent;
		this.purityPercentage=purityPercentage;
		this.averageBulbSize=averageBulbSize;
		this.organic=organic;
		this.peeled=peeled;
		this.exportQuality=exportQuality;
	}
	void displayInfo()
	{
		System.out.println("name:"+this.name);
		System.out.println("variety:"+this.variety);
		System.out.println("brand:"+this.brand);
		System.out.println("originCountry:"+this.originCountry);
		System.out.println("packagingType:"+this.packagingType);
		System.out.println("grade:"+this.grade);
		System.out.println("flavorProfile:"+this.flavorProfile);
		System.out.println("harvestSeason:"+this.harvestSeason);
		System.out.println("storageType:"+this.storageType);
		System.out.println("quantityInKg:"+this.quantityInKg);
		System.out.println("shelfLifeMonths:"+this.shelfLifeMonths);
		System.out.println("stockAvailable:"+this.stockAvailable);
		System.out.println("clovesPerBulb:"+this.clovesPerBulb);
		System.out.println("pricePerKg:"+this.pricePerKg);
		System.out.println("moistureContent:"+this.moistureContent);
		System.out.println("purityPercentage:"+this.purityPercentage);
		System.out.println("averageBulbSize:"+this.averageBulbSize);
		System.out.println("organic:"+this.organic);
		System.out.println("peeled:"+this.peeled);
		System.out.println("exportQuality:"+this.exportQuality);
	}
}

class Paper{
	String name;
	boolean quality;
	double cost;
	double length;
	double width;
	String color;
	String brand;
    String material;
    String factoryName;
    String category;
    String texture;
    String packagingType;
	int quantityAvailable;
    int warrantyYear;
    int manufacturingYear;
	double weight;
    double rating;
	float thickness;
	boolean isOrganic;
	boolean waterproof;
    boolean ecoFriendly;
	
	Paper(String name,
	boolean quality,double cost,double length,double width,String color,String brand, String material,
    String factoryName,String category,String texture,String packagingType,int quantityAvailable,
	int warrantyYear, int manufacturingYear,double weight,double rating,
	float thickness,boolean isOrganic,boolean waterproof, boolean ecoFriendly)
	{    
	    this.name=name;
		this.quality=quality;
		this.length=length;
		this.width=width;
		this.color=color;
		this.brand=brand;
		this.material=material;
		this.factoryName=factoryName;
		this.category=category;
		this.texture=texture;
		this.packagingType=packagingType;
		this.quantityAvailable=quantityAvailable;
		this.warrantyYear=warrantyYear;
		this.manufacturingYear=manufacturingYear;
		this.weight=weight;
		this.rating=rating;
		this.thickness=thickness;
		this.isOrganic=isOrganic;
		this.waterproof=waterproof;
		this.ecoFriendly=ecoFriendly;
	}
	void displayDetails()
	{
		System.out.println("paper name:"+this.name);
		System.out.println("paper quality:"+this.quality);
		System.out.println("paper length:"+this.length);
		System.out.println("paper width:"+this.width);
		System.out.println("color"+this.color);
		System.out.println("brand:"+this.brand);
		System.out.println("material:"+this.material);
		System.out.println("factoryName:"+this.factoryName);
		System.out.println("category:"+this.category);
		System.out.println("texture:"+this.texture);
		System.out.println("packagingType:"+this.packagingType);
		System.out.println("quantityAvailable:"+this.quantityAvailable);
		System.out.println("warrantyYear:"+this.warrantyYear);
		System.out.println("manufacturingYear:"+this.manufacturingYear);
		System.out.println("weight:"+this.weight);
		System.out.println("rating:"+this.rating);
		System.out.println("thickness:"+this.thickness);
		System.out.println("isOrganic:"+this.isOrganic);
		System.out.println("waterproof:"+this.waterproof);
		System.out.println("ecoFriendly:"+this.ecoFriendly);
		
	}
	
}
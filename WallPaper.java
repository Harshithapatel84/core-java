class WallPaper{
	String brandName;
	String color;
	String patternType;
	int width;
	int height;
	String material;
	String finishType;
	int rollLength;
	int quantity;
	int warranty;
	String roomType;
	double price;
	double rating;
	float thickness;
	boolean washable;
	String designStyle;
	boolean waterProof;
	String textureType;
	String countryOfOrigin;
	boolean ecoFriendly;
	
	WallPaper(
	String brandName,String color,String patternType,int width,
	int height,	String material,String finishType,
	int rollLength,int quantity,int warranty,String roomType,
	double price,double rating,	float thickness,boolean washable,String designStyle,boolean waterProof,
	String textureType,String countryOfOrigin,boolean ecoFriendly)
	{
		this.brandName=brandName;
		this.color=color;
		this.patternType=patternType;
		this.width=width;
		this.height=height;
		this.material=material;
		this.finishType=finishType;
		this.rollLength=rollLength;
		this.quantity=quantity;
		this.warranty=warranty;
		this.roomType=roomType;
		this.price=price;
		this.rating=rating;
		this.thickness=thickness;
		this.washable=washable;
		this.designStyle=designStyle;
		this.waterProof=waterProof;
		this.textureType=textureType;
		this.countryOfOrigin=countryOfOrigin;
		this.ecoFriendly=ecoFriendly;
	}
	
	void wallPaperInfo()
	{
		System.out.println("brandName:"+brandName);
		System.out.println("color:"+color);
		System.out.println("patternType:"+patternType);
		System.out.println("width:"+width);
		System.out.println("height:"+height);
		System.out.println("material:"+material);
		System.out.println("finishType:"+finishType);
		System.out.println("rollLength:"+rollLength);
		System.out.println("quantity:"+quantity);
		System.out.println("warranty:"+warranty);
		System.out.println("roomType:"+roomType);
		System.out.println("price:"+price);
		System.out.println("rating:"+rating);
		System.out.println("thickness:"+thickness);
		System.out.println("washable:"+washable);
		System.out.println("designStyle:"+designStyle);
		System.out.println("waterProof:"+waterProof);
		System.out.println("textureType:"+textureType);
		System.out.println("countryOfOrigin:"+countryOfOrigin);
		System.out.println("ecoFriendly:"+ecoFriendly);
	}
}
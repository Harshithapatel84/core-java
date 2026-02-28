class Shampoo{
	String name;
	double price;
	String brand;
	int quantity;
	int manufactureYear;
	int expireDate;
	boolean hairfallRescue;
	boolean DandrufFree;
	String ingredients;
	String type;
	double weight;
    String fragrance;
    boolean sulfateFree;
    boolean parabenFree;
    int volumeInML;
    String color;
    double rating;
    String suitableFor;
    boolean dermatologistTested;
    String countryOfOrigin;
	
	Shampoo(String name,
	double price,
	String brand,
	int quantity,
	int manufactureYear,
	int expireDate,
	boolean hairfallRescue,
	boolean DandrufFree,
	String ingredients,
	String type,
	double weight,
    String fragrance,
    boolean sulfateFree,
    boolean parabenFree,
    int volumeInML,
    String color,
    double rating,
    String suitableFor,
    boolean dermatologistTested,
    String countryOfOrigin)
	{
		this.name=name;
		this.price=price;
		this.brand=brand;
		this.quantity=quantity;
		this.manufactureYear=manufactureYear;
		this.expireDate=expireDate;
		this.hairfallRescue=hairfallRescue;
		this.DandrufFree=DandrufFree;
		this.ingredients=ingredients;
		this.type=type;
		this.weight=weight;
		this.fragrance=fragrance;
		this.sulfateFree=sulfateFree;
		this.parabenFree=parabenFree;
		this.volumeInML=volumeInML;
		this.color=color;
		this.rating=rating;
		this.suitableFor=suitableFor;
		this.dermatologistTested=dermatologistTested;
		this.countryOfOrigin=countryOfOrigin;
	}
	
	void shampooDetails()
	{
		System.out.println("shampoo name:"+this.name);
		System.out.println("shampoo price:"+this.price);
		System.out.println("brand:"+this.brand);
		System.out.println("quantity:"+this.quantity);
		System.out.println("quantity:"+this.quantity);
		System.out.println("manufactureYear:"+this.manufactureYear);
		System.out.println("expireDate:"+this.expireDate);
		System.out.println("hairfallRescue:"+this.hairfallRescue);
		System.out.println("DandrufFree:"+this.DandrufFree);
		System.out.println("ingredients:"+this.ingredients);
		System.out.println("type:"+this.type);
		System.out.println("weight:"+this.weight);
		System.out.println("shampoo fragrance:"+this.fragrance);
		System.out.println("sulfateFree:"+this.sulfateFree);
		System.out.println("parabenFree:"+this.parabenFree);
		System.out.println("volumeInML:"+this.volumeInML);
		System.out.println("color:"+this.color);
		System.out.println("ratinge:"+this.rating);
		System.out.println("suitableFor:"+this.suitableFor);
		System.out.println("dermatologistTested:"+this.dermatologistTested);
		System.out.println("countryOfOrigin:"+this.countryOfOrigin);
	}
	
	
	
}
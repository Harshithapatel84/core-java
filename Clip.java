class Clip{
	String type;
	String material;
	int quantityInPack;
	double price;
	String color;
	
	Clip(){
		
	}
	Clip(String type,String material,int quantityInPack,double price,String color){
		this.type=type;
		this.material=material;
		this.quantityInPack=quantityInPack;
		this.price=price;
		this.color=color;
	}
	Clip(String type,int quantityInPack){
		this.type=type;
		this.quantityInPack=quantityInPack;
	}
	Clip(double price,String color){
		this.price=price;
		this.color=color;
	}
    Clip(String material){
		this.material=material;
	}
Clip(String material,double price){
	this.material=material;
	this.price=price;
}
}
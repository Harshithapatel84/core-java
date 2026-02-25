class Strawberry{
	double price;
	boolean seasonal;
	String variety;
	String originCountry;
	double weight;
	
	Strawberry(double price,boolean seasonal,String variety,String originCountry,double weight){
		this.price=price;
		this.seasonal=seasonal;
		this.variety=variety;
		this.originCountry=originCountry;
		this.weight=weight;
	}
	Strawberry(String variety,double weight){
		this.variety=variety;
		this.weight=weight;
	}
	Strawberry(boolean seasonal){
		this.seasonal=seasonal;
	}
	Strawberry(double price,String originCountry){
		this.price=price;
		this.originCountry=originCountry;
	}
	Strawberry(boolean seasonal,String variety){
		this.seasonal=seasonal;
		this.variety=variety;
	}
	Strawberry(){
		
	}
	
}
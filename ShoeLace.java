class ShoeLace {
	String brand;
	String color;
	String material;
	double length;
	double thickness;
	int price;
	boolean elastic;
	boolean waterproof;
	String laceType;
	int durabilityMonths;

	ShoeLace(String brand, String color, String material, double length,
	         double thickness, int price, boolean isElastic,
	         boolean isWaterproof, String laceType, int durabilityMonths) {

		this.brand = brand;
		this.color = color;
		this.material = material;
		this.length = length;
		this.thickness = thickness;
		this.price = price;
		this.elastic = elastic;
		this.waterproof = waterproof;
		this.laceType = laceType;
		this.durabilityMonths = durabilityMonths;
	}
}


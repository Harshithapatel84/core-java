class BraceletRunner {
	public static void main(String[] args) {

		Bracelet bracelet = new Bracelet(
			"Zara",
			"Gold",
			"Rose Gold",
			25.5,
			5000,
			"Bangle",
			true,
			false,
			"Floral",
			18.0,
			"Women",
			true,
			"Diamond",
			2,
			"India",
			false,
			"Hook",
			"Wedding",
			50,
			10.5
		);

		System.out.println("Brand: " + bracelet.brand);
		System.out.println("Material: " + bracelet.material);
		System.out.println("Color: " + bracelet.color);
		System.out.println("Weight: " + bracelet.weight);
		System.out.println("Price: " + bracelet.price);
		System.out.println("Type: " + bracelet.type);
		System.out.println("Adjustable: " + bracelet.adjustable);
		System.out.println("Waterproof: " + bracelet.waterproof);
		System.out.println("Design: " + bracelet.design);
		System.out.println("Length: " + bracelet.length);
		System.out.println("Gender: " + bracelet.gender);
		System.out.println("Handmade: " + bracelet.handmade);
		System.out.println("Stone Type: " + bracelet.stoneType);
		System.out.println("Warranty Years: " + bracelet.warrantyYears);
		System.out.println("Origin Country: " + bracelet.originCountry);
		System.out.println("Antique: " + bracelet.antique);
		System.out.println("Clasp Type: " + bracelet.claspType);
		System.out.println("Occasion: " + bracelet.occasion);
		System.out.println("Quantity Available: " + bracelet.quantityAvailable);
		System.out.println("Discount: " + bracelet.discount + "%");
	}
}


class ShoeLaceRunner {
	public static void main(String[] args) {

		ShoeLace lace = new ShoeLace(
			"Nike",
			"Black",
			"Cotton",
			120.5,
			0.5,
			150,
			false,
			true,
			"Flat",
			12
		);

		System.out.println("Brand: " + lace.brand);
		System.out.println("Color: " + lace.color);
		System.out.println("Material: " + lace.material);
		System.out.println("Length : " + lace.length);
		System.out.println("Thickness: " + lace.thickness);
		System.out.println("Price: " + lace.price);
		System.out.println("Elastic: " + lace.elastic);
		System.out.println("Waterproof: " + lace.waterproof);
		System.out.println("Lace Type: " + lace.laceType);
		System.out.println("Durability : " + lace.durabilityMonths);
	}
}


class BlanketRunner {
	public static void main(String[] args) {
		Blanket blanket = new Blanket(
			"SleepWell",
			"Cotton",
			"Blue",
			2.5,
			1500,
			true
		);

		System.out.println("Blanket Brand: " + blanket.brand);
		System.out.println("Material: " + blanket.material);
		System.out.println("Color: " + blanket.color);
		System.out.println("Size : " + blanket.size);
		System.out.println("Price: " + blanket.price);
		System.out.println("Washable: " + blanket.washable);
	}
}


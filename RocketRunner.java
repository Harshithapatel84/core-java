class RocketRunner {
	public static void main(String[] args) {
		Rocket rocket = new Rocket(
			"GSLV Mk III",
			"India",
			43.5,
			640000,
			"Liquid + Solid",
			3,
			false,
			8000,
			28000,
			true
		);

		System.out.println("Rocket Name: " + rocket.name);
		System.out.println("Country: " + rocket.country);
		System.out.println("Height : " + rocket.height);
		System.out.println("Weight : " + rocket.weight);
		System.out.println("Fuel Type: " + rocket.fuelType);
		System.out.println("Number of Stages: " + rocket.stages);
		System.out.println("Reusable: " + rocket.reusable);
		System.out.println("Payload Capacity kg: " + rocket.payloadCapacity);
		System.out.println("Speed km/h: " + rocket.speed);
		System.out.println("Manned Mission: " + rocket.manned);
	}
}

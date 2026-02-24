class Rocket {
	String name;
	String country;
	double height;
	double weight;
	String fuelType;
	int stages;
	boolean reusable;
	double payloadCapacity;
	double speed;
	boolean manned;

	Rocket(String name, String country, double height, double weight, String fuelType,
	       int stages, boolean reusable, double payloadCapacity, double speed, boolean manned) {
		this.name = name;
		this.country = country;
		this.height = height;
		this.weight = weight;
		this.fuelType = fuelType;
		this.stages = stages;
		this.reusable = reusable;
		this.payloadCapacity = payloadCapacity;
		this.speed = speed;
		this.manned = manned;
	}
}



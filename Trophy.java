class Trophy {

    String name;
    String eventName;
    String winnerName;
    String category;
    String material;
    String color;
    String shape;
    String manufacturer;
    String countryOfOrigin;
	int year;
    int height;
    int weight;
    int warrantyYear;
	double price;
    double rating;
    double baseWidth;
	float thickness;
	boolean goldPlated;
    boolean customMade;
    boolean engraving;
    Trophy(String name, String eventName, String winnerName, String category,
           String material, String color, String shape,
           String manufacturer, String countryOfOrigin,
           int year, int height, int weight, int warrantyYear,
           double price, double rating, double baseWidth,
           float thickness,
           boolean goldPlated, boolean customMade, boolean engraving) {

        this.name = name;
        this.eventName = eventName;
        this.winnerName = winnerName;
        this.category = category;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.year = year;
        this.height = height;
        this.weight = weight;
        this.warrantyYear= warrantyYear;
        this.price = price;
        this.rating = rating;
        this.baseWidth = baseWidth;
        this.thickness = thickness;
        this.goldPlated = goldPlated;
        this.customMade = customMade;
        this.engraving = engraving;
    }

    void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Event: " + eventName);
        System.out.println("Winner: " + winnerName);
        System.out.println("Category: " + category);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Year: " + year);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Warranty Years: " + warrantyYear);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
        System.out.println("Base Width: " + baseWidth);
        System.out.println("Thickness: " + thickness);
		System.out.println("Gold Plated: " + goldPlated);
        System.out.println("Custom Made: " + customMade);
        System.out.println("Has Engraving: " +engraving);
    }
}
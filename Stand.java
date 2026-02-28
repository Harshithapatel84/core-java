class Stand {

    String name;
    String brand;
    String material;
    String color;
    String type;
    String usage;
    String shape;
    String manufacturer;
    String countryOfOrigin;
    int height;
    int width;
    int weightCapacity;
    int warrantyYear;
    double price;
    double weight;
    double rating;
    float thickness;
	boolean foldable;
    boolean adjustable;
    boolean waterproof;

    Stand(String name, String brand, String material, String color,
          String type, String usage, String shape,
          String manufacturer, String countryOfOrigin,
          int height, int width, int weightCapacity, int warrantyYear,
          double price, double weight, double rating,
          float thickness, boolean foldable, boolean adjustable, boolean aaterproof) {

        this.name = name;
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.type = type;
        this.usage = usage;
        this.shape = shape;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.height = height;
        this.width = width;
        this.weightCapacity = weightCapacity;
        this.warrantyYear = warrantyYear;
        this.price = price;
        this.weight = weight;
        this.rating = rating;
        this.thickness = thickness;
        this.foldable = foldable;
        this.adjustable = adjustable;
        this.waterproof = waterproof;
    }
	
	void displayInfo() {

    System.out.println("Name: " + name);
    System.out.println("Brand: " + brand);
    System.out.println("Material: " + material);
    System.out.println("Color: " + color);
    System.out.println("Type: " + type);
    System.out.println("Usage: " + usage);
    System.out.println("Shape: " + shape);
    System.out.println("Manufacturer: " + manufacturer);
    System.out.println("Country Of Origin: " + countryOfOrigin);
	System.out.println("Height: " + height);
    System.out.println("Width: " + width);
    System.out.println("Weight Capacity: " + weightCapacity);
    System.out.println("Warranty Years: " + warrantyYear);
    System.out.println("Price: " + price);
    System.out.println("Weight: " + weight);
    System.out.println("Rating: " + rating);
	System.out.println("Thickness: " + thickness);
    System.out.println("Is Foldable: " + foldable);
    System.out.println("Is Adjustable: " + adjustable);
    System.out.println("Is Waterproof: " + waterproof);
}
}
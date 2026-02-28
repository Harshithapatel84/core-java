class Organizer {

    String name;
    String material;
    String color;
    String shape;
    String usageType;
    double price;
    int quantity;
    int manufactureYear;
    int warrantyYear;
    boolean foldable;
    boolean waterproof;
    boolean lightweight;
    boolean ecoFriendly;
    String brand;
    String category;
    double weight;
    float rating;
    int compartments;
    String countryOfOrigin;
    boolean availableOnline;

    Organizer(String name, String material, String color, String shape,
              String usageType, double price, int quantity,
              int manufactureYear, int warrantyYear,
              boolean foldable, boolean waterproof,
              boolean lightweight, boolean ecoFriendly,
              String brand, String category,
              double weight, float rating,
              int compartments, String countryOfOrigin,
              boolean availableOnline) {

        this.name = name;
        this.material = material;
        this.color = color;
        this.shape = shape;
        this.usageType = usageType;
        this.price = price;
        this.quantity = quantity;
        this.manufactureYear = manufactureYear;
        this.warrantyYear = warrantyYear;
        this.foldable = foldable;
        this.waterproof = waterproof;
        this.lightweight = lightweight;
        this.ecoFriendly = ecoFriendly;
        this.brand = brand;
        this.category = category;
        this.weight = weight;
        this.rating = rating;
        this.compartments = compartments;
        this.countryOfOrigin = countryOfOrigin;
        this.availableOnline = availableOnline;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Usage: " + usageType);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Warranty Year: " + warrantyYear);
        System.out.println("Foldable: " + foldable);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Lightweight: " + lightweight);
        System.out.println("Eco Friendly: " + ecoFriendly);
        System.out.println("Brand: " + brand);
        System.out.println("Category: " + category);
        System.out.println("Weight: " + weight);
        System.out.println("Rating: " + rating);
        System.out.println("Compartments: " + compartments);
        System.out.println("Country: " + countryOfOrigin);
        System.out.println("Available Online: " + availableOnline);
        System.out.println("-----------------------------------");
    }
}


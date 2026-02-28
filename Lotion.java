class Lotion {

    String name;
    double price;
    String brand;
    int quantity;
    int manufactureYear;
    int expireYear;
    boolean moisturizing;
    boolean skinBrightening;
    String ingredients;
    String type;
    double weight;
    String fragrance;
    boolean parabenFree;
    boolean sulfateFree;
    int volumeInML;
    String color;
    double rating;
    String suitableFor;
    boolean dermatologistTested;
    String countryOfOrigin;

    Lotion(String name, double price, String brand, int quantity,
           int manufactureYear, int expireYear,
           boolean moisturizing, boolean skinBrightening,
           String ingredients, String type,
           double weight, String fragrance,
           boolean parabenFree, boolean sulfateFree,
           int volumeInML, String color,
           double rating, String suitableFor,
           boolean dermatologistTested, String countryOfOrigin) {

        this.name = name;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.manufactureYear = manufactureYear;
        this.expireYear = expireYear;
        this.moisturizing = moisturizing;
        this.skinBrightening = skinBrightening;
        this.ingredients = ingredients;
        this.type = type;
        this.weight = weight;
        this.fragrance = fragrance;
        this.parabenFree = parabenFree;
        this.sulfateFree = sulfateFree;
        this.volumeInML = volumeInML;
        this.color = color;
        this.rating = rating;
        this.suitableFor = suitableFor;
        this.dermatologistTested = dermatologistTested;
        this.countryOfOrigin = countryOfOrigin;
    }

    void lotionDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Expire Year: " + expireYear);
        System.out.println("Moisturizing: " + moisturizing);
        System.out.println("Skin Brightening: " + skinBrightening);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Paraben Free: " + parabenFree);
        System.out.println("Sulfate Free: " + sulfateFree);
        System.out.println("Volume (ML): " + volumeInML);
        System.out.println("Color: " + color);
        System.out.println("Rating: " + rating);
        System.out.println("Suitable For: " + suitableFor);
        System.out.println("Dermatologist Tested: " + dermatologistTested);
        System.out.println("Country Of Origin: " + countryOfOrigin);
    }
}


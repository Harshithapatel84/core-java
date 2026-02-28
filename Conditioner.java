class Conditioner {

    String name;
    double price;
    String brand;
    int quantity;
    int manufactureYear;
    int expireDate;
    boolean hairfallRescue;
    boolean dandrufFree;
    String ingredients;
    String type;
    double weight;
    String fragrance;
    boolean sulfateFree;
    boolean parabenFree;
    int volumeInML;
    String color;
    double rating;
    String suitableFor;
    boolean dermatologistTested;
    String countryOfOrigin;

    Conditioner(String name, double price, String brand, int quantity,
                int manufactureYear, int expireDate,
                boolean hairfallRescue, boolean dandrufFree,
                String ingredients, String type,
                double weight, String fragrance,
                boolean sulfateFree, boolean parabenFree,
                int volumeInML, String color,
                double rating, String suitableFor,
                boolean dermatologistTested, String countryOfOrigin) {

        this.name = name;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.manufactureYear = manufactureYear;
        this.expireDate = expireDate;
        this.hairfallRescue = hairfallRescue;
        this.dandrufFree = dandrufFree;
        this.ingredients = ingredients;
        this.type = type;
        this.weight = weight;
        this.fragrance = fragrance;
        this.sulfateFree = sulfateFree;
        this.parabenFree = parabenFree;
        this.volumeInML = volumeInML;
        this.color = color;
        this.rating = rating;
        this.suitableFor = suitableFor;
        this.dermatologistTested = dermatologistTested;
        this.countryOfOrigin = countryOfOrigin;
    }

    void conditionerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Quantity: " + quantity);
        System.out.println("Manufacture Year: " + manufactureYear);
        System.out.println("Expire Date: " + expireDate);
        System.out.println("Hairfall Rescue: " + hairfallRescue);
        System.out.println("Dandruff Free: " + dandrufFree);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Sulfate Free: " + sulfateFree);
        System.out.println("Paraben Free: " + parabenFree);
        System.out.println("Volume (ML): " + volumeInML);
        System.out.println("Color: " + color);
        System.out.println("Rating: " + rating);
        System.out.println("Suitable For: " + suitableFor);
        System.out.println("Dermatologist Tested: " + dermatologistTested);
        System.out.println("Country Of Origin: " + countryOfOrigin);
    }
}
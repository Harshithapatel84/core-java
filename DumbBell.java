class DumbBell{
	  String brandName;
    String materialType;
    String color;
    String gripType;
    String shape;
    String coatingType;
    String manufacturer;
    String countryOfOrigin;
    String usageType;
    String modelName;
    int weightKg;
    int plateCount;
    int warrantyYears;
    int stockQuantity;
    double price;
    double maxLoadCapacity;
    double handleLength;
    float gripDiameter;
    boolean adjustable;
    boolean antiSlip;
	
	DumbBell(String brandName, String materialType, String color,
             String gripType, String shape, String coatingType,
             String manufacturer, String countryOfOrigin,
             String usageType, String modelName,
             int weightKg, int plateCount, int warrantyYears,
             int stockQuantity,
             double price, double maxLoadCapacity,
             double handleLength,
             float gripDiameter,
             boolean adjustable, boolean antiSlip)
			 {
		this.brandName = brandName;
        this.materialType = materialType;
        this.color = color;
        this.gripType = gripType;
        this.shape = shape;
        this.coatingType = coatingType;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.usageType = usageType;
        this.modelName = modelName;
        this.weightKg = weightKg;
        this.plateCount = plateCount;
        this.warrantyYears = warrantyYears;
        this.stockQuantity = stockQuantity;
        this.price = price;
        this.maxLoadCapacity = maxLoadCapacity;
        this.handleLength = handleLength;
        this.gripDiameter = gripDiameter;
        this.adjustable = adjustable;
        this.antiSlip = antiSlip;
		}
		
		void displayDetail() {

        System.out.println("Brand Name: " + brandName);
        System.out.println("Material Type: " + materialType);
        System.out.println("Color: " + color);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Shape: " + shape);
        System.out.println("Coating Type: " + coatingType);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country Of Origin: " + countryOfOrigin);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Model Name: " + modelName);
        System.out.println("Weight (Kg): " + weightKg);
        System.out.println("Plate Count: " + plateCount);
        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Stock Quantity: " + stockQuantity);
        System.out.println("Price: " + price);
        System.out.println("Max Load Capacity: " + maxLoadCapacity);
        System.out.println("Handle Length: " + handleLength);
        System.out.println("Grip Diameter: " + gripDiameter);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Anti Slip: " + antiSlip);
    }
}

	

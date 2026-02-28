class Toxic {

    String substanceName;
    String chemicalFormula;
    String category;
    String color;
    String odor;
    String manufacturer;
    String storageCondition;
    String hazardLevel;
    String exposureType;
    int toxicityLevel;
    int shelfLifeMonth;
    int manufacturingYear;
    int safetyRating;
	double lethalDose;
    double boilingPoint;
    double meltingPoint;
    double density;
    float purityPercentage;
	boolean flammable;
    boolean corrosive;
    boolean requiresLicense;

   
    Toxic(String substanceName, String chemicalFormula, String category,
          String color, String odor, String manufacturer,
          String storageCondition, String hazardLevel, String exposureType,
          int toxicityLevel, int shelfLifeMonth, int manufacturingYear,
          int safetyRating,
          double lethalDose, double boilingPoint,
          double meltingPoint, double density,
          float purityPercentage,
          boolean flammable, boolean corrosive, boolean requiresLicense)
		  {
	    this.substanceName = substanceName;
        this.chemicalFormula = chemicalFormula;
        this.category = category;
        this.color = color;
        this.odor = odor;
        this.manufacturer = manufacturer;
        this.storageCondition = storageCondition;
        this.hazardLevel = hazardLevel;
        this.exposureType = exposureType;
        this.toxicityLevel = toxicityLevel;
        this.shelfLifeMonth = shelfLifeMonth;
        this.manufacturingYear = manufacturingYear;
        this.safetyRating = safetyRating;
        this.lethalDose = lethalDose;
        this.boilingPoint = boilingPoint;
        this.meltingPoint = meltingPoint;
        this.density = density;
        this.purityPercentage = purityPercentage;
        this.flammable = flammable;
        this.corrosive = corrosive;
        this.requiresLicense = requiresLicense;
    }

    void displayInfo() {

        System.out.println("Substance Name: " + substanceName);
        System.out.println("Chemical Formula: " + chemicalFormula);
        System.out.println("Category: " + category);
        System.out.println("Color: " + color);
        System.out.println("Odor: " + odor);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Storage Condition: " + storageCondition);
        System.out.println("Hazard Level: " + hazardLevel);
        System.out.println("Exposure Type: " + exposureType);
        System.out.println("Toxicity Level: " + toxicityLevel);
        System.out.println("Shelf Life (Months): " + shelfLifeMonth);
        System.out.println("Manufacturing Year: " + manufacturingYear);
        System.out.println("Safety Rating: " + safetyRating);
        System.out.println("Lethal Dose: " + lethalDose);
        System.out.println("Boiling Point: " + boilingPoint);
        System.out.println("Melting Point: " + meltingPoint);
        System.out.println("Density: " + density);
        System.out.println("Purity Percentage: " + purityPercentage);
        System.out.println("Is Flammable: " + flammable);
        System.out.println("Is Corrosive: " + corrosive);
        System.out.println("Requires License: " + requiresLicense);
    }
}
  
class Organ {

    String name;
    String bodyPart;
    String function;
    String color;
    String shape;
    double weight;
    double size;
    int cellCount;
    int age;
    int efficiencyLevel;
    boolean vital;
    boolean transplantPossible;
    boolean artificialSupport;
    boolean sensitive;
    String bloodGroupSupport;
    String systemType;
    double oxygenUsage;
    float performanceRate;
    String location;
    String species;

    Organ(String name, String bodyPart, String function,
          String color, String shape,
          double weight, double size,
          int cellCount, int age, int efficiencyLevel,
          boolean vital, boolean transplantPossible,
          boolean artificialSupport, boolean sensitive,
          String bloodGroupSupport, String systemType,
          double oxygenUsage, float performanceRate,
          String location, String species) {

        this.name = name;
        this.bodyPart = bodyPart;
        this.function = function;
        this.color = color;
        this.shape = shape;
        this.weight = weight;
        this.size = size;
        this.cellCount = cellCount;
        this.age = age;
        this.efficiencyLevel = efficiencyLevel;
        this.vital = vital;
        this.transplantPossible = transplantPossible;
        this.artificialSupport = artificialSupport;
        this.sensitive = sensitive;
        this.bloodGroupSupport = bloodGroupSupport;
        this.systemType = systemType;
        this.oxygenUsage = oxygenUsage;
        this.performanceRate = performanceRate;
        this.location = location;
        this.species = species;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Body Part: " + bodyPart);
        System.out.println("Function: " + function);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Weight: " + weight);
        System.out.println("Size: " + size);
        System.out.println("Cell Count: " + cellCount);
        System.out.println("Age: " + age);
        System.out.println("Efficiency Level: " + efficiencyLevel);
        System.out.println("Vital: " + vital);
        System.out.println("Transplant Possible: " + transplantPossible);
        System.out.println("Artificial Support: " + artificialSupport);
        System.out.println("Sensitive: " + sensitive);
        System.out.println("Blood Group Support: " + bloodGroupSupport);
        System.out.println("System Type: " + systemType);
        System.out.println("Oxygen Usage: " + oxygenUsage);
        System.out.println("Performance Rate: " + performanceRate);
        System.out.println("Location: " + location);
        System.out.println("Species: " + species);
    }
}


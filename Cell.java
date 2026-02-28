class Cell {

    String cellName;
    String cellType;
    String organism;
    String shape;
    String function;
    double size;
    double weight;
    int chromosomeCount;
    int nucleusCount;
    int lifespanDays;
    boolean multicellular;
    boolean visibleUnderMicroscope;
    boolean reproductionAbility;
    boolean energyProduction;
    String cellWallType;
    String cytoplasmType;
    double temperatureTolerance;
    float activityLevel;
    String location;
    String discoveredBy;

    Cell(String cellName, String cellType, String organism,
         String shape, String function,
         double size, double weight,
         int chromosomeCount, int nucleusCount, int lifespanDays,
         boolean multicellular, boolean visibleUnderMicroscope,
         boolean reproductionAbility, boolean energyProduction,
         String cellWallType, String cytoplasmType,
         double temperatureTolerance, float activityLevel,
         String location, String discoveredBy) {

        this.cellName = cellName;
        this.cellType = cellType;
        this.organism = organism;
        this.shape = shape;
        this.function = function;
        this.size = size;
        this.weight = weight;
        this.chromosomeCount = chromosomeCount;
        this.nucleusCount = nucleusCount;
        this.lifespanDays = lifespanDays;
        this.multicellular = multicellular;
        this.visibleUnderMicroscope = visibleUnderMicroscope;
        this.reproductionAbility = reproductionAbility;
        this.energyProduction = energyProduction;
        this.cellWallType = cellWallType;
        this.cytoplasmType = cytoplasmType;
        this.temperatureTolerance = temperatureTolerance;
        this.activityLevel = activityLevel;
        this.location = location;
        this.discoveredBy = discoveredBy;
    }

    void displayDetails() {
        System.out.println("Cell Name: " + cellName);
        System.out.println("Cell Type: " + cellType);
        System.out.println("Organism: " + organism);
        System.out.println("Shape: " + shape);
        System.out.println("Function: " + function);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Chromosome Count: " + chromosomeCount);
        System.out.println("Nucleus Count: " + nucleusCount);
        System.out.println("Lifespan (Days): " + lifespanDays);
        System.out.println("Multicellular: " + multicellular);
        System.out.println("Visible Under Microscope: " + visibleUnderMicroscope);
        System.out.println("Reproduction Ability: " + reproductionAbility);
        System.out.println("Energy Production: " + energyProduction);
        System.out.println("Cell Wall Type: " + cellWallType);
        System.out.println("Cytoplasm Type: " + cytoplasmType);
        System.out.println("Temperature Tolerance: " + temperatureTolerance);
        System.out.println("Activity Level: " + activityLevel);
        System.out.println("Location: " + location);
        System.out.println("Discovered By: " + discoveredBy);
    }
}


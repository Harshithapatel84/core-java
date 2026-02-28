class Brain {

    String name;
    double weight;
    String hemisphereType;
    int age;
    int neuronCount;
    int iqLevel;
    boolean memoryStrong;
    boolean learningAbility;
    String functionType;
    String protectionType;
    double oxygenConsumption;
    String dominantSide;
    boolean emotionalControl;
    boolean decisionMaking;
    int signalSpeed;
    String color;
    double activityLevel;
    String controlledBy;
    boolean consciousState;
    String species;

    Brain(String name, double weight, String hemisphereType, int age,
          int neuronCount, int iqLevel,
          boolean memoryStrong, boolean learningAbility,
          String functionType, String protectionType,
          double oxygenConsumption, String dominantSide,
          boolean emotionalControl, boolean decisionMaking,
          int signalSpeed, String color,
          double activityLevel, String controlledBy,
          boolean consciousState, String species) {

        this.name = name;
        this.weight = weight;
        this.hemisphereType = hemisphereType;
        this.age = age;
        this.neuronCount = neuronCount;
        this.iqLevel = iqLevel;
        this.memoryStrong = memoryStrong;
        this.learningAbility = learningAbility;
        this.functionType = functionType;
        this.protectionType = protectionType;
        this.oxygenConsumption = oxygenConsumption;
        this.dominantSide = dominantSide;
        this.emotionalControl = emotionalControl;
        this.decisionMaking = decisionMaking;
        this.signalSpeed = signalSpeed;
        this.color = color;
        this.activityLevel = activityLevel;
        this.controlledBy = controlledBy;
        this.consciousState = consciousState;
        this.species = species;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
        System.out.println("Hemisphere Type: " + hemisphereType);
        System.out.println("Age: " + age);
        System.out.println("Neuron Count: " + neuronCount);
        System.out.println("IQ Level: " + iqLevel);
        System.out.println("Memory Strong: " + memoryStrong);
        System.out.println("Learning Ability: " + learningAbility);
        System.out.println("Function Type: " + functionType);
        System.out.println("Protection Type: " + protectionType);
        System.out.println("Oxygen Consumption: " + oxygenConsumption);
        System.out.println("Dominant Side: " + dominantSide);
        System.out.println("Emotional Control: " + emotionalControl);
        System.out.println("Decision Making: " + decisionMaking);
        System.out.println("Signal Speed: " + signalSpeed);
        System.out.println("Color: " + color);
        System.out.println("Activity Level: " + activityLevel);
        System.out.println("Controlled By: " + controlledBy);
        System.out.println("Conscious State: " + consciousState);
        System.out.println("Species: " + species);
    }
}

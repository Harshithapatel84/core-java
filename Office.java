class Office {

    String name;
    String location;
    String companyType;
    int employeeCount;
    int establishedYear;
    int floorCount;
    boolean acAvailable;
    boolean parkingFacility;
    boolean cafeteriaAvailable;
    boolean wifiAvailable;
    String ceoName;
    String department;
    double annualRevenue;
    double officeArea;
    float rating;
    String country;
    boolean securitySystem;
    boolean remoteWork;
    int meetingRooms;
    String buildingType;

    Office(String name, String location, String companyType,
           int employeeCount, int establishedYear, int floorCount,
           boolean acAvailable, boolean parkingFacility,
           boolean cafeteriaAvailable, boolean wifiAvailable,
           String ceoName, String department,
           double annualRevenue, double officeArea,
           float rating, String country,
           boolean securitySystem, boolean remoteWork,
           int meetingRooms, String buildingType) {

        this.name = name;
        this.location = location;
        this.companyType = companyType;
        this.employeeCount = employeeCount;
        this.establishedYear = establishedYear;
        this.floorCount = floorCount;
        this.acAvailable = acAvailable;
        this.parkingFacility = parkingFacility;
        this.cafeteriaAvailable = cafeteriaAvailable;
        this.wifiAvailable = wifiAvailable;
        this.ceoName = ceoName;
        this.department = department;
        this.annualRevenue = annualRevenue;
        this.officeArea = officeArea;
        this.rating = rating;
        this.country = country;
        this.securitySystem = securitySystem;
        this.remoteWork = remoteWork;
        this.meetingRooms = meetingRooms;
        this.buildingType = buildingType;
    }

    void displayDetails() {
        System.out.println("Office Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Company Type: " + companyType);
        System.out.println("Employees: " + employeeCount);
        System.out.println("Established Year: " + establishedYear);
        System.out.println("Floors: " + floorCount);
        System.out.println("AC Available: " + acAvailable);
        System.out.println("Parking: " + parkingFacility);
        System.out.println("Cafeteria: " + cafeteriaAvailable);
        System.out.println("WiFi: " + wifiAvailable);
        System.out.println("CEO: " + ceoName);
        System.out.println("Department: " + department);
        System.out.println("Annual Revenue: " + annualRevenue);
        System.out.println("Office Area: " + officeArea);
        System.out.println("Rating: " + rating);
        System.out.println("Country: " + country);
        System.out.println("Security System: " + securitySystem);
        System.out.println("Remote Work: " + remoteWork);
        System.out.println("Meeting Rooms: " + meetingRooms);
        System.out.println("Building Type: " + buildingType);
    }
}
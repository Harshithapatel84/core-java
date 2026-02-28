class Map {

    String mapName;
    String country;
    String state;
    String city;
    String language;
    String mapType;
    String createdBy;
    String projectionType;
    String scaleType;
	int numberOfLocation;
    int numberOfRoute;
    int zoomLevel;
    int releaseYear;
	double mapSize;
    double rating;
    double latitude;
    double longitude;
    float version;
	boolean onlineAvailable;
    boolean supportsNavigation;

    // Constructor
    Map(String mapName, String country, String state, String city,
        String language, String mapType, String createdBy,
        String projectionType, String scaleType,
        int numberOfLocation, int numberOfRoute,int zoomLevel, int releaseYear,
        double mapSize, double rating,double latitude, double longitude,
        float version,boolean onlineAvailable, boolean supportsNavigation) {

        this.mapName = mapName;
        this.country = country;
        this.state = state;
        this.city = city;
        this.language = language;
        this.mapType = mapType;
        this.createdBy = createdBy;
        this.projectionType = projectionType;
        this.scaleType = scaleType;
        this.numberOfLocation = numberOfLocation;
        this.numberOfRoute = numberOfRoute;
        this.zoomLevel = zoomLevel;
        this.releaseYear = releaseYear;
        this.mapSize = mapSize;
        this.rating = rating;
        this.latitude = latitude;
        this.longitude = longitude;
        this.version = version;
        this.onlineAvailable = onlineAvailable;
        this.supportsNavigation = supportsNavigation;
    }

    void displayInfo() {

        System.out.println("Map Name: " + mapName);
        System.out.println("Country: " + country);
        System.out.println("State: " + state);
        System.out.println("City: " + city);
        System.out.println("Language: " + language);
        System.out.println("Map Type: " + mapType);
        System.out.println("Created By: " + createdBy);
        System.out.println("Projection Type: " + projectionType);
        System.out.println("Scale Type: " + scaleType);
		System.out.println("Number Of Locations: " + numberOfLocation);
        System.out.println("Number Of Routes: " + numberOfRoute);
        System.out.println("Zoom Level: " + zoomLevel);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Map Size: " + mapSize);
        System.out.println("Rating: " + rating);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
        System.out.println("Version: " + version);
        System.out.println("Online Available: " + onlineAvailable);
        System.out.println("Supports Navigation: " + supportsNavigation);
    }
}


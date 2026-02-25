class Track {

    String trackName;
    double length;
    String location;
    String surfaceType;
    int numberOfLane;

    Track() {

    }

    Track(String trackName, double length, String location, String surfaceType, int numberOfLane) {
        this.trackName = trackName;
        this.length = length;
        this.location = location;
        this.surfaceType = surfaceType;
        this.numberOfLane = numberOfLane;
    }

    Track(String trackName, double length) {
        this.trackName = trackName;
        this.length = length;
    }

    Track(String location, String surfaceType, int numberOfLane) {
        this.location = location;
        this.surfaceType = surfaceType;
        this.numberOfLane = numberOfLane;
    }

    Track(double length) {
        this.length = length;
    }

    Track(int numberOfLanes) {
        this.numberOfLane = numberOfLane;
    }
}
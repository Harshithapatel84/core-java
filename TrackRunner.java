class TrackRunner {

    public static void main(String[] args) {

        Track track1 = new Track("National Stadium Track", 400, "Bangalore", "Synthetic", 8);
        System.out.println("Track1 Name: " + track1.trackName);
        System.out.println("Track1 Length: " + track1.length);
        System.out.println("Track1 Location: " + track1.location);
        System.out.println("Track1 Surface: " + track1.surfaceType);
        System.out.println("Track1 Lanes: " + track1.numberOfLane);


        Track track2 = new Track("City Track", 200);
        System.out.println("Track2 Name: " + track2.trackName);
        System.out.println("Track2 Length: " + track2.length);
        System.out.println("Track2 Location: " + track2.location);
        System.out.println("Track2 Surface: " + track2.surfaceType);
        System.out.println("Track2 Lanes: " + track2.numberOfLane);
    }
}
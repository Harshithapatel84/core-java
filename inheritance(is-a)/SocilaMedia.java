class SocilaMedia extends Media{
    String platformName;
    int launchYear;
    String country;
    String headquarter;
    boolean active;

    SocilaMedia(){
        System.out.println("  executing SocilaMedia object platform");
    }

    void display(){
		System.out.println("display the social meadia platform with name.....");
        System.out.println("PlatformName:"+platformName+
        ",LaunchYear:"+launchYear+
        ",Country:"+country+
        ",Headquarter:"+headquarter+
        ",Active:"+active);
    }
}
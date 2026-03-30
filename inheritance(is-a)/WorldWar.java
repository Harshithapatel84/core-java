class WorldWar extends War{
    int countriesInvolved;
    int duration;
    String result;
    boolean impact;
    String leader;

    WorldWar(){
        super();
        System.out.println("executing the WorldWar");
    }

    void display(){
        System.out.println("CountriesInvolved:"+countriesInvolved+",Duration:"+duration+
        ",Result:"+result+",GlobalImpact:"+impact+",Leader:"+leader);
    }
}
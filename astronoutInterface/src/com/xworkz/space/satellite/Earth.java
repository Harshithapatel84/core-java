package com.xworkz.space.satellite;

public interface Earth {
      double distanceFromMoon=384400;
      int rotation=1;
      int order=3;

    void rotate();
    void revolve();
    void supportLife();

    default  void action()
    {
        System.out.println("executing the earth existence with actions");
    }
    default  void live()
    {
        System.out.println("there are many living species on theearth");
    }
    static void printInfo()

    {
        System.out.println("earth supports for existing life");
    }

}

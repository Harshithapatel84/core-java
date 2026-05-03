package com.xworkz.space.satellite;

public interface Earth {
      double distanceFromMoon=384400;
      int order=3;

    void rotate();
    void revolve();
    void supportLife();

    default  void action()
    {
        System.out.println("executing the earth existence with actions");
    }

    static void printInfo()
    {
        System.out.println("earth supports for existing life");
    }

}

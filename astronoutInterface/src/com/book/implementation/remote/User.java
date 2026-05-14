package com.book.implementation.remote;

import java.util.PrimitiveIterator;

public class User {
   private Remote remote;

   public User(Remote remote)
   {
       this.remote=remote;
   }
   public void changeChannel()
   {
       if(this.remote!=null)
       {
           this.remote.turnOn();
           this.remote.turnOff();
           System.out.println("performs operation.....");
       }
   }


}

package com.book.implementation.bluetooth;

public class Device {

     private Bluetooth bluetooth;

      public Device(Bluetooth bluetooth)
     {
          this.bluetooth=bluetooth;
     }
     public void playMusic()
     {
          System.out.println("start playing music from device");
          if(this.bluetooth!=null) {
               this.bluetooth.connect();
               System.out.println("playting music");

          }
          else{
               System.out.println("not connected to bluetooth......");
          }

     }
     public void stopMusic()
     {
          System.out.println("stop playing music");
          if(this.bluetooth!=null)
          {
               this.bluetooth.disconnect();
               System.out.println("disconnted rom play music");
          }
          else{
               System.out.println("bluetooth not connected");
          }
     }


     
}

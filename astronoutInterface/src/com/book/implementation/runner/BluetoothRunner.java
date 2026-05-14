package com.book.implementation.runner;

import com.book.implementation.bluetooth.Bluetooth;
import com.book.implementation.bluetooth.Device;
import com.book.implementation.bluetooth.impl.AppleBluetooth;
import com.book.implementation.bluetooth.impl.RealMeBluetooth;
import com.book.implementation.hospital.Doctor;
import com.book.implementation.hospital.Hospital;
import com.book.implementation.hospital.impl.AppoloHospital;
import com.book.implementation.remote.Remote;
import com.book.implementation.remote.User;
import com.book.implementation.remote.impl.AcRemote;
import com.book.implementation.remote.impl.TvRemote;
import com.book.implementation.superMarket.Producer;
import com.book.implementation.superMarket.SuperMarket;
import com.book.implementation.superMarket.impl.DMartSuperMarket;

public class BluetoothRunner {
    public static void main(String[] args) {
        Bluetooth bluetooth=new RealMeBluetooth();
        Device device=new Device(bluetooth);
        device.playMusic();
        device.stopMusic();

        Hospital hospital=new AppoloHospital();
        Doctor doctor=new Doctor(hospital);
        doctor.appointment();

        Remote remote=new AcRemote();
        User user=new User(remote);
        user.changeChannel();

        SuperMarket superMarket=new DMartSuperMarket();
        Producer producer=new Producer(superMarket);
        producer.sell();





    }
}

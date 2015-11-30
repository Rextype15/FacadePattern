package mx.iteso.facade.impl;

import mx.iteso.facade.SoundSystem;

public class Bose implements SoundSystem {
    public void on() {
        System.out.println("Bose Surround System is turning ON");
        System.out.println("Bose Surround System is ON");
    }

    public void off() {
        System.out.println("Bose Surround System is turning OFF");
        System.out.println("Bose Surround System is OFF");

    }

    public void toOpticalEntry() {
        System.out.println("Changing Bose input to Optical");
    }
}

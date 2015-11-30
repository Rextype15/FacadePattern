package mx.iteso.facade.impl;

import mx.iteso.facade.Router;

public class Linksys  implements Router {
    public void on() {
        System.out.println("Linksys router is ON");
    }

    public void off() {
        System.out.println("Linksys router is OFF");
    }

    public void checkInternet() {
        System.out.println("Checking internet connection");
        System.out.println("Internet connection is OK");
    }
}

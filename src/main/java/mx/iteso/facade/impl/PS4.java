package mx.iteso.facade.impl;

import mx.iteso.facade.GameConsole;
import mx.iteso.facade.VideoGame;

public class PS4  implements GameConsole {
    public void on() {
        System.out.println("Play Station 4 is ON");
    }

    public void off() {
        System.out.println("Play Station 4 is OFF");
    }

    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into Play Station 4");
    }
}

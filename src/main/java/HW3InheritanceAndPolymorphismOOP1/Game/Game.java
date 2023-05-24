package main.java.HW3InheritanceAndPolymorphismOOP1.Game;

import main.java.HW3InheritanceAndPolymorphismOOP1.Interfaces.InterfacesForGame.ShareResult;

public abstract class Game implements ShareResult {
    public String nameOfTheGame;
    public int releaseDateYear;

    public Game(String nameOfTheGame, int releaseDateYear) {
        this.nameOfTheGame = nameOfTheGame;
        this.releaseDateYear = releaseDateYear;
    }

    public abstract void downloadGame();
}


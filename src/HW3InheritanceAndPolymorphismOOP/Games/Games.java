package HW3.InheritanceAndPolymorphismOOP.Games;

import HW3.InheritanceAndPolymorphismOOP.Interfaces.InterfacesForGames.ShareResult;

abstract public class Games implements ShareResult {
    protected String nameOfTheGame;
    protected int releaseDateYear;

    protected Games(String nameOfTheGame, int releaseDateYear) {
        this.nameOfTheGame = nameOfTheGame;
        this.releaseDateYear = releaseDateYear;
    }

    protected abstract void downloadGame();
}

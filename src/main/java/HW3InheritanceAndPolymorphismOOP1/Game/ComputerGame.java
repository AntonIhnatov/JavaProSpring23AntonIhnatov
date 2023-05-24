package main.java.HW3InheritanceAndPolymorphismOOP1.Game;

public abstract class ComputerGame extends Game{

    public ComputerGame(String nameOfTheGame, int releaseDateYear) {
        super(nameOfTheGame, releaseDateYear);
    }

    public void pauseGame() {
        System.out.println("Pause a game " + nameOfTheGame);
    }

    @Override
    public void downloadGame() {
        System.out.println("Download a game with name " + nameOfTheGame);
    }

    @Override
    public void reviewOnSteam() {
        System.out.println("Reviewing a "+ nameOfTheGame + " on Steam");
    }

    @Override
    public void reviewOnEpicGames() {
        System.out.println("Reviewing a " + nameOfTheGame + " on Epic Games");
    }

    @Override
    public void shareResultOnFacebook() {
        System.out.println("Reviewing result of " + nameOfTheGame + " on Epic Games");
    }

    @Override
    public void shareResultOnYouTube() {
        System.out.println("Reviewing result of " + nameOfTheGame + " on YouTube");
    }
}

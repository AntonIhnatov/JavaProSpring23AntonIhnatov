package HW3.InheritanceAndPolymorphismOOP.Games;

public class ComputerGames extends Games {
    protected ComputerGames(String nameOfTheGame, int releaseDateYear) {
        super(nameOfTheGame, releaseDateYear);
    }

    @Override
    public void downloadGame() {
        System.out.println("Download a game with name " + nameOfTheGame + " ...");
    }

    public void PauseGame(){
        System.out.println("Pause a game " + nameOfTheGame + "...");
    }

    @Override
    public void ReviewOnSteam() {
        System.out.println("Reviewing a "+ nameOfTheGame + " on Steam");
    }

    @Override
    public void ReviewOnEpicGames() {
        System.out.println("Reviewing a " + nameOfTheGame + " on Epic Games");
    }

    @Override
    public void ShareResultOnFacebook() {
        System.out.println("Reviewing result of " + nameOfTheGame + " on Epic Games");
    }

    @Override
    public void ShareResultOnYouTube() {
        System.out.println("Reviewing result of " + nameOfTheGame + " on YouTube");
    }
}

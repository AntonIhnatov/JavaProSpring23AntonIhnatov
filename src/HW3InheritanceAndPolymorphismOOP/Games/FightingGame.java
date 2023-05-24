package HW3.InheritanceAndPolymorphismOOP.Games;

public final class FightingGame extends ComputerGames{
    public FightingGame(String nameOfTheGame, int releaseDateYear) {
        super(nameOfTheGame, releaseDateYear);
    }

    public void playFightingGame(){
        System.out.println("Start playing fighting");
    }
}

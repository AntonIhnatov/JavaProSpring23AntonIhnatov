package HW3.InheritanceAndPolymorphismOOP.Games;

public final class StrategyGame extends ComputerGames{
    public StrategyGame(String nameOfTheGame, int releaseDateYear) {
        super(nameOfTheGame, releaseDateYear);
    }


    public void playStrategyGame(){
        System.out.println("Start playing strategy");
    }
}

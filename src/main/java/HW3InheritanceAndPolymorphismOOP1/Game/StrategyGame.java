package main.java.HW3InheritanceAndPolymorphismOOP1.Game;

public class StrategyGame extends ComputerGame{
    public StrategyGame(String nameOfTheGame, int releaseDateYear) {
        super(nameOfTheGame, releaseDateYear);
    }
    public void playStrategyGame() {
        System.out.println("Start playing strategy - " + nameOfTheGame);
    }

}

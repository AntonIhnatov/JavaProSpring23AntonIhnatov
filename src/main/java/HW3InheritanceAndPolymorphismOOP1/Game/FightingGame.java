package main.java.HW3InheritanceAndPolymorphismOOP1.Game;

public class FightingGame extends ComputerGame{
    public FightingGame(String nameOfTheGame, int releaseDateYear) {
        super(nameOfTheGame, releaseDateYear);
    }

    public void playFightingGame() {
        System.out.println("Start playing fighting - " + nameOfTheGame);
    }
}

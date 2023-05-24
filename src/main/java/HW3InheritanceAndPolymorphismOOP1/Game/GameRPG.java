package main.java.HW3InheritanceAndPolymorphismOOP1.Game;

public class GameRPG extends ComputerGame{
    public GameRPG(String nameOfTheGame, int releaseDateYear) {
        super(nameOfTheGame, releaseDateYear);
    }
    public void playGameRPG() {
        System.out.println("Start playing RPG - " + nameOfTheGame);
    }

}

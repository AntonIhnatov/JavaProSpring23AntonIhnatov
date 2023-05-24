package HW3.InheritanceAndPolymorphismOOP.Games;

public final class GameRPG extends ComputerGames{
    public GameRPG(String nameOfTheGame, int releaseDateYear) {
        super(nameOfTheGame, releaseDateYear);
    }

    public void playGameRPG(){
        System.out.println("Start playing RPG");
    }
}


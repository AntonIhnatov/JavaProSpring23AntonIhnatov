package main.java.HW3InheritanceAndPolymorphismOOP1;

import main.java.HW3InheritanceAndPolymorphismOOP1.Game.*;
import main.java.HW3InheritanceAndPolymorphismOOP1.Vehicle.*;

public class Main {
    public static void main(String[] args) {
        FightingGame fightingGame = new FightingGame("Mortal Combat 11", 2019);
        fightingGame.downloadGame();
        fightingGame.pauseGame();
        fightingGame.playFightingGame();

        System.out.println("---------------------------------------------------------------------------------------------");

        GameRPG gameRPG = new GameRPG("Skyrim", 2011);
        gameRPG.downloadGame();
        gameRPG.pauseGame();
        gameRPG.playGameRPG();

        System.out.println("---------------------------------------------------------------------------------------------");

        StrategyGame strategyGame = new StrategyGame("Mortal Combat 11", 2019);
        strategyGame.downloadGame();
        strategyGame.pauseGame();
        strategyGame.playStrategyGame();

        System.out.println("---------------------------------------------------------------------------------------------");
        DieselEngineCar dieselEngineCar = new DieselEngineCar("Jeep", 2013);
        dieselEngineCar.startEngine();
        dieselEngineCar.carHorn();
        dieselEngineCar.methodOfDieselEngine();

        System.out.println("---------------------------------------------------------------------------------------------");

        PetrolEngineCar petrolEngineCar = new PetrolEngineCar("Nissan", 2012);
        petrolEngineCar.startEngine();
        petrolEngineCar.carHorn();
        petrolEngineCar.methodOfPetrolEngine();

        System.out.println("---------------------------------------------------------------------------------------------");

        ElectricEngineCar electricEngineCar = new ElectricEngineCar("Tesla", 2021);
        electricEngineCar.startEngine();
        electricEngineCar.carHorn();
        electricEngineCar.methodOfElectricMotor();

        System.out.println("---------------------------------------------------------------------------------------------");

        Vehicle vehicle = new ElectricEngineCar("Proterra", 2021);
        vehicle.checkBrakeSystem();
        vehicle.checkCarEngine();
        vehicle.checkCoolingSystem();
        vehicle.checkOilFilter();
        vehicle.tireReplacement();
        vehicle.changeOfOil();

        System.out.println("---------------------------------------------------------------------------------------------");

        Game game = new GameRPG("Fallout 4", 2015 );
        game.reviewOnEpicGames();
        game.reviewOnSteam();
        game.shareResultOnFacebook();
        game.shareResultOnYouTube();

        System.out.println("---------------------------------------------------------------------------------------------");

        Vehicle vehicle1 = new ElectricEngineCar("Tesla", 2019);
        vehicle1.checkBrakeSystem();
        vehicle1.checkCarEngine();
        vehicle1.checkCoolingSystem();
        vehicle1.checkOilFilter();
        vehicle1.tireReplacement();
        vehicle1.changeOfOil();


        System.out.println("---------------------------------------------------------------------------------------------");

        Game game1 = new GameRPG("Fallout 1", 1997 );
        game1.downloadGame();
        game1.reviewOnEpicGames();
        game1.reviewOnSteam();
        game1.shareResultOnFacebook();
        game1.shareResultOnYouTube();


    }
}

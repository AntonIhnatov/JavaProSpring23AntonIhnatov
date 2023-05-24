package HW3.InheritanceAndPolymorphismOOP;

import HW3.InheritanceAndPolymorphismOOP.Games.*;
import HW3.InheritanceAndPolymorphismOOP.Vehicle.DieselEngineCar;
import HW3.InheritanceAndPolymorphismOOP.Vehicle.ElectricMotorCar;
import HW3.InheritanceAndPolymorphismOOP.Vehicle.PetrolEngineCar;
import HW3.InheritanceAndPolymorphismOOP.Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {

        PetrolEngineCar petrolEngineCar = new PetrolEngineCar("Nissan", 2012);
        petrolEngineCar.startEngine();
        petrolEngineCar.carHorn();
        petrolEngineCar.methodOfPetrolEngine();


        DieselEngineCar dieselEngineCar = new DieselEngineCar("Jeep", 2013);
        dieselEngineCar.startEngine();
        dieselEngineCar.carHorn();
        dieselEngineCar.methodOfDieselEngine();


        ElectricMotorCar electricMotorCar = new ElectricMotorCar("Tesla", 2022);
        electricMotorCar.methodOfElectricMotor();
        electricMotorCar.startEngine();
        electricMotorCar.carHorn();


        FightingGame fightingGame = new FightingGame("Mortal Combat 11", 2019);
        fightingGame.downloadGame();
        fightingGame.PauseGame();
        fightingGame.playFightingGame();


        GameRPG gameRPG = new GameRPG("Skyrim", 2011);
        gameRPG.downloadGame();
        gameRPG.PauseGame();
        gameRPG.playGameRPG();

        StrategyGame strategyGame = new StrategyGame("StarCraft 2", 2010);
        strategyGame.downloadGame();
        strategyGame.PauseGame();
        strategyGame.playStrategyGame();


        Vehicle vehicle = new ElectricMotorCar("Proterra", 2021);
        vehicle.checkBrakeSystem();
        vehicle.checkCarEngine();
        vehicle.checkCoolingSystem();
        vehicle.checkOilFilter();
        vehicle.offSeasonTIMethod();

        Games game = new GameRPG("Fallout 4", 2015 );
        game.ReviewOnEpicGames();
        game.ReviewOnSteam();
        game.ShareResultOnFacebook();
        game.ShareResultOnYouTube();
    }
}

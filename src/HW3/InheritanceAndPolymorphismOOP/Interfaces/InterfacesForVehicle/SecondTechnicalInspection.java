package HW3.InheritanceAndPolymorphismOOP.Interfaces.InterfacesForVehicle;

import HW3.InheritanceAndPolymorphismOOP.Interfaces.InterfacesForVehicle.FirstTechnicalInspection;

public interface SecondTechnicalInspection extends FirstTechnicalInspection {
    void checkCoolingSystem();
    void checkOilFilter();
}

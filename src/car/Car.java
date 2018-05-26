package car;

public class Car {
    int fuelTankSize;
    int efficiency;
    String modelName;

    public Car(String model, int tankSize, int efficiency){
        fuelTankSize = tankSize;
        this.efficiency = efficiency;
        modelName = model;
    }

    public double drive(){
        return fuelTankSize * efficiency;
    }
}

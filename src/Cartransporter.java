import java.awt.*;

public class Cartransporter extends TruckWithFlatbed{
    Loadable loadedCars;
    private FlatbedWithRamp cartransporterFlatbed;

    public Cartransporter(){
        super(2,70, Color.yellow, "Cartransporter");
            loadedCars = new Loadable(6);
            cartransporterFlatbed = new FlatbedWithRamp();
        }
    // public int getAmountOfLoadedCars() {
    //     return loadedCars.size();
    // }

    public void loadCar(Car car){
        if (getCurrentSpeed() == 0 && isFlatbedFastened() == false){
            loadedCars.loadCar(car,getX(),getY());
        }   
    }

    public void unloadLatestCar(){
        if (getCurrentSpeed() == 0) {
            loadedCars.unloadLatestCar(getX(),getY());
        }
    }

    public void lowerFlatbed() {
        cartransporterFlatbed.raiseFlatbed(this);
    }

    public void raiseFlatbed() {
       cartransporterFlatbed.raiseFlatbed(this);
    }

}
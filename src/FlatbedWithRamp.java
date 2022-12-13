public class FlatbedWithRamp {

    public void lowerFlatbed(TruckWithFlatbed other) {
        if (other.getCurrentSpeed() == 0) {
            other.setFlatbedFastened(true); 
        }
    }

    public void raiseFlatbed(TruckWithFlatbed other) {
        if (other.getCurrentSpeed() == 0) {
            other.setFlatbedFastened(false);
        }
    }
}

public class ServiceStation implements MyInyerface{


    @Override
    public void check(Bicycle bicycle){
        bicycle.identModel();
    }

    @Override
    public void check(Car car){
        car.identModel();
        car.checkEngine();
    }

    @Override
    public void check(Truck truck) {
        truck.identModel();
        truck.checkEngine();
        truck.checkTrailer();
    }
}

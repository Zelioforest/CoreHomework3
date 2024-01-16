//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ourPark car1 = new Car("car1", 4);
        ourPark car2 = new Car("car2", 4);

        ourPark truck = new Truck("truck1", 6);
        ourPark truck2 = new Truck("truck2", 8);

        ourPark bicycle = new Bicycle("bicycle1", 2);
        ourPark bicycle2 = new Bicycle("bicycle2", 2);




        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(car2);
        station.check(bicycle);
        station.check(bicycle2);
        station.check(truck);
        station.check(truck2);
    }
}
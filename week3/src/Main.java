import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DealerShip dealerShip = new DealerShip("My dealer",
                                                new CarService(),
                                                new InvoiceService());
        dealerShip.addCar(new Car("VW", "Golf 5", 2005, 5000));
        dealerShip.addCar(new Car("Audi", "A3", 2015, 19000));
        dealerShip.addCar(new Car("Ferrari", "F40", 1990, 4000000));
        dealerShip.addCar(new Car("VW", "Passat B6", 2005, 3000));

        List<Car> search = dealerShip.searchCars("VW", null, null, null);
        for (Car c : search){
            System.out.println(c);
        }

        dealerShip.sellCar(new Car("Ferrari", "F40", 1990, 4000000), "Rado");
        dealerShip.sellCar(new Car("VW", "Golf 5", 2005, 5000), "Maria");
        dealerShip.sellCar(new Car("VW", "Passat B6", 2005, 3000), "Ivan");

        Map<String, Integer> salesByMake = dealerShip.getSalesByMake();

        salesByMake.forEach((name, count) -> System.out.println(name + " " + count));
    }
}
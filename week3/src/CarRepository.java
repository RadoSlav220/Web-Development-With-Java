import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarRepository {
    private Map<Car, Integer> cars;

    public CarRepository(){
        cars = new HashMap<Car, Integer>();
    }

    public void addCar(Car car){
        Integer count = cars.get(car);
        if (count == null){
            cars.put(car, 1);
        }
        else {
            cars.put(car, count + 1);
        }
    }

    public void removeCar(Car car){
        Integer count = cars.get(car);
        if (count != null){
            if (count == 1){
                cars.remove(car);
            }
            else {
                cars.put(car, count - 1);
            }
        }
    }

    public List<Car> searchCars(String make, String model, Integer year, Double price){
        return cars.keySet().stream()
                .filter((car)->meetsRequirements(car, make, model, year, price))
                .toList();
    }
    
    private boolean meetsRequirements(Car car, String make, String model, Integer year, Double price){
        return (make == null || car.getMake().equals(make)) &&
                (model == null || car.getModel().equals(model)) &&
                (year == null || car.getYear() == year) &&
                (price == null || car.getPrice() == price);
    }
}

import java.util.Date;
import java.util.List;

public class CarService {

    public static final double taxRate = 50;
    private CarRepository carRepo;

    public CarService(){
        carRepo = new CarRepository();
    }

    public void addCar(Car car){
        carRepo.addCar(car);
    }

    public boolean removeCar(Car car){
        return carRepo.removeCar(car);
    }

    public List<Car> searchCars(String make, String model, Integer year, Double price){
        return carRepo.searchCars(make, model, year, price);
    }

    public List<Car> getAllCars(){
        return carRepo.getAllCars();
    }

    //Returns null if the sale is not possible (The car is unavailable)
    public Invoice sellCar(Car car, String customerName){
        return removeCar(car) ? new Invoice(customerName, new Date(), car, taxRate) : null;
    }

    public void printInvoice(Invoice invoice){
        System.out.println(invoice);
    }
}

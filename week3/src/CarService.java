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

    public void removeCar(Car car){
        carRepo.removeCar(car);
    }

    public List<Car> searchCars(String make, String model, Integer year, Double price){
        return carRepo.searchCars(make, model, year, price);
    }

    public List<Car> getAllCars(){
        return carRepo.getAllCars();
    }

    public Invoice sellCar(Car car, String customerName){
        return new Invoice(customerName, new Date(), car, taxRate);
    }

    public void printInvoice(Invoice invoice){
        System.out.println(invoice);
    }
}

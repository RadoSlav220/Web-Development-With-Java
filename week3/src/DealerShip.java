import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DealerShip {
    private String name;
    private CarService carService;
    private InvoiceService invoiceService;
    private Map<String, Integer> salesByMake;

    public DealerShip(String name, CarService carService, InvoiceService invoiceService) {
        this.name = name;
        this.carService = carService;
        this.invoiceService = invoiceService;
        this.salesByMake = new HashMap<String, Integer>();
    }

    public void addCar(Car car){
        carService.addCar(car);
    }

    public void removeCar(Car car){
        carService.removeCar(car);
    }

    public List<Car> searchCars(String make, String model, Integer year, Double price){
        return carService.searchCars(make, model, year, price);
    }

    public Map<String, Integer> getSalesByMake(){
        return salesByMake;
    }

    private void noteSale(String make){
        Integer alreadySold = salesByMake.get(make);
        if (alreadySold == null){
            salesByMake.put(make, 1);
        }
        else {
            salesByMake.put(make, alreadySold + 1);
        }
    }

    public Invoice sellCar(Car car, String customerName){
        Invoice invoice = carService.sellCar(car, customerName);
        if (invoice != null){
            invoiceService.addInvoice(invoice);
        }
        noteSale(car.getMake());
        return invoice;
    }

    public void printInvoice(Invoice invoice){
        System.out.println(invoice);
    }

    public double getTotalRevenue(){
        return invoiceService.calculateTotalPrice();
    }
}

import java.util.List;

public class DealerShip {
    private String name;
    private CarService carService;
    private InvoiceService invoiceService;

    public DealerShip(String name, CarService carService, InvoiceService invoiceService) {
        this.name = name;
        this.carService = carService;
        this.invoiceService = invoiceService;
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

    public Invoice sellCar(Car car, String customerName){
        Invoice invoice = carService.sellCar(car, customerName);
        if (invoice != null){
            invoiceService.addInvoice(invoice);
        }
        return invoice;
    }

    public void printInvoice(Invoice invoice){
        System.out.println(invoice);
    }

    public double getTotalRevenue(){
        return invoiceService.calculateTotalPrice();
    }
}

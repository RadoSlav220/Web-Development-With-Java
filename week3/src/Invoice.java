import java.util.Date;

public class Invoice {
    private String customersName;
    private Date purchaseDate;
    private Car car;
    private double taxRate;

    public Invoice(String customersName, Date purchaseDate, Car car, double taxRate) {
        this.customersName = customersName;
        this.purchaseDate = purchaseDate;
        this.car = car;
        this.taxRate = taxRate;
    }

    public String getCustomersName() {
        return customersName;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTotalPrice(){
        return car.getPrice() + taxRate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "customersName='" + customersName + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", car=" + car +
                ", taxRate=" + taxRate +
                ", totalPrice=" + getTotalPrice() +
                '}';
    }
}

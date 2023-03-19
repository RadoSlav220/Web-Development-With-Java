import java.util.List;

public class InvoiceService {
    private InvoiceRepository invoiceRepo;

    public InvoiceService(){
        invoiceRepo = new InvoiceRepository();
    }

    public void addInvoice(Invoice inv){
        invoiceRepo.addInvoice(inv);
    }

    public List<Invoice> getInvoiceHistory(){
        return invoiceRepo.getInvoiceHistory();
    }

    public double calculateTotalPrice(){
        double totalPrice = 0;
        for (Invoice inv : getInvoiceHistory()){ //Will this actually work?
            totalPrice += inv.getTotalPrice();
        }
        return totalPrice;
    }
}

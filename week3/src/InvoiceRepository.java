import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class InvoiceRepository {
    private Set<Invoice> invoices;

    public InvoiceRepository(){
        invoices = new LinkedHashSet<Invoice>();
    }

    public void addInvoice(Invoice inv){
        invoices.add(inv);
    }

    public List<Invoice> getInvoiceHistory(){
        return invoices.stream().toList();
    }
}

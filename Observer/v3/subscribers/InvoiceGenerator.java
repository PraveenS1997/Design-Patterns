package Observer.v3.subscribers;

import Observer.services.InvoiceService;
import Observer.v3.Amazon;

public class InvoiceGenerator implements OrderPlacedEventSubscriber{
    private final InvoiceService invoiceService;

    public InvoiceGenerator(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
        Amazon.getInstance().registerSubscriber(this);
    }
    @Override
    public void onOrderPlaced(Object orderDetails) {
        invoiceService.generateInvoice();
    }
}

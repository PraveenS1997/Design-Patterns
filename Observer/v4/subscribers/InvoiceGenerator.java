package Observer.v4.subscribers;

import Observer.services.InvoiceService;
import Observer.v4.Amazon;
import Observer.v4.EventType;

public class InvoiceGenerator implements Subscriber {
    private final InvoiceService invoiceService;

    public InvoiceGenerator(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
        Amazon.getInstance().getEventManager().registerSubscriber(EventType.OrderPlaced,this);
    }
    @Override
    public void update(Object orderDetails) {
        System.out.print(orderDetails.toString() + " ");
        invoiceService.generateInvoice();
    }
}

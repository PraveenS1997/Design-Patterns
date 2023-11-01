package Observer.v4.subscribers;

import Observer.services.EmailService;
import Observer.v4.Amazon;
import Observer.v4.EventType;

public class EmailSender implements Subscriber {
    private final EmailService emailService;

    public EmailSender(EmailService emailService){
        this.emailService = emailService;
        Amazon.getInstance().getEventManager().registerSubscriber(EventType.OrderPlaced,this);
    }

    @Override
    public void update(Object orderDetails) {
        System.out.print(orderDetails.toString() + " ");
        emailService.sendEmail();
    }
}

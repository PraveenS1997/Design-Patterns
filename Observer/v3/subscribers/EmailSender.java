package Observer.v3.subscribers;

import Observer.services.EmailService;
import Observer.v3.Amazon;

public class EmailSender implements OrderPlacedEventSubscriber{
    private final EmailService emailService;

    public EmailSender(EmailService emailService){
        this.emailService = emailService;
        Amazon.getInstance().registerSubscriber(this);
    }

    @Override
    public void onOrderPlaced(Object orderDetails) {
        emailService.sendEmail();
    }
}

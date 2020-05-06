package di.injector;

import di.consumer.Consumer;
import di.consumer.MyDIApplication;
import di.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}

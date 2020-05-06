package di.injector;

import di.consumer.Consumer;
import di.consumer.MyDIApplication;
import di.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}

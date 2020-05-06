package di.injector;

import di.consumer.Consumer;
import di.consumer.MyDIApplication2;
import di.service.EmailServiceImpl;

public class EmailServiceInjector2 implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        MyDIApplication2 app = new MyDIApplication2();
        app.setService(new EmailServiceImpl());
        return app;
    }
}

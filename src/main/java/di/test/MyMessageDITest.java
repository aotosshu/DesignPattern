package di.test;

import di.consumer.Consumer;
import di.consumer.MyDIApplication;
import di.injector.EmailServiceInjector;
import di.injector.MessageServiceInjector;
import di.injector.SMSServiceInjector;

public class MyMessageDITest {

    public static void main(String[] args) {
        String message = "Hi Test user";
        String email = "example@example.com";
        String phone = "99999999999";

        // send email
        consume(new EmailServiceInjector(), message, email);

        // send SMS
        consume(new SMSServiceInjector(), message, phone);

        // mock the injector with anonymous class
        MessageServiceInjector injector = () -> {
            // mock the message service
            return new MyDIApplication((m, r) -> System.out.println("Mock Message sent to " + r + " with Message=" + m));
        };
        consume(injector, message, email);
    }

    private static void consume(MessageServiceInjector injector, String message, String receiver) {
        Consumer app = injector.getConsumer();
        app.processMessages(message, receiver);
    }
}

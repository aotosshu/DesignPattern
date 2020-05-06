package di.consumer;

import di.service.MessageService;

public class MyDIApplication2 implements Consumer {

    private MessageService service;

    // setter dependency injection
    public void setService(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessages(String message, String receiver) {
        // do some msg validation, manipulation logic etc
        this.service.sendMessage(message, receiver);
    }
}

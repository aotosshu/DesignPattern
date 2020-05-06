package di.legacy;

public class MyLegacyTest {

    public static void main(String[] args) {
        MyApplication app = new MyApplication();
        app.processMessages("Hi Test User", "example@example.com");
    }
}

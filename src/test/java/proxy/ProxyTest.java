package proxy;

public class ProxyTest {

    public static void main(String[] args) {

        CommandExecutor executor = new CommandExecutorProxy("user", "wrong_pwd");
        try {
            executor.runCommand("cmd /c dir /od");
            executor.runCommand("cmd /c rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}

package adapter;

public class Test {

    public static void main(String[] args) {
        testAdapter(new SocketObjectAdapterImpl());
        testAdapter(new SocketClassAdapterImpl());
    }

    private static void testAdapter(SocketAdapter socketAdapter) {
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);
        String adapterName = socketAdapter.getClass().getSimpleName();
        System.out.println("v3 volts using " + adapterName + "=" + v3.getVolts());
        System.out.println("v12 volts using " + adapterName + "=" + v12.getVolts());
        System.out.println("v120 volts using " + adapterName + "=" + v120.getVolts());
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3:
                return socketAdapter.get3Volt();
            case 12:
                return socketAdapter.get12Volt();
            case 120:
            default:
                return socketAdapter.get120Volt();
        }
    }
}

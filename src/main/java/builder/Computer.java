package builder;

public class Computer {

    // required parameters
    private String HDD;
    private String RAM;
    // optional parameters
    private boolean graphicsCardEnabled;
    private boolean bluetoothEnabled;

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isGraphicsCardEnabled() {
        return graphicsCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return bluetoothEnabled;
    }

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.graphicsCardEnabled = builder.graphicsCardEnabled;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }

    @Override
    public String toString() {
        return "RAM=" + this.getRAM() + ", HDD=" + this.getHDD()
                + ", graphicsCardEnabled=" + this.isBluetoothEnabled()
                + ", bluetoothEnabled=" + this.isBluetoothEnabled();
    }

    public static class ComputerBuilder {

        private String HDD;
        private String RAM;
        private boolean graphicsCardEnabled;
        private boolean bluetoothEnabled;

        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            this.graphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

package command;

public class Test {

    public static void main(String[] args) {
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();
        execute(new OpenFileCommand(fs));
        execute(new WriteFileCommand(fs));
        execute(new CloseFileCommand(fs));
    }

    private static void execute(Command c) {
        FileInvoker file = new FileInvoker(c);
        file.execute();
    }
}

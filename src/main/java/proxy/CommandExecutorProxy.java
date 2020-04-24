package proxy;

public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd) {

        isAdmin = "user".equals(user) && "pwd".equals(pwd);
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {

        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.contains(" rm ")) {
                throw new Exception("rm command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}

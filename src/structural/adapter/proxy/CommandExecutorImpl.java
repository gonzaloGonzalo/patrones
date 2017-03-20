package structural.adapter.proxy;

import java.io.IOException;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        //some heavy implementation
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }

}
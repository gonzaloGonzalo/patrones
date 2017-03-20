package structural.adapter.proxy;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public interface CommandExecutor {

    public void runCommand(String cmd) throws Exception;
}
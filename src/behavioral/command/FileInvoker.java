package behavioral.command;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class FileInvoker {

    public Command command;

    public FileInvoker(Command c) {
        this.command = c;
    }

    public void execute() {
        this.command.execute();
    }
}

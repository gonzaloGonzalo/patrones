package behavioral.command;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class WriteFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public WriteFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.writeFile();
    }

}

package behavioral.command;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class CloseFileCommand implements Command {

    private FileSystemReceiver fileSystem;

    public CloseFileCommand(FileSystemReceiver fs) {
        this.fileSystem = fs;
    }

    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}

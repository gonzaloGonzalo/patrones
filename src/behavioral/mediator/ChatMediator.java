package behavioral.mediator;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public interface ChatMediator {

    public void sendMessage(String msg, User user);

    void addUser(User user);
}
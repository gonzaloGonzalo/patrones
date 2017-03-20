package behavioral.observer;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public interface Observer {

    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}
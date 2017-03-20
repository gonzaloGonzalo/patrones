package behavioral.iterator;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);

}
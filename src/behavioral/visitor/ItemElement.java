package behavioral.visitor;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);
}

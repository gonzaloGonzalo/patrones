package behavioral.visitor;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public interface ShoppingCartVisitor {

    int visit(Book book);

    int visit(Fruit fruit);
}

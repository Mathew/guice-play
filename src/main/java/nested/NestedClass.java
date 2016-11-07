package nested;

import com.google.inject.Inject;
import named.NamedClass;
import simple.SimpleClass;

/**
 * Created by mathew on 07/11/2016.
 */
public class NestedClass implements NestedInterface {
    private SimpleClass simple;
    private NamedClass named;

    @Inject
    public NestedClass(SimpleClass simple, NamedClass named) {
        this.simple = simple;
        this.named = named;
    }

    public String helloYou() {
        return named.helloYou();
    }

    public void hello() {
        simple.hello();
    }
}

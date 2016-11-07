package simple;

import com.google.inject.Inject;

/**
 * Created by mathew on 07/11/2016.
 */
public class SimpleClass implements SimpleInterface {

    @Inject
    public SimpleClass() {}

    public void hello () {
        System.out.println("Hello World!");
    }
}

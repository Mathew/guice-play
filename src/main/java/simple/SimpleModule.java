package simple;

import com.google.inject.AbstractModule;

/**
 * Created by mathew on 07/11/2016.
 */
public class SimpleModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(SimpleInterface.class).to(SimpleClass.class);
    }
}

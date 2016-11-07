package nested;

import com.google.inject.AbstractModule;
import named.NamedModule;
import simple.SimpleModule;

/**
 * Created by mathew on 07/11/2016.
 */
public class NestedModule extends AbstractModule{
    @Override
    protected void configure() {
        bind(NestedInterface.class).to(NestedClass.class);
        install(new SimpleModule());
        install(new NamedModule());
    }
}

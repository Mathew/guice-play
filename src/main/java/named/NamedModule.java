package named;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * Created by mathew on 07/11/2016.
 */
public class NamedModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(NamedInterface.class).to(NamedClass.class);
        bindConstant().annotatedWith(Names.named("name")).to("Mat");
    }
}

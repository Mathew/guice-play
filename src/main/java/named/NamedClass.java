package named;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created by mathew on 07/11/2016.
 */
public class NamedClass implements NamedInterface{

    private String name;

    @Inject
    public NamedClass(@Named("name") String name) {
        this.name = name;
    }

    public String helloYou() {
        return name;
    }

}

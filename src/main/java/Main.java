import com.google.inject.Guice;
import com.google.inject.Injector;
import named.NamedClass;
import named.NamedModule;
import nested.NestedClass;
import nested.NestedModule;
import simple.SimpleClass;
import simple.SimpleModule;

/**
 * Created by mathew on 07/11/2016.
 */
public class Main {

    public static void main(String[] args) {
        simpleExample();
        namedExample();
        multipleExample();
        nestedExample();
    }

    private static void simpleExample() {
        /*
        Demonstrate a class doesn't need bound to an interface to be used.
        Defining an empty module is best practice to avoid future wiring-up.
         */
        System.out.println("Simple Example:");
        Injector injector = Guice.createInjector(new SimpleModule());
        SimpleClass simple = injector.getInstance(SimpleClass.class);
        simple.hello();
    }

    private static void namedExample() {
        // Demonstrate the possible use of @Named for config.
        System.out.println("\nNamed Example:");
        Injector injector = Guice.createInjector(new NamedModule());
        NamedClass named = injector.getInstance(NamedClass.class);
        System.out.println(named.helloYou());
    }

    private static void multipleExample() {
        // Demonstrate creating an injector with multiple modules.
        System.out.println("\nMultiple Example:");
        Injector injector = Guice.createInjector(
            new SimpleModule(),
            new NamedModule()
        );

        injector.getInstance(SimpleClass.class).hello();
        System.out.println(
            injector.getInstance(NamedClass.class).helloYou()
        );
    }

    private static void nestedExample() {
        /*
        Demonstrate using the module definition to install multiple modules.
        Also shows multiple layers of injection.
         */
        System.out.println("\nNested Example:");
        Injector injector = Guice.createInjector(new NestedModule());
        NestedClass nested = injector.getInstance(NestedClass.class);
        nested.hello();
        System.out.println(nested.helloYou());
    }
}

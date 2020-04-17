package pe.edu.upc.gofdesignpatterns;

import pe.edu.upc.gofdesignpatterns.common.Showcase;
import pe.edu.upc.gofdesignpatterns.pattern.creational.builder.BuilderShowcase;
import pe.edu.upc.gofdesignpatterns.pattern.structural.adapter.AdapterShowcase;
import pe.edu.upc.gofdesignpatterns.pattern.structural.decorator.DecoratorShowcase;
import pe.edu.upc.gofdesignpatterns.pattern.structural.facade.FacadeShowcase;
import pe.edu.upc.gofdesignpatterns.pattern.structural.proxy.ProxyShowcase;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Showcase> gallery;
    public static void main(String[] args) {
          setup();
          showcase();
    }

    private static void setup() {
        gallery = new ArrayList<Showcase>();
        // Builder Pattern Showcase
        gallery.add(new BuilderShowcase());
        // Facade Pattern Showcase
        gallery.add(new FacadeShowcase());
        // Adapter Pattern Showcase
        gallery.add(new AdapterShowcase());
        // Decorator Pattern Showcase
        gallery.add(new DecoratorShowcase());
        // Proxy Pattern Showcase
        gallery.add(new ProxyShowcase());

    }
    private static void showcase() {
        for (Showcase showcase : gallery) {
            showcase.show();
        }
    }
}

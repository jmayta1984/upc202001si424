package pe.edu.upc.gofdesignpatterns.pattern.structural.facade;

import pe.edu.upc.gofdesignpatterns.common.Showcase;

public class FacadeShowcase implements Showcase {

    private final BusinessFacade facade;

    public FacadeShowcase() {
        facade = new BusinessFacade();
    }


    @Override
    public void show() {
        System.out.println("Facade Pattern Showcase");
        facade.addCustomer(new Customer("John", "Doe"));
        facade.addCategory(new Category("Premium"));
        System.out.println(String.format("We have %d Customers", facade.getAllCustomers().size()));
        System.out.println(String.format("We have %d Categories", facade.getAllCategories().size()));

    }


}

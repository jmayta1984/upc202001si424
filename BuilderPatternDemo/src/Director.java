public class Director {

    IBuilder mybuilder;

    public void construct(IBuilder builder){
        mybuilder = builder;
        mybuilder.buildBody();
        mybuilder.insertWheels();

    }
}

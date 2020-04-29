public class MyChildClass extends MyParentClass {

    @Override
    public void justAMethod() {
        System.out.println("Child class method");
    }

    @Deprecated
    public void deprecatedMethod( String message){
        System.out.println("Message: " + message);

    }
}

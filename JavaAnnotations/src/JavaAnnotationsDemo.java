public class JavaAnnotationsDemo {

    @SuppressWarnings("deprecation")

    public static void main(String[] args) {
        MyChildClass myChildClass = new MyChildClass();
        myChildClass.justAMethod();

        myChildClass.deprecatedMethod("Hello world");
    }
}

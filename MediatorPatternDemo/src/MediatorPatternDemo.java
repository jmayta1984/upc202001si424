public class MediatorPatternDemo {

    public static void main(String[] args) {
        User robert = new User("Robert");
        User albert = new User("Albert");

        robert.sentMessage("Hi Albert, good day");
        albert.sentMessage("Hello, good job");
    }
}

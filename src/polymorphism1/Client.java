package polymorphism1;

public class Client {
    public static void main(String[] args) {
        User user = new Mentor();
        user.printHello();

        //user.printBatch();
    }
}

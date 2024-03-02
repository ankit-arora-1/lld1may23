package runtimepolymorphism;

public class Client {
    public static void main(String[] args) {
        User user = new User();
        // user.doTask();

        TA ta = new TA();
        // ta.performTATask();
        // ta.doTask();

        User user2 = new Instructor();

        perform(user2);

    }

    public static void perform(User user) {
        user.doTask();
    }
}

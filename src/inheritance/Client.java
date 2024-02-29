package inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();

         instructor.username = "test";
         instructor.login();

         User user = new User();
         // user.avgRating = "20.0"; // --> Error as attribute is only present in child
    }
}

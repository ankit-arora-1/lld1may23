public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student neeraj = new Student();
        neeraj.name = "Neeraj";
//        neeraj.age = 24;
        neeraj.batch = "may23";
        neeraj.learn();

        Student raj = new Student();
        raj.name = "Raj";
        raj.age = 30;
//        raj.batch = "may24";
        raj.joinClass();

        System.out.println("Student created");

        String test = "this is a tset string";
        test.length();
    }
}
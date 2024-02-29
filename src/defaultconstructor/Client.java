package defaultconstructor;

public class Client {
    public static void main(String[] args) {
//        Student student = new Student();
//        System.out.println("DEBUG");

        Student student = new Student("Vaibhav", 10, "may23");

        Student student2 = new Student("imran", 20, "may24");

        System.out.println("DEBUG");

         // Student student3 = new student2();
    }
}

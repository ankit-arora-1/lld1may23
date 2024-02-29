package copyconstructor;

public class Client {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "aditya";
        student1.age = 20;
        student1.batch = "may23";

        Student student2 = new Student(student1);

        System.out.println("DEBUG");

    }
}

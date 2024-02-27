package accessmodifier;

public class Test {
    public void doSomething() {
        Student student = new Student();
        student.name = "anjali";
        // student.batch = "may23"; --> Will not work
        student.age = 20;
        student.psp = 80.9;
    }
}

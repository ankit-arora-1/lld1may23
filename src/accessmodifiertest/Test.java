package accessmodifiertest;

import accessmodifier.Student;

public class Test {
    public void doSomething() {
        Student student = new Student();
        student.name = "aryan";
//        student.batch = "may23"; --> Won't work
//        student.age = 20; --> Won't work
//        student.psp = 10.9; --> Won't work
    }
}

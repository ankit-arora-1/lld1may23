package accessmodifiertest;

import accessmodifier.Student;

public class StudentChild extends Student {
    public void testing() {
        name = "harshit";
//        batch = "may23"; --> Won't work
        age = 90;
        // psp = 90.0; --> Won't work

    }
}

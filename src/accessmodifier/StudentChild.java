package accessmodifier;

public class StudentChild extends Student {
    public void testing() {
         name = "vaibhav";
         // batch = "may23"; --> Won't work
        age = 25;
        psp = 90.0;
    }
}

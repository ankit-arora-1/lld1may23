package runtimepolymorphism;

public class TA extends User {
    public void performTATask() {
        System.out.println("Class TA is performing TA task");
    }

    public void doTask() {
        System.out.println("Class TA is performing an important task in a different way");
    }
}

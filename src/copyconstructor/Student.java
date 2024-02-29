package copyconstructor;

public class Student {
    public String name;
    public int age;
    public String batch;

    public Student() {

    }

    public Student(Student st) {
        name = st.name;
        age = st.age;
        batch = st.batch;
    }
}

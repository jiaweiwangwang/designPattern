package ProxyPattern;

public class StudentProxy implements Person{
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }
    @Override
    public void giveHousework() {
        student.giveHousework();
    }
}

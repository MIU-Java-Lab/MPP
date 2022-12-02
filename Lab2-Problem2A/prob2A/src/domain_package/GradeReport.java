package domain_package;

public class GradeReport {
    private String grade;
    private Student student;

    //package level
    GradeReport(Student student) {
        this.student = student;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public Student getStudent() {
        return student;
    }
}

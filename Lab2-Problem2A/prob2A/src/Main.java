import domain_package.GradeReport;
import domain_package.Student;

public class Main {
    public static void main(String[] args) {

        System.out.println("************* GROUP # 11 --- LAB # 2");

        Student student = new Student("Bhagia Sheri");
        student.getGradeReport().setGrade("A+");
        System.out.println("Bhagia Sheri Grade: " + student.getGradeReport().getGrade());

        GradeReport gradeReport = student.getGradeReport();
        System.out.println(gradeReport.getStudent());


    }
}
package MVC;

public class StudentControler {

    private StudentView studentView;
    private Student student;


    public StudentControler(StudentView studentView, Student student) {
        this.studentView = studentView;
        this.student = student;
    }

    public void setStudentName(String name){
        student.setName(name);
    }


    public void updateView() {
        studentView.printStudent(this.student);
    }
}

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

    public void setStudentLastName(String lastName){
        student.setLastname(lastName);
    }

    public void setStudentIndex(String index){
        student.setIndexNumber(index);
    }


    public void updateView() {
        studentView.printStudent(this.student);
    }
}

package MVC;

public class StudentView {

    public void printStudent(Student student){
        System.out.println("Imię: " + student.getName());
        System.out.println("Nazwisko: " + student.getLastname());
        System.out.println("Index: " + student.getIndexNumber());
    }


}

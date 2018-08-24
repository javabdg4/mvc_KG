package MVC;

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Jan", "Kowalski", "123123");

        StudentView studentView = new StudentView();
        StudentControler controller = new StudentControler(studentView, student);

        controller.updateView();
        student.setName("Nowe imie");
        controller.updateView();

    }
}

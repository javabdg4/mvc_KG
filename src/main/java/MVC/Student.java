package MVC;

public class Student {

    private String name;
    private String lastname;
    private String indexNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }


    public Student(String name, String lastname, String indexNumber) {
        this.name = name;
        this.lastname = lastname;
        this.indexNumber = indexNumber;
    }
}

public class Employee {
    // Properties ot States
    private int id;
    private String firstname;
    private String lastname;
    private Department department;
    private String positionName;

    //Constructor
    public Employee() {
        this("?","?");
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Behaviors or Methods
    void doSmt() {

    }

    public String getFullName() {
        return firstname + " : " + lastname;
    }

    String getPositionName() {
        return "";
    }
}

package Ex_9;

public class Student {

    private String groupName;
    private String lastName;
    private String firstName;
    private String secondName;
    private String birthdayDate;

    public Student(String groupName, String lastName, String firstName, String secondName, String birthdayDate) {
        this.groupName = groupName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthdayDate = birthdayDate;
    }

    @Override
    public String toString() {
        return this.lastName + " " + this.firstName + " " + this.secondName + " " + this.birthdayDate;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }
}

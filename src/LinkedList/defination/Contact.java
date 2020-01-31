package LinkedList.defination;

import java.util.List;

public class Contact {
    private String FirstName;
    private String lastName;
    private List<PhoneNumber> numbers;
    private String email;

    public String toString() {
        return "----------\n" +
                "first name:" + getFirstName() + "\n" +
                "Last name" + getLastName() + "\n" +
                ("Numbers") + getNumbers() + "\n" +
                "Email" + getEmail() + "\n";


    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<PhoneNumber> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<PhoneNumber> numbers) {
        this.numbers = numbers;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String firstName, String lastName, List<PhoneNumber> numbers, String email) {
        FirstName = firstName;
        this.lastName = lastName;
        this.numbers = numbers;
        this.email = email;
    }
}

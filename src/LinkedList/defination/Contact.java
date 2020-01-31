package LinkedList.defination;

import java.util.List;

public class Contact {
    private String FirstName;
    private String lastName;
    private List<PhoneNumber> numbers;
    private String email;

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("----------\n");
        stringBuilder.append("first name:").append(getFirstName());

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

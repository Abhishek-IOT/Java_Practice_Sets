package LinkedList.defination;

import java.util.List;

public class Contact {
    private String FirstName;
    private String lastName;
    private List<PhoneNumber> numbers;
    private String email;

    public String toString() {
        final StringBuffer sb = new StringBuffer("Contact{");
        sb.append("FirstName='").append(FirstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", numbers=").append(numbers);
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Contact(String firstName, String lastName, List<PhoneNumber> numbers, String email) {
        FirstName = firstName;
        this.lastName = lastName;
        this.numbers = numbers;
        this.email = email;
    }
}

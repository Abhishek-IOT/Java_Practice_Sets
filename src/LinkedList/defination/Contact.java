package LinkedList.defination;

import java.util.List;

public class Contact {
    private String FirstName;
    private String lastName;
    private List<PhoneNumber> numbers;
    private String email;

    public Contact(String firstName, String lastName, List<PhoneNumber> numbers, String email) {
        FirstName = firstName;
        this.lastName = lastName;
        this.numbers = numbers;
        this.email = email;
    }
}

package datastructure.array.practiceSet1.question1;

class Palindrom {
    private String string = "";

    public Palindrom(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Boolean Pallindrome(String string, int l) {
        String reverse = "";
        for (int i = l - 1; i >= 0; i--) {
            char ch = string.charAt(i);
            reverse = reverse + ch;
        }
        if (reverse.equals(string)) {
            return true;
        } else {
            return false;
        }
    }
}

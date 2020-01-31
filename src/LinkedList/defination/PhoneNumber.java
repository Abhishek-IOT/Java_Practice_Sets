package LinkedList.defination;

public class PhoneNumber {
    private int countryCode;
    private int stdCode;
    private long number;
    private boolean isSameCountry;

    public PhoneNumber(int countryCode, int stdCode, long number, boolean isSameCountry) {
        this.countryCode = countryCode;
        this.stdCode = stdCode;
        this.number = number;
        this.isSameCountry = isSameCountry;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getStdCode() {
        return stdCode;
    }

    public void setStdCode(int stdCode) {
        this.stdCode = stdCode;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public boolean isSameCountry() {
        return isSameCountry;
    }

    public void setSameCountry(boolean sameCountry) {
        isSameCountry = sameCountry;
    }
}

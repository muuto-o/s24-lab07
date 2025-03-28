package frogger;

// A record class that can conveniently store immutable data. 
// To compare two record classes with their corresponding fields, simply use ".equals()".
// More information: https://docs.oracle.com/en/java/javase/17/language/records.html#GUID-6699E26F-4A9B-4393-A08B-1E47D4B2D263
public class FroggerID {
    private final String firstName;
    private final String lastName;

    public FroggerID(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        FroggerID that = (FroggerID) obj;
        return firstName.equals(that.firstName) && lastName.equals(that.lastName);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode();
    }
}
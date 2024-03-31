public class Coach extends Person{
    String role;

    public Coach(String firstName, String lastName, String role) {
        super(firstName, lastName);
        this.role = role;
    }

    public String toString() {
        String s = "";
        s += super.toString() + "\n   Role: " + role;
        return s;
    }
}

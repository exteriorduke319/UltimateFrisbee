public class UltimatePlayer extends Person{
    int jerseyNumber;
    static int jerseyNumberCounter = 0;
    String position;

    public UltimatePlayer(String firstName, String lastName, String position) {
        super(firstName, lastName);
        if (position.equalsIgnoreCase("handler") || position.equalsIgnoreCase("cutter")) {
            this.position = position;
        } else {
            this.position = "handler";
        }

        this.jerseyNumber = (int)(Math.random()*99);
        jerseyNumberCounter++;
    }

    public String getPosition() {
        return position;
    }

    public int throwDisc(int pow) {
        if (pow > 10) {
            pow = 10;
        } else if (pow < 1) {
            pow = 1;
        }

        return pow*4;
    }

    public String toString() {
        String s = "";
        s += super.toString() + "\n   Jersey #: " + jerseyNumber + "\n   Position: " + position;
        return s;
    }
}

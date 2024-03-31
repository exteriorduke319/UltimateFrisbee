public class Captain extends UltimatePlayer{
    boolean type = false;

    public Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);
        if (((int)(Math.random()*2)+1) == 1) {
            type = true;
        }

        this.type = type;
    }

    public int throwDisc(int pow) {
        if (pow > 10) {
            pow = 10;
        } else if (pow < 1) {
            pow = 1;
        }

        return pow*5;
    }

    public String toString() {
        if (type) {
            return super.toString() + "\n   Captain: offense";
        } else {
            return super.toString() + "\n   Captain: defense";
        }
    }
}

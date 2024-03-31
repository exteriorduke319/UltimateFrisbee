import java.util.ArrayList;

public class UltimateTeam {
    static ArrayList<UltimatePlayer> players = new ArrayList<UltimatePlayer>();
    static ArrayList<Coach> coaches = new ArrayList<Coach>();


    public static void main(String[] args) {
        String s = "";
        players.add(new UltimatePlayer("Tanner", "Yarnevic", "handler"));
        players.add(new UltimatePlayer("Prashun", "Regmi", "cutter"));
        players.add(new UltimatePlayer("Cam", "Burt", "handler"));
        players.add(new UltimatePlayer("Caden", "Ball", "cutter"));
        coaches.add(new Coach("Emory", "Gorg", "Head Coach"));


        System.out.println(getCutters());
        System.out.println(getHandlers());
        System.out.println(teamInfo());
    }

        public static String getCutters() {
            String s = "Cutters:";
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getPosition().equalsIgnoreCase("cutter")){
                    s += players.get(i).toString();
                }
            }

            s += "\n \n";
            return s;
        }

        public static String getHandlers() {
            String s = "Handlers:";
            for (int i = 0; i < players.size(); i++) {
                if (players.get(i).getPosition().equalsIgnoreCase("handler")){
                    s += players.get(i).toString();
                }
            }

            s += "\n";
            return s;
        }

        public static String teamInfo() {
            return "\nPlayers: " + players.toString() + "\n\nCoaches: " + coaches.toString();
        }

}
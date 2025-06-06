import dnd.Player;
import dnd.Race;
import dnd.classes.Fighter;
import dnd.classes.Ranger;
import exceptions.LevelToHighException;

public class App {
    public static void main(String[] args) {
        Player p1 = new Fighter("Pears", Race.HUMAN);
        Player p2 = new Fighter("Darion", Race.DWARF);
        Player p3 = new Ranger("Valon", Race.ELF);
        try {
            p1.setLevel(2);
            p3.setLevel(4);
            p2.setLevel(50);
        } catch (LevelToHighException e) {
            System.out.println("Fehler " + e.getMessage());
        }
        System.out.println(p2.getLevel());
        System.out.println("Current Players: " + Player.getCurrentPlayers());
        System.out.println("thereof " + Fighter.getFighterInstances()
                + (Fighter.getFighterInstances() > 1 ? " Fighters " : " Fighter ")
                + "and " + Ranger.getRangerInstances() + (Ranger.getRangerInstances() > 1 ? " Rangers" : " Ranger"));

    }
}

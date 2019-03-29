import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<PlayerCharacter> players = new ArrayList<>();
        players.add(new Fighter("Никита Хрущев"));
        players.add(new Priest("Commie"));
        players.add(new Mage("Sicko Mode"));
        players.add(new Flammenwerfer("Ich Bin Flammen"));

        System.out.println("There be "+ players.size() +" characters.");

        for (PlayerCharacter x : players){
            if (x instanceof Fighter){
                System.out.println("Viola, a fighter:");
                x.displayStats();
            }
        }
    }
}
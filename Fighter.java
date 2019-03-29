public class Fighter extends PlayerCharacter {
    private int con;
    public Fighter(String newName){
        name = newName;
        str = 15 + Die.roll(6);
        agi = 8 + Die.roll(6);
        iq = 7 + Die.roll(6);
        con = 10 + Die.roll(6);
        hp = hpmax = (2* str) + (2 * con);
        mp = mpmax = 0;
        super.displayStats();
        System.out.printf("┃Constitution     │%2d┃\n" +
                    "┗━━━━━━━━━━━━━━━━━┷━━┛\n", con);
    }
}
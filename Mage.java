public class Mage extends PlayerCharacter {
    private int wis;
    public Mage(String newName){
        name = newName;
        str = 7 + Die.roll(6);
        agi = 8 + Die.roll(6);
        iq = 15 + Die.roll(6);
        wis = 10 + Die.roll(6);
        hp = hpmax = str;
        mp = mpmax = (iq)+(2*wis);
        super.displayStats();
        System.out.printf("┃Wisdom           │%2d┃\n" +
                "┗━━━━━━━━━━━━━━━━━┷━━┛\n", wis);
    }
}

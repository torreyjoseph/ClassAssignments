public class Priest extends PlayerCharacter {
    private int cha;
    public Priest(String newName){
        name = newName;
        str = 7 + Die.roll(6);
        agi = 8 + Die.roll(6);
        iq = 15 + Die.roll(6);
        cha = 10 + Die.roll(6);
        hp = hpmax = str;
        mp = mpmax = (iq)+(2*cha);
        super.displayStats();
        System.out.printf("┃Charisma         │%2d┃\n" +
                "┗━━━━━━━━━━━━━━━━━┷━━┛\n", cha);
    }
}

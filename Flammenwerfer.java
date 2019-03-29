public class Flammenwerfer extends PlayerCharacter{
    private int wis;
    private int cha;
    public Flammenwerfer(String newName){
        name = newName;
        str = 12 + Die.roll(6);
        agi = 6 + Die.roll(6);
        iq = 15 + Die.roll(6);
        wis = 10 + Die.roll(6);
        cha = 6 + Die.roll(6);
        hp = hpmax = (2*str)+(2*cha);
        mp = mpmax = (3*iq)+(3*wis);
        super.displayStats();
        System.out.printf("┃Charisma         │%2d┃\n" +
                "┣━━━━━━━━━━━━━━━━━┿━━┫\n" +
                "┃Wisdom           │%2d┃\n" +
                "┗━━━━━━━━━━━━━━━━━┷━━┛\n", cha, wis);
    }
}

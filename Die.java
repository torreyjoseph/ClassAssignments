import java.util.Random;

public class Die {
     public static int roll(int d){
        Random rand = new Random();
        int die = rand.nextInt(d)+1;
        return die;
    }
}

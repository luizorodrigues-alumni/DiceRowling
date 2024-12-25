import java.util.Random;

public class Dice {
    private int value;

    Dice(){
        this.value = 1;
    }
    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(1, 7);
    }

    public int getValue() {
        return value;
    }
}

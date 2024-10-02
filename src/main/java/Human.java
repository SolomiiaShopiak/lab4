import java.util.Random;

public class Human extends Character{
    private Random random = new Random();

    protected Human() {
        super(new HumanKickStrategy());
    }

    protected void setPowerAndHp() {
        this.power = random.nextInt(maxPower - minPower + 1) + minPower; 
        this.hp = random.nextInt(maxPower - minPower + 1) + minPower; 
    }
}


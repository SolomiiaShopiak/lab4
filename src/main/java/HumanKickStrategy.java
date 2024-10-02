import java.util.Random;

public class HumanKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        Random random = new Random();
        int damage = random.nextInt(attacker.maxPower - attacker.minPower + 1) + attacker.minPower; 
        defender.setHp(defender.getHp() - damage);
    }
}
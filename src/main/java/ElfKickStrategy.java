public class ElfKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        if (defender.getPower() < attacker.getPower()) {
            defender.setHp(0);
            System.out.println(attacker.getClass().getSimpleName() + " kills " + defender.getClass().getSimpleName());
        } else {
            defender.setPower(defender.getPower() - 1);
            System.out.println(defender.getClass().getSimpleName() + "is weaker by 1 point");
        }
    }
}

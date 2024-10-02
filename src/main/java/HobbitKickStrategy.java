public class HobbitKickStrategy implements KickStrategy {
    @Override
    public void kick(Character attacker, Character defender) {
        toCry();
    }

    private void toCry() {
        System.out.println("AAAAAA");
    }
}
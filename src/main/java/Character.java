public abstract class Character {
    protected int power;
    protected int hp;
    protected int minPower;
    protected int maxPower;
    protected KickStrategy kickStrategy;

    public Character(KickStrategy kickStrategy) {
        this.kickStrategy = kickStrategy;
    }

    public void kick(Character defender) {
        kickStrategy.kick(this, defender);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(0, hp);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}

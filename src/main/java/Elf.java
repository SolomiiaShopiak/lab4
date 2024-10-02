public class Elf extends Character {
    public Elf() {
        super(new ElfKickStrategy());
        this.power = 10;
        this.hp = 10;
    }
}

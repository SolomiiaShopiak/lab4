
public class Hobbit extends Character {
    public Hobbit() {
        super(new HobbitKickStrategy());
        this.power = 0;
        this.hp = 3;
    }
}

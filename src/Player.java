public class Player {
    String name;
    int attack, health;

    public Player(String name, int attack, int health) {
        this.name = name;
        this.attack = attack;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", attack=" + attack +
                ", health=" + health +
                '}';
    }
}
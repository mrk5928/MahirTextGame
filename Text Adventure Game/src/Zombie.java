public class Zombie extends Enemy{
    public Zombie() {
        super("Slow Zombie", 42, 36);
    }

    public Zombie(String fastZombie, int hp, int damage) {
        super("Fast Zombie", 40, 42);
    }
}

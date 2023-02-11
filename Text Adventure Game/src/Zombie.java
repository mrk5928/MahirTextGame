public class Zombie extends Enemy{
    public Zombie() {
        super("Slow Zombie",
                "Despite its slow speed, it has the ability to hit harder than the other common zombies, and has higher HP too.",
                42, 36);
    }

    public Zombie(String fastZombie, int hp, int damage) {
        super("Fast Zombie",
                "It has the ability to climb, jump, and move quickly, thus being able to confuse and surprise their prey. Fast Zombies also make loud wails while attacking and can be heard babbling and squawking while idle.",
                40, 42);
    }
}

public class Enemy {
    protected String name;
    protected String property;
    protected int hp;
    protected int damage;

    public Enemy(String name, String property, int hp, int damage){
        this.name = name;
        this.property = property;
        this.hp = hp;
        this.damage = damage;
    }

    public boolean is_alive() {
        return (this.hp > 0);
    }

}

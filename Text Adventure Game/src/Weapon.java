public class Weapon extends Item{

    private int damage;

    public Weapon(String name, String description, int value, int damage) {
        super(name, description, value);
        this.damage = damage;
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public String str(){
        return String.format("%s\n=====\n%s\nValue: %d\nDamage: %d",
                this.name, this.description, this.value, this.damage);
    }
}

public class Player {
    String name;
    boolean life = true; //true or false
    short hp;
    short damage;

    public Player(String name, short hp, short damage, boolean life){
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.life = life;
    }

    public boolean getLife(){
        if (hp <= 0)
            life = false;
        else
            life = true;
        return life;
    }
}

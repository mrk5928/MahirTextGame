public class Main {
    public static void main(String[] args) {
        Gold goldbar = new Gold(5);
        Weapon magicSword = new Weapon(
                "Lightsaber",
                "When opponent is blocking view, use it to destroy opponent by using laser power",
                105, 50);
        magicSword.setDamage(45);
        int dvalue = magicSword.getDamage();
        Sword superSword = new Sword();
        Pillow softPillow = new Pillow();
        Mace bigMace = new Mace();
        Arrow big_arrow = new Arrow();

        Enemy greenOgre = new Enemy("Green Ogre", 48, 42);
        Ogre redOgre = new Ogre();
        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie("Fast Zombie", 40, 42);
        Dog spotDog = new Dog();
        GiantSpider bigSpider = new GiantSpider();
        Husky chromeHusky = new Husky();

        //System.out.println(goldbar);
        //System.out.println(magicSword);
        //System.out.println(superSword);
        //System.out.println(bigMace);
        //System.out.println(big_arrow);

        System.out.println("Enemy: " + greenOgre.name + "; HP: " + greenOgre.hp + "; Damage: " + greenOgre.damage);
        System.out.println("Enemy: " + redOgre.name + "; HP: " + redOgre.hp + "; Damage: " + redOgre.damage);
        System.out.println("Enemy: " + slowZombie.name + "; HP: " + slowZombie.hp + "; Damage: " + slowZombie.damage);
        System.out.println("Enemy: " + fastZombie.name + "; HP: " + fastZombie.hp + "; Damage: " + fastZombie.damage);
        System.out.println("Enemy: " + spotDog.name + "; HP: " + spotDog.hp + "; Damage: " + spotDog.damage);
        System.out.println("Enemy: " + bigSpider.name + "; HP: " + bigSpider.hp + "; Damage: " + bigSpider.damage);
        System.out.println("Enemy: " + chromeHusky.name + "; HP: " + chromeHusky.hp + "; Damage: " + chromeHusky.damage);

    }
}
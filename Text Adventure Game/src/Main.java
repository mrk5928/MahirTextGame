/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Weapons and Accessories that you need in this game are: \n");
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

        Enemy greenOgre = new Enemy("Green Ogre",
                "Can turn into a giant monster when feels threatened. He is an excellent fighter as well.",
                48, 42);
        Ogre redOgre = new Ogre();
        Zombie slowZombie = new Zombie();
        Zombie fastZombie = new Zombie("Fast Zombie", 40, 42);
        Dog spotDog = new Dog();
        GiantSpider bigSpider = new GiantSpider();
        Husky chromeHusky = new Husky();

        System.out.println(goldbar);
        System.out.println(magicSword);
        System.out.println(superSword);
        System.out.println(bigMace);
        System.out.println(big_arrow);

        System.out.println("Potential enemies that you may encounter in this game are: \n");

        System.out.println("Enemy: " + greenOgre.name + "; Property: " + greenOgre.property + "; HP: " + greenOgre.hp + "; Damage: " + greenOgre.damage);
        System.out.println("Enemy: " + redOgre.name + "; Property: " + redOgre.property + "; HP: " + redOgre.hp + "; Damage: " + redOgre.damage);
        System.out.println("Enemy: " + slowZombie.name + "; Property: " + slowZombie.property +"; HP: " + slowZombie.hp + "; Damage: " + slowZombie.damage);
        System.out.println("Enemy: " + fastZombie.name + "; Property: " + fastZombie.property + "; HP: " + fastZombie.hp + "; Damage: " + fastZombie.damage);
        System.out.println("Enemy: " + spotDog.name + "; Property: " + spotDog.property + "; HP: " + spotDog.hp + "; Damage: " + spotDog.damage);
        System.out.println("Enemy: " + bigSpider.name + "; Property: " + bigSpider.property + "; HP: " + bigSpider.hp + "; Damage: " + bigSpider.damage);
        System.out.println("Enemy: " + chromeHusky.name + "; Property: " + chromeHusky.property + "; HP: " + chromeHusky.hp + "; Damage: " + chromeHusky.damage);

        System.out.println("\nGameboard\n");

        Gameboard gameboard = new Gameboard("Tic Tac Toe");
        System.out.println(gameboard.name);

        Player player1 = new Player("Joe", (short)100, (short)10, true);
        if (player1.getLife())
            System.out.println("Player is alive");
        else
            System.out.println("Player is not alive");

        Player player2 = new Player("Jim", (short)0, (short)100, true);
        if (player2.getLife())
            System.out.println("Player is alive");
        else
            System.out.println("Player is not alive");

        Wizzard wizzard = new Wizzard(Spells.Fireballs);

        MoveNorth moveNorth = new MoveNorth();
        MoveSouth moveSouth = new MoveSouth();
        MoveEast moveEast = new MoveEast();
        MoveWest moveWest = new MoveWest();
        ViewInventory viewInventory = new ViewInventory();
        Flee flee = new Flee();
        Attack myActionClass = new Attack();

        World world = new World();
        world.load_tiles();
    }
}

 */
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

        System.out.println(goldbar);
        System.out.println(magicSword);
        System.out.println(superSword);
        System.out.println(bigMace);
        System.out.println(big_arrow);

    }
}
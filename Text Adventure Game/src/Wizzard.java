public class Wizzard extends Enemy{

    private Spells spells;
    public Wizzard(Spells spells) {
        super("Wizard",
                "A Black Magician that can control anything around him to kill his prey." ,
                20, 10);
        this.spells = spells;
    }
}

public class Wizzard extends Enemy{

    private Spells spells;
    public Wizzard(Spells spells) {
        this.spells = spells;
        super("Wizard", 20, 10);
    }
}

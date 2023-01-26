public class Gold extends Item {

    private int amount;

    public Gold(int amount){
        super("Gold", String.format("A rectangular bar with a %s stamped on the front", (amount)), amount);
        this.amount = amount;
    }
}

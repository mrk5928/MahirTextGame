public class TreasureRoom extends LootRoom {
    private boolean isLooted;

    public TreasureRoom(int x, int y, Gold gold) {
        super(x, y, gold);
        this.isLooted = false;
    }

    public String intro_text() {
        if (isLooted) {
            return "\nThis room appears to be empty.";
        } else {
            return "\nYou have found a treasure room! There is a large chest in the center of the room.";
        }
    }

    public String loot() {
        if (isLooted) {
            return "\nThe chest is empty.";
        } else {
            this.isLooted = true;
            return "\nYou open the chest and find a valuable treasure!";
        }
    }
}

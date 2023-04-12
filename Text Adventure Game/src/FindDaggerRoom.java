public class FindDaggerRoom extends MapTile {
    private boolean isDaggerFound;

    public FindDaggerRoom(int x, int y) {
        super(x, y);
        this.isDaggerFound = false;
    }

    public String intro_text() {
        if (isDaggerFound) {
            return "\nYou have returned to the room where you found the dagger.";
        } else {
            return "\nYou have entered a room and see a dagger on the floor.";
        }
    }

    public String findDagger() {
        if (isDaggerFound) {
            return "\nYou have already picked up the dagger.";
        } else {
            this.isDaggerFound = true;
            return "\nYou pick up the dagger from the floor.";
        }
    }
    public void modify_player(Player player) {
//Room has no action on player
    }
}

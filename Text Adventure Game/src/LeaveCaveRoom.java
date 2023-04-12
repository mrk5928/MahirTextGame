public class LeaveCaveRoom extends MapTile {
    public LeaveCaveRoom(int x, int y) {
        super(x, y);
    }

    public String intro_text() {
        return "\nYou see a bright light in the distance. It's the way out of the cave!";
    }

    public boolean canLeave() {
        // Check if the player has met the conditions to leave the cave
        // For example, they may need to have found a certain item or defeated a certain enemy
        // If the conditions are met, return true. Otherwise, return false.
        return true;
    }
    public void modify_player(Player player) {
//Room has no action on player
    }
}

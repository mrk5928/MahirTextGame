public class StartingRoom extends MapTile {
    public StartingRoom(int x, int y) {
        super(x, y);
    }

    public String intro_text() {
        return "\nYou find yourself in a cave with a flickering torch on the wall";
    }

    public void modify_player(Player player) {
//Room has no action on player
    }
}

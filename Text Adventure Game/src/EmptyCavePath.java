public class EmptyCavePath extends MapTile {
    public EmptyCavePath(int x, int y) {
        super(x, y);
    }

    public String intro_text() {
        return "\nYou are on a path that leads deeper into the cave.";
    }
    public void modify_player(Player player) {
//Room has no action on player
    }
}

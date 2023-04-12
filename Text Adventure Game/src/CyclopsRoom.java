public class CyclopsRoom extends MapTile {
    private boolean isCyclopsDefeated;

    public CyclopsRoom(int x, int y) {
        super(x, y);
        this.isCyclopsDefeated = false;
    }

    public String intro_text() {
        if (isCyclopsDefeated) {
            return "\nYou have returned to the room where you defeated the cyclops.";
        } else {
            return "\nYou have entered a room and see a massive cyclops blocking the exit!";
        }
    }

    public boolean isCyclopsDefeated() {
        return isCyclopsDefeated;
    }

    public String fightCyclops(int playerStrength) {
        if (isCyclopsDefeated) {
            return "\nThe cyclops has already been defeated.";
        } else {
            if (playerStrength >= 10) {
                this.isCyclopsDefeated = true;
                return "\nYou defeat the cyclops and can now exit the room.";
            } else {
                return "\nYou try to fight the cyclops but are too weak. You must find another way to defeat it.";
            }
        }
    }
    public void modify_player(Player player) {
//Room has no action on player
    }
}

public class OgreRoom extends EnemyRoom {
    private boolean isOgreDefeated;

    public OgreRoom(int x, int y, Ogre ogre) {
        super(x, y, ogre);
        this.isOgreDefeated = false;
    }

    public String intro_text() {
        if (isOgreDefeated) {
            return "\nYou have defeated the ogre and returned to its room.";
        } else {
            return "\nYou have entered a room and see a huge ogre blocking your path!";
        }
    }

    public boolean fightOgre() {
        if (isOgreDefeated) {
            return true;
        } else {
            // Simulate a fight with the ogre
            boolean isPlayerVictorious = (Math.random() < 0.5);

            if (isPlayerVictorious) {
                this.isOgreDefeated = true;
                return true;
            } else {
                return false;
            }
        }
    }
    public void modify_player(Player player) {
//Room has no action on player
    }
}

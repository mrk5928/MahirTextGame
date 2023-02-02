public class Gameboard {

    public String name;
    public GameType gameType;
    public Gameboard(String name){
        this.name = name;
        this.gameType = GameType.TwoD;
    }
}

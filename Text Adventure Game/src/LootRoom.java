public class LootRoom extends MapTile{
    Item item;
    public boolean pickedItem = false;
    public LootRoom(int x, int y, Item item){
        super(x, y);
        this.item = item;

    }
    public void add_Loot(Player player){
        player.inventory.add(item);
        pickedItem = true;
    }
    public void modify_player(Player player){
        if(pickedItem == false)
            add_Loot(player);
        else
            System.out.printf("The item %s is already picked \n",item.name);
    }

}
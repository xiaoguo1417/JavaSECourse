import java.util.ArrayList;

public class Database {
    private ArrayList<Item> Items;

    public Database(){
        Items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        Items.add(item);
    }

    public Item findItem(String name){
        for(Item item:Items) {
            if (item.find(name)) {
                item.print();
                return item;
            }
        }
        return null;
    }

    public void list(){
        for(Item item:Items){
            item.print();
            System.out.println();
        }
    }
}

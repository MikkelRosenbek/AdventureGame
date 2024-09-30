public class Item {

    private String itemName;
    private String itemDescription;

    public Item(String itemName, String itemDescibtion) {
        this.itemName = itemName;
        this.itemDescription = itemDescibtion;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    @Override
    public String toString() {
        return itemName + " " + itemDescription;
    }
}

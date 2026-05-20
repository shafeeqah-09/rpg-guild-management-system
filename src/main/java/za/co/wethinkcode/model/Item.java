package za.co.wethinkcode.model;

public abstract class Item {

    // TODO: declare private fields:
    private int id;
    private String name;
    private int value;

    // TODO: implement constructor:
    public Item(int id, String name , int value){
        this.id = id;
        this.name = name;
        this.value = value;
    }

    // TODO: implement getters:

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getValue() {
        return value;
    }

    // TODO: implement updateValue(int newValue)
    public void updateValue(int newValue){
        if(newValue < 0){
            throw new IllegalArgumentException("Value cannot be negative");
        }
        this.value = newValue;
    }

    // TODO: implement abstract method:

    public abstract String itemType();


    // TODO: override toString()

    @Override
    public String toString() {
        return ("[" + itemType() + "]"  + name + "(ID: " + id + "," + "Value: " + value + ")");
    }

    // Example:
    // [Weapon] Sword (ID: 1, Value: 150)
}
package za.co.wethinkcode.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    // TODO: declare private fields:
    // items (List<Item>)
    private List<Item> items;

    // TODO: implement constructor:
    public Inventory(){
        this.items =  new ArrayList<>(items);
    }
    // Inventory()
    // - initialise items as new ArrayList<>()

    // TODO: implement addItem(Item item)
    // - add item to list
    public void addItem(Item item){
        items.add(item);
    }

    // TODO: implement removeItemById(int itemId)
    // - remove item with matching id
    // - return true if removed, false otherwise
    public boolean removeItemById(int itemId){
        return items.removeIf(item -> item.getId() == itemId);
    }

    // TODO: implement getItemById(int itemId)
    // - return Item if found, else null

    public Item getItemById(int itemId){
       for(Item item: items){
           if (item.getId() == itemId){
               return item;
           }
       }
       return null;
    }

    // TODO: implement getItems()
    // - return defensive copy of list

    public List<Item> getItems(){
       return new ArrayList<>(items);
    }

    // TODO: implement getTotalValue()
    // - sum of all item values

    public int getTotalValue(){
        int sum = 0;
        for(Item item: items){
           sum += item.getValue();
        }
        return sum;
    }

    // TODO: implement getTotalItems()
    // - return size of inventory
    public int getTotalItems(){
          return items.size();
        }

    // TODO: implement containsItem(String itemName)
    // - return true if any item matches name

    public boolean containsItem(String itemName){
        for(Item item: items){
            if(item.getName().equals(itemName)){
                return  true;
            }
        }
        return false;
    }


    // TODO: override toString()
    // Example:
    // Inventory:
    // - Sword (ID: 1)
    // - Shield (ID: 2)

    @Override
    public String  toString(){
      StringBuilder sb = new StringBuilder();
       sb.append("Inventory:\n");

       for(Item item: items){
           sb.append("_").append(item.getName()).append("(ID: ").append(item.getId());
       }
       return sb.toString();
    }
}
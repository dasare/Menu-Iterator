/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.pkg2;

/**
 *
 * @author dasare
 */
public class Menu {

    public static final int APPETIZERS = 1;
    public static final int MAIN_DISH = 2;
    public static final int DESSERT = 3;
    public static final boolean HEART_HEALTHY = true;
    public static final boolean NOT_HEART_HEALTHY = false;
    //private MenuItem first;
    public static int size = 10;
    public MenuItem[] temp;
    public int index = -1;

    MenuItem[] menuItems;

    public Menu() {
        menuItems = new MenuItem[size];
        temp = new MenuItem[size];
    }

    public void addItem(int itemNum, String name, int category, boolean Heart_Healthy, double price) {
        index++;
        menuItems[index] = new MenuItem(itemNum, name, category, Heart_Healthy, price);
    }

    public void addNewItem(int itemNum, String itemName, int category, boolean Heart_Healthy, double price) {

        index++;
        size = size + 1;
        temp = new MenuItem[size];
        System.arraycopy(menuItems, 0, temp, 0, menuItems.length);
        temp[temp.length - 1] = new MenuItem(itemNum, itemName, category, Heart_Healthy, price);
        menuItems = new MenuItem[size];
        System.arraycopy(temp, 0, menuItems, 0, menuItems.length);
    }

    public void removeItem(int index) {
        temp = new MenuItem[size];
        System.arraycopy(menuItems, 0, temp, 0, menuItems.length);
        for (int i = index; i < temp.length - 2; i++) {
            temp[i] = temp[i + 1];
        }
        temp[temp.length - 1] = null;
        size = size - 1;
        menuItems = new MenuItem[size];
        System.arraycopy(temp, 0, menuItems, 0, menuItems.length);
    }

    public MenuIterator getAllItemsIterator(MenuItem item) {
        return new AllItemsIterator(menuItems);
    }

    public MenuIterator getItemIterator(int itemType) {
        return new ItemIterator(this, -1, itemType);
    }

    public MenuIterator getPriceIterator(double price) {
        return new PriceIterator(this, -1, price);
    }

    public MenuIterator getHeartHealthyIterator() {
        return new HeartHealthyIterator(this, -1);

    }

}

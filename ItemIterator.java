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
public class ItemIterator implements MenuIterator {
//    private MenuItem[] menuItem;
//    private int current;
//    
//    public ItemIterator(MenuItem[] menuItem)
//    {
//        this.menuItem = menuItem;
//        this.current = 0;
//    }
//    
//    public boolean hasNext(){
//        return (current < menuItem.length);
//    }
//    
//    public MenuItem next(){
//        return menuItem[current++];
//    }
//    
//    public MenuIterator getItemIterator(MenuItem item)
//    {
//        return new ItemIterator(menuItem);
//    }

    private final Menu menu;
    private int last;
    private final int whichItem;
        int i = 0;
        //int last;
        int select;
    public ItemIterator(Menu menu, int curr, int whichItem) {
        this.menu = menu;
        this.last = curr;
        this.whichItem = whichItem;
    }

    @Override
    public boolean hasNext() {
        last++;
        if (last >= menu.menuItems.length) {
            return false;
        } else {
            while (menu.menuItems[last].getCategory() != whichItem) {
                last++;
                if (last >= menu.menuItems.length) {
                    return false;
                }
            }
            return true;
        }
    }
//
//    public boolean hasNext() {
//        int x = i;
//
//        if (i > last || menu.menuItems[i++] == null) {
//            return false;
//        } else {
//
//            return true;
//        }
//
//    }

    @Override
        public MenuItem next(){
        return menu.menuItems[last];
    }
    public MenuIterator getItemIterator(MenuItem item)
    {
        return new ItemIterator(menu,last,whichItem);
    }
}

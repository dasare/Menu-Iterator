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
public class AllItemsIterator implements MenuIterator {

    private final MenuItem[] menuItem;
    private int current;

    public AllItemsIterator(MenuItem[] menuItem) {
        this.menuItem = menuItem;
        this.current = 0;
    }

    @Override
    public boolean hasNext() {
        return (current < menuItem.length);
    }

    @Override
    public MenuItem next() {
        return menuItem[current++];
    }

    public MenuIterator getAllItemsIterator(MenuItem item) {
        return new AllItemsIterator(menuItem);
    }
}

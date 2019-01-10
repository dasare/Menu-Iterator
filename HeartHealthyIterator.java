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
public class HeartHealthyIterator implements MenuIterator {
//
//    private MenuItem[] menuItem;
//    private int current;
//
//    public HeartHealthyIterator(MenuItem[] menuItem) {
//        this.menuItem = menuItem;
//        this.current = 0;
//    }
//
//    @Override
//    public boolean hasNext() {
//        return (current < menuItem.length);
//    }
//
//    public MenuItem next() {
//        return menuItem[current++];
//    }
//
//    public MenuIterator getHealthyHeartIterator(MenuItem item) {
//        return new PriceIterator(menuItem);
//    }
    
    	private final Menu menu;
	private int last;
	
	public HeartHealthyIterator(Menu menu, int currentIndex) {
		this.menu = menu;
		this.last = last;
	}

	@Override
	public boolean hasNext() {
		last++;
		if(last >= menu.menuItems.length)
			return false;
		else {
			while (!menu.menuItems[last].getIsHeart_Healthy()) {
				last++;
				if(last >= menu.menuItems.length)
					return false;
			}
			return true;
		}
	}

	@Override
	public MenuItem next() {
		return menu.menuItems[last];
}
        
}

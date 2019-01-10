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
public class PriceIterator implements MenuIterator{
//    private MenuItem[] menuItem;
//    private int current;
//    
//    public PriceIterator(MenuItem[] menuItem)
//    {
//        this.menuItem = menuItem;
//        this.current = 0;
//    }
//    
//       @Override
//    public boolean hasNext(){
//        return (current < menuItem.length);
//    }
//    
//    public MenuItem next(){
//        return menuItem[current++];
//    }
//    
//    public MenuIterator getPriceIterator(MenuItem item)
//    {
//        return new PriceIterator(menuItem);
//    }
    
    
    	private final Menu menu;
    	private int last;
    	private final double price;
    	
    	public PriceIterator(Menu menu, int last, double price) {
    		this.menu = menu;
    		this.last = last;
    		this.price = price;
    	}

    	@Override
    	public boolean hasNext() {
    		last++;
    		if(last >= menu.menuItems.length)
    			return false;
    		else {
    			while (menu.menuItems[last].getPrice() > price) {
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

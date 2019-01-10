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
public interface MenuIterator {
        // returns true if items of appropriate type left in list

    public boolean hasNext();
// returns current item and advances to next item

    public MenuItem next();
    
    
}

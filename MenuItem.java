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
public class MenuItem extends Menu {

    private final int itemNum;
    private final String name;
    private final int category;
    private boolean Heart_Healthy = false;
    private final double price;

    public MenuItem(int itemNum, String name, int category, boolean Heart_Healthy, double price) {
        this.itemNum = itemNum;
        this.name = name;
        this.category = category;
        this.Heart_Healthy = Heart_Healthy;
        this.price = price;
    }

    /**
     * @return the itemNum
     */
    public int getItemNum() {
        return itemNum;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the category
     */
    public int getCategory() {
        return category;
    }

    /**
     * @return the Heart_Healthy
     */
    public boolean getIsHeart_Healthy() {
        return Heart_Healthy;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ("Food item: " + getName() + "\nCategory " + getCategory()
                + "\nHeart Healthy: " + getIsHeart_Healthy() + "\nPrice: "
                + getPrice());
    }
}

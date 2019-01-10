/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg2.pkg2;

import java.util.Scanner;

/**
 *
 * @author dasare
 */
public class Assignment22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Welcome To Joes!!!!");
        Scanner in = new Scanner(System.in);
        MenuIterator itr;
        MenuItem item = null;
        //Scanner console = new Scanner(System.in);

        Menu eatAtJoes = new Menu();
        eatAtJoes.addItem(1, "Breakfast Sandwich", Menu.MAIN_DISH, Menu.NOT_HEART_HEALTHY, 15.00);
        eatAtJoes.addItem(2, "Cookies", Menu.DESSERT, Menu.HEART_HEALTHY, 25.00);
        eatAtJoes.addItem(3, "Edamame", Menu.MAIN_DISH, Menu.NOT_HEART_HEALTHY, 43.23);
        eatAtJoes.addItem(4, "Jollof Rice ", Menu.MAIN_DISH, Menu.NOT_HEART_HEALTHY, 65.22);
        eatAtJoes.addItem(5, "Ice Cream", Menu.APPETIZERS, Menu.HEART_HEALTHY, 51.11);
        eatAtJoes.addItem(6, "Water", Menu.APPETIZERS, Menu.HEART_HEALTHY, 110.00);
        eatAtJoes.addItem(7, "Eggs", Menu.MAIN_DISH, Menu.HEART_HEALTHY, 80.24);
        eatAtJoes.addItem(2, "Pound Cake", Menu.DESSERT, Menu.HEART_HEALTHY, 25.00);
        eatAtJoes.addItem(2, "Brownies", Menu.DESSERT, Menu.HEART_HEALTHY, 25.00);
        
        
        
        viewMenu();
        int choice = in.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Appetizers");
                    itr = eatAtJoes.getItemIterator(Menu.APPETIZERS);
                    while (itr.hasNext()) {
                        System.out.print(itr.next().toString());
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Main Dishes");
                    itr = eatAtJoes.getItemIterator(Menu.MAIN_DISH);
                    while (itr.hasNext()) {
                        System.out.print(itr.next().toString());
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Desserts");
                    itr = eatAtJoes.getItemIterator(Menu.DESSERT);
                    while (itr.hasNext()) {
                        System.out.print(itr.next().toString());
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Hearty Healthy");
                    itr = eatAtJoes.getHeartHealthyIterator();
                    while (itr.hasNext()) {
                        System.out.print(itr.next().toString());
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Enter the Max Amount of Money to be Spent");
                    double price = in.nextDouble();
                    System.out.println("Main Dishes Under $ " + price);
                    itr = eatAtJoes.getPriceIterator(price);
                    while (itr.hasNext()) {
                        System.out.print(itr.next().toString());
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    break;

                case 6:
                    System.out.println("All Menu Items");
                    itr = eatAtJoes.getAllItemsIterator(item);
                    while (itr.hasNext()) {
                        System.out.print(itr.next().toString());
                        System.out.println();
                        System.out.println();
                    }
                    System.out.println();
                    break;
                    
                case 7:
                    System.out.println("Enter Item Num");
                    int itemNum = in.nextInt();
                    System.out.println("Enter Item Name:");
                    String itemName = in.next();
                    System.out.println("Enter Category Number (1 - Appetizer, 2 - Main Dish, 3 - Dessert:");
                    int category = in.nextInt();
                    System.out.println("Enter Heart Healthy (true/false): ");
                    boolean Heart_Healthy = in.nextBoolean();
                    System.out.println("Enter Price:");
                    price = in.nextDouble();
                    eatAtJoes.addNewItem(itemNum, itemName, category, Heart_Healthy, price);
                    break;

                case 8:
                    for (int i = 0; i < eatAtJoes.menuItems.length; i++) {
                        System.out.println(i + " - " + eatAtJoes.menuItems[i].getItemNum());
                    }
                    System.out.println();
                    System.out.println("Please Enter the Number of the Item to be Deleted");
                    int delete = in.nextInt();
                    eatAtJoes.removeItem(delete);
                    break;
            }
            viewMenu();
            choice = in.nextInt();
        }
    }

    public static void viewMenu() {
        System.out.println("Please Select an Option:");
        System.out.println("1. Display Appetizers");
        System.out.println("2. Display Main Dishes");
        System.out.println("3. Display Desserts");
        System.out.println("4. Display Hearty Healthy Items");
        System.out.println("5. Display Main Dishes Under a Certain Price");
        System.out.println("6. Display All Menu Items");
        System.out.println("7. Add Menu Item");
        System.out.println("8. Remove Menu Item with options “by item #” or “by inspection”");
        System.out.println("0. Exit");
        System.out.println();
    }
}

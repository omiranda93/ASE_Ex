/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ase;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author omiranda93
 */
public class TestIO {
    
    //Global variables
    //Depending on the OS you may need to change the paths
    private static String inputFileMenu = "/Users/omiranda93/NetBeansProjects/ASE/src/ase/menu.txt";
    private static String inputFileOrder = "/Users/omiranda93/NetBeansProjects/ASE/src/ase/orders.txt";
    
    public void readMenu(HashMap menu){
        BufferedReader readbuffer = null;
        String strRead;
        String splitarray[];
        TreeSet <MenuItem> starters = new TreeSet<MenuItem>();
        TreeSet <MenuItem> mains = new TreeSet<MenuItem>();
        TreeSet <MenuItem> desserts = new TreeSet<MenuItem>();
        TreeSet <MenuItem> drinks = new TreeSet<MenuItem>();
        try {
            readbuffer = new BufferedReader(new FileReader(inputFileMenu));
            int i = 0;
            while ((strRead = readbuffer.readLine()) != null) {
                splitarray = strRead.split(", ");
                switch(splitarray[2]){
                    case "Starter": starters.add(new MenuItem(splitarray[0], Double.parseDouble(splitarray[1]), splitarray[2]));
                        break;
                    case "Main": mains.add(new MenuItem(splitarray[0], Double.parseDouble(splitarray[1]), splitarray[2]));
                        break;
                    case "Dessert": desserts.add(new MenuItem(splitarray[0], Double.parseDouble(splitarray[1]), splitarray[2]));
                        break;
                    case "Drinks": drinks.add(new MenuItem(splitarray[0], Double.parseDouble(splitarray[1]), splitarray[2]));
                        break;      
                }
            }
            readbuffer.close();
            menu.put("Starter", starters);
            menu.put("Main", mains);
            menu.put("Dessert", desserts);
            menu.put("Drink", drinks);
        }catch (Exception e){
            System.out.println("There was an error loading the menu from file.");
        }
    }
    
    public void readOrders(TreeMap orders){
        BufferedReader readbuffer = null;
        String strRead;
        String splitarray[];
        TreeSet <OrderItem> table1 = new TreeSet<OrderItem>();
        TreeSet <OrderItem> table2 = new TreeSet<OrderItem>();
        TreeSet <OrderItem> table3 = new TreeSet<OrderItem>();
        try {
            readbuffer = new BufferedReader(new FileReader(inputFileOrder));
            int i = 0;
            while ((strRead = readbuffer.readLine()) != null) {
                splitarray = strRead.split(", ");
                switch(splitarray[0]){
                    case "1": table1.add(new OrderItem(splitarray[1], Integer.parseInt(splitarray[0]), Integer.parseInt(splitarray[2])));
                        break;
                    case "2": table2.add(new OrderItem(splitarray[1], Integer.parseInt(splitarray[0]), Integer.parseInt(splitarray[2])));
                        break;
                    case "3": table3.add(new OrderItem(splitarray[1], Integer.parseInt(splitarray[0]), Integer.parseInt(splitarray[2])));
                        break;      
                }
            }
            readbuffer.close();
            orders.put(1, table1);
            orders.put(2, table2);
            orders.put(3, table3);
        }catch (Exception e){
            System.out.println("There was an error loading the menu from file.");
        }
    }
    
}

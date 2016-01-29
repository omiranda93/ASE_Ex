/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author omiranda93
 */
public class ASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeMap <Integer, TreeSet> orders = new TreeMap<Integer, TreeSet>(); 
        HashMap <String, TreeSet> menu = new HashMap<String, TreeSet>();
        
        TestIO read = new TestIO();
        
        read.readMenu(menu);
        read.readOrders(orders);
        
        for (Map.Entry<String, TreeSet> entrySet : menu.entrySet()) {
            String key = entrySet.getKey();
            TreeSet <MenuItem> value = entrySet.getValue();
            System.out.println("Category: "+key);
            for (MenuItem value1 : value) {
                System.out.println("Name: "+value1.getName());
            }
        }
        for (Map.Entry<Integer, TreeSet> entrySet : orders.entrySet()) {
            Integer key = entrySet.getKey();
            TreeSet <OrderItem> value = entrySet.getValue();
            System.out.println("Table: "+key);
            for (OrderItem value1 : value) {
                System.out.println("Name of dish: "+value1.getName());
            }
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ase;

import java.util.ArrayList;
import java.util.HashMap;
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
        TreeSet <MenuItem> a = new TreeSet<MenuItem>();
        TreeSet <OrderItem> b =  new TreeSet<OrderItem>();
        TreeSet <OrderItem> c =  new TreeSet<OrderItem>();
        a.add(new MenuItem("Smoked Salmon", 6.00, "Starter"));
        a.add(new MenuItem("Carrot Soup", 6.00, "Starter"));
        b.add(new OrderItem("Roast Beef",3,2));
        c.add(new OrderItem("Smoked Salmon",1,1));
        menu.put("Starter", a);
        orders.put(3, b);
        orders.put(1, c);
        
//        for (Map.Entry<String, TreeSet> entrySet : menu.entrySet()) {
//            String key = entrySet.getKey();
//            TreeSet<MenuItem> value = entrySet.getValue();
//            System.out.println(key);
//            for (MenuItem value1 : value) {
//                System.out.println("Name: "+value1.getName());
//            }
//        }
        for (Map.Entry<Integer, TreeSet> entrySet : orders.entrySet()) {
            Integer key = entrySet.getKey();
            TreeSet <OrderItem> value = entrySet.getValue();
            System.out.println("Table: "+key);
            for (OrderItem value1 : value) {
                System.out.println("Name: "+value1.getName());
            }
        }
    }
    
}

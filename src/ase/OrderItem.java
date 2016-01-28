/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ase;

/**
 *
 * @author omiranda93
 */
public class OrderItem implements Comparable<OrderItem>{
    String name;
    int tableID;
    int quantity;

    public OrderItem(String name, int tableID, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.tableID = tableID;
    }
    
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTableID() {
        return tableID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTableID(int tableID) {
        this.tableID = tableID;
    }

    @Override
    public int compareTo(OrderItem o) {
                return name.compareTo(o.getName());
    }
    
    
}

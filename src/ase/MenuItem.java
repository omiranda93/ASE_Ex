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
public class MenuItem implements Comparable<MenuItem>{
    String name;
    double price;
    String category;
    
    MenuItem(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(MenuItem o) {
        return name.compareTo(o.getName());
    }
}
 
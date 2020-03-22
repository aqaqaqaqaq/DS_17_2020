/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

/**
 *
 * @author Dima
 */
public class Tovar {

    public Tovar(String name, int kol, double price,int groupId,int Id) {
        this.name = name;
        this.kol = kol;
        this.price = price;
        this.groupId=groupId;
        this.Id=Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKol() {
        return kol;
    }

    public void setKol(int kol) {
        this.kol = kol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    private String name;
    private int kol;
    private double price;
    private int groupId;
    private int Id;
    
    public Tovar() {
        name="";
        kol=0;
        price=0;
        groupId=0;
        Id=0;
    }
}

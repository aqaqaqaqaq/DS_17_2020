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
public class User {

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    private String Name;
    private String Phone;
    private int Id;

    public User() {
        Name="";
        Phone="";
        Id=0;
    }

    public User(String Name, String Phone, int Id) {
        this.Name = Name;
        this.Phone = Phone;
        this.Id = Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    
}

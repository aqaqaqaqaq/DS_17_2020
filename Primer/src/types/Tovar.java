/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

/**
 *
 * @author dvoeg
 */
public class Tovar {

private String name;

private int kol;

private int price;

public Tovar() {

this.name = "";

this.kol = 0;

this.price = 0;

}

public Tovar(String name, int kol, int price) {

this.name = name;

this.kol = kol;

this.price = price;

}

public int getKol() {

return kol;

}

public void setKol(int kol) {

this.kol = kol;

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public int getPrice() {

return price;

}

public void setPrice(int price) {

this.price = price;

}

}

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
public class Place {
    private int Id;
    private String Name;
    private String KLADR;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getKLADR() {
        return KLADR;
    }

    public void setKLADR(String KLADR) {
        this.KLADR = KLADR;
    }

    public Place(int Id, String Name, String KLADR) {
        this.Id = Id;
        this.Name = Name;
        this.KLADR = KLADR;
    }
}

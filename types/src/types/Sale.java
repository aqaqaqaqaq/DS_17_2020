/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package types;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author Dima
 */
public class Sale {
    private int Id;
    private int UserId;
    private int TovarId;
    private int placeId;
    private int count;
    private Date date;

    public Sale() {
        this.Id = 0;
        this.UserId = 0;
        this.TovarId = 0;
        this.placeId = 0;
        count=0;
        date=new Date();
    }

    public Sale(int Id, int UserId, int TovarId, int placeId,int count) {
        this.Id = Id;
        this.UserId = UserId;
        this.TovarId = TovarId;
        this.placeId = placeId;
        this.count=count;
        date=new Date();
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public int getTovarId() {
        return TovarId;
    }

    public void setTovarId(int TovarId) {
        this.TovarId = TovarId;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;
import java.util.List;
import types.Place;

/**
 *
 * @author Dima
 */
public class PlacesOperationImpl implements PlacesOperation {
static List<Place> lstPlace = new ArrayList<Place>();
    static{
        lstPlace.add(new Place(1,"Название1","1234567891"));
        lstPlace.add(new Place(2,"Название2","1234567892"));
        lstPlace.add(new Place(3,"Название3","1234567893"));
        lstPlace.add(new Place(4,"Название4","1234567894"));
    }
    @Override
    public List<Place> getListOfPlaces(){
        return lstPlace;
    }
    @Override
    public List<Place> addNewPlace(Place item){
    lstPlace.add(item);
    return lstPlace;
    }    
}

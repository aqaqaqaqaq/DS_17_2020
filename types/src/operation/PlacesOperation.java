/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.List;
import types.Place;

/**
 *
 * @author Dima
 */
public interface PlacesOperation {
    List<Place> getListOfPlaces();
    List<Place> addNewPlace (Place item);
}

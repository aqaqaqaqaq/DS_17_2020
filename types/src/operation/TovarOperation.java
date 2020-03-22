/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;
import types.Tovar;
/**
 *
 * @author Dima
 */
import java.util.List;
public interface TovarOperation {
    List<Tovar> getListOfTovar();
    List<Tovar> addNewTovar(Tovar item);
    int getSumOfTovar();
}

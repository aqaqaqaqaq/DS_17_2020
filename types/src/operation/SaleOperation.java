/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.List;
import types.Sale;

/**
 *
 * @author Dima
 */
public interface SaleOperation {
    List<Sale> getListOfSales();
    List<Sale> addNewSale (Sale item);
    List<Sale> deleteSale(int Id);
}

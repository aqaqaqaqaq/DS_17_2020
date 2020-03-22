/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;
import java.util.List;
import types.Sale;

/**
 *
 * @author Dima
 */
public class SaleOperationImpl implements SaleOperation{
      static List<Sale> lstSale = new ArrayList<Sale>();
    static{
        lstSale.add(new Sale(1,1,1,1,1)); 
        lstSale.add(new Sale(2,2,2,2,2));
    }
    @Override
    public List<Sale> getListOfSales(){
        return lstSale;
    }
    @Override
    public List<Sale> addNewSale(Sale item){
    lstSale.add(item);
    return lstSale;
    }
    @Override
    public List<Sale> deleteSale(int id){
        for(Sale sale:lstSale)
        {
            if (sale.getId()==id)
                lstSale.remove(sale);
        }
        return lstSale;
    }    

}

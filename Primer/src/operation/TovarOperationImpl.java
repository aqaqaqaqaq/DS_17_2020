/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

/**
 *
 * @author dvoeg
 */
import java.util.ArrayList;

import java.util.List;

import types.Tovar;

public class TovarOperationImpl implements TovarOperation{

static List<Tovar> lstTovar = new ArrayList<Tovar>();

static{

lstTovar.add(new Tovar("Товар1", 10, 100));

lstTovar.add(new Tovar("Товар2", 20, 200));

lstTovar.add(new Tovar("Товар3", 30, 300));

lstTovar.add(new Tovar("Товар4", 40, 400));

}

@Override

public List<Tovar> getListOfTovar(){

return lstTovar;

}

@Override

public List<Tovar> addNewTovar(Tovar item){

lstTovar.add(item);

return lstTovar;

}

@Override

public int getSumOfTovar(){

int sum = 0;

for(Tovar tovar: lstTovar)

sum += tovar.getKol() * tovar.getPrice();

return sum;

}

}
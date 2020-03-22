/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;
import java.util.List;
import types.GroupTovar;

/**
 *
 * @author Dima
 */
public class GroupTovarOperationImpl implements GroupTovarOperation {
    static List<GroupTovar> lstGroup = new ArrayList<GroupTovar>();
    static{
        lstGroup.add(new GroupTovar("Группа1",1));
        lstGroup.add(new GroupTovar("Группа2",2));
        lstGroup.add(new GroupTovar("Группа3",3));
        lstGroup.add(new GroupTovar("Группа4",4));
    }
    @Override
    public List<GroupTovar> getListOfGroups(){
        return lstGroup;
    }
    @Override
    public List<GroupTovar> addNewGroup(GroupTovar item){
    lstGroup.add(item);
    return lstGroup;
    }
}


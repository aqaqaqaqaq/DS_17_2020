/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.ArrayList;
import java.util.List;
import types.User;

/**
 *
 * @author Dima
 */
public class UserOperationImpl implements UserOperation{
    static List<User> lstUser = new ArrayList<User>();
    static{
        lstUser.add(new User("ФИО1","Номер1",1));
        lstUser.add(new User("ФИО2","Номер2",2));
        lstUser.add(new User("ФИО3","Номер3",3));
        lstUser.add(new User("ФИО4","Номер4",4));
    }
    @Override
    public List<User> getListOfUser(){
        return lstUser;
    }
    @Override
    public List<User> addNewUser(User item){
    lstUser.add(item);
    return lstUser;
    }
}

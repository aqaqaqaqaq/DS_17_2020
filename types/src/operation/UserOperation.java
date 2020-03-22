/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import java.util.List;
import types.User;

/**
 *
 * @author Dima
 */
public interface UserOperation {
    List<User> getListOfUser();
    List<User> addNewUser(User item);
}

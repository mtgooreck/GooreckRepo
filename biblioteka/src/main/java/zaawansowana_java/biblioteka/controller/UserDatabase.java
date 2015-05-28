/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaawansowana_java.biblioteka.controller;

import java.util.ArrayList;
import java.util.List;
import zaawansowana_java.biblioteka.model.User;

/**
 *
 * @author Maciek
 */
public class UserDatabase {

    private List<User> users;

    public UserDatabase() {
        users=new ArrayList<User>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
    
    public void removeUser(int index){
    	users.remove(index);
    }
}

package zaawansowana_java.biblioteka.controller;

import zaawansowana_java.biblioteka.model.*;

public class Controller {

    BookDatabase bdb;
    UserDatabase udb;

    public Controller() {
        bdb = new BookDatabase();
        udb = new UserDatabase();
    }
    
    public void AddUser(User user){
    	udb.addUser(user);
    }
    
    public void removeUser(int index){
    	udb.removeUser(index);
    }

}

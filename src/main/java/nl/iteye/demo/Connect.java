package nl.iteye.demo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: armin
 * Date: 9/23/12
 * Time: 10:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class Connect {

    private HashMap<String, User> users;

    public Connect()
    {
        users = new HashMap<String, User>();
        users.put("armin", new User());
    }

    public User getUser(String user) {
        return users.get(user);
    }
}

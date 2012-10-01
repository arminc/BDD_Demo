package nl.iteye.fitnesse;

import nl.iteye.demo.Connect;
import nl.iteye.demo.ConnectFactory;
import nl.iteye.demo.User;

/**
 * Created with IntelliJ IDEA.
 * User: armin
 * Date: 9/30/12
 * Time: 12:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class RegisterHours{

    private String user;
    private int initialhours;
    private int hours;

    public void setUser(String user) {
        this.user = user;
    }

    public void setInitialhours(int initialhours) {
        this.initialhours = initialhours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

     public int total()
     {
         Connect connect = ConnectFactory.getConnect();
         User user = connect.getUser(this.user);
         user.addHours(hours);
         return user.getHours();
     }
}

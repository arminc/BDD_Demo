package nl.iteye.junit;

import junit.framework.Assert;
import nl.iteye.demo.Connect;
import nl.iteye.demo.ConnectFactory;
import nl.iteye.demo.User;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: armin
 * Date: 9/23/12
 * Time: 10:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class HoursRegistrationTest {

    private Connect connect;

    @Before
    public void initialize()
    {
        this.connect = ConnectFactory.getConnect();
    }

    @Test
    public void voegUrenToe()
    {
       User user = this.connect.getUser("armin");
       assertEquals(0, user.getHours());
       user.addHours(10);
       assertEquals(10, user.getHours());
    }
}

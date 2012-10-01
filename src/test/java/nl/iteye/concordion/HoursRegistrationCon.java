package nl.iteye.concordion;

import nl.iteye.demo.Connect;
import nl.iteye.demo.ConnectFactory;
import nl.iteye.demo.User;
import org.concordion.integration.junit3.ConcordionTestCase;
import org.hamcrest.core.IsEqual;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: armin
 * Date: 9/23/12
 * Time: 11:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class HoursRegistrationCon extends ConcordionTestCase {
    Connect connect;
    User user;

    public void  userSelected(String userStr)
    {
        connect = ConnectFactory.getConnect();
        user = connect.getUser(userStr);
    }

    public void addHoursToUser(int hours)
    {
         user.addHours(hours);
    }

    public int verifyHours()
    {
        return user.getHours();
    }
}

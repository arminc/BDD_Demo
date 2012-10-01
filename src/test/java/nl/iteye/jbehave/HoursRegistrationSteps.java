package nl.iteye.jbehave;

import nl.iteye.demo.Connect;
import nl.iteye.demo.ConnectFactory;
import nl.iteye.demo.User;
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
public class HoursRegistrationSteps {
    Connect connect;
    User user;

    @Given("$userStr has no hours registered")
    public void  userSelected(String userStr)
    {
        connect = ConnectFactory.getConnect();
        user = connect.getUser(userStr);
    }

    @When("user adds $hours hours to his week")
    public void addHoursToUser(int hours)
    {
         user.addHours(hours);
    }

    @Then("connect should show $hours hours registered")
    public void verifyHours(int hours)
    {
        assertThat(user.getHours(), IsEqual.equalTo(hours));
    }
}

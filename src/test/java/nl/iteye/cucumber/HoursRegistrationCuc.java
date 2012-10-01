package nl.iteye.cucumber;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import nl.iteye.demo.Connect;
import nl.iteye.demo.ConnectFactory;
import nl.iteye.demo.User;
import org.hamcrest.core.IsEqual;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: armin
 * Date: 9/30/12
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class HoursRegistrationCuc {
    Connect connect;
    User user;

    @Given("^\"([^\"]*)\" has no hours registered$")
    public void  userSelected(String userStr)
    {
        connect = ConnectFactory.getConnect();
        user = connect.getUser(userStr);
    }

    @When("^user adds \"([^\"]*)\" hours to his week$")
    public void addHoursToUser(int hours)
    {
        user.addHours(hours);
    }

    @Then("connect should show \"([^\"]*)\" hours registered$")
    public void verifyHours(int hours)
    {
        assertThat(user.getHours(), IsEqual.equalTo(hours));
    }
}

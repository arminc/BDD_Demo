package nl.iteye.cucumber;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created with IntelliJ IDEA.
 * User: armin
 * Date: 9/30/12
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-report", "json-pretty:target/cucumber-report.json"})
public class RegisterHours {
}

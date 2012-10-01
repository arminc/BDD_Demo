package nl.iteye.demo;

/**
 * Created with IntelliJ IDEA.
 * User: armin
 * Date: 9/23/12
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class User {

    private int hours = 0;

    public int getHours() {
        return this.hours;  //To change body of created methods use File | Settings | File Templates.
    }

    public void addHours(int hours) {
        this.setHours(this.getHours() + hours);
    }

    private void setHours(int hours)
    {
        this.hours = hours;
    }
}

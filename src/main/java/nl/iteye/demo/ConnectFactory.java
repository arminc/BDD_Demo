package nl.iteye.demo;

/**
 * Created with IntelliJ IDEA.
 * User: armin
 * Date: 9/23/12
 * Time: 10:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectFactory {

    private static Connect connect;

    public static Connect getConnect() {
        if(connect != null)
        {
            return connect;
        }
        return new Connect();
    }
}


package mall_supervision_system;
import java.sql.*;

/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class conn {
    Connection c;
    public Statement s;
    public conn()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///mall","root","");
            s = c.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new conn();
    }
    
}


package dbpackage;



import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
import oracle.jdbc.OracleDriver;

public class ConnectionProvider {
    

    public static Connection getconnection(HttpSession session) throws SQLException    {
        if(session.getAttribute("connection")!=null)
            return (Connection)session.getAttribute("connection");
        
    DriverManager.registerDriver(new OracleDriver());
    String user="system";
    String password="vishal";
    String url="jdbc:oracle:thin:@localhost:1521:xe";
    Connection connection=DriverManager.getConnection(url,user,password);
    session.setAttribute("connection", connection);
    return (Connection)session.getAttribute("connection");
    }
}
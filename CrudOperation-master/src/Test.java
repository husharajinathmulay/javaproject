import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelab.repository.DBConnection;

public class Test 
{
 public static void main(String[] args) throws SQLException
 {
    DBConnection connection =new DBConnection();
       Connection con =connection.getConnection();
       PreparedStatement st=con.prepareCall("call showdata111(1)");
     System.out.println(st.execute());  
      

 }
}

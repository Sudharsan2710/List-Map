package connection;
import java.sql.*;
public class jdbc {
	    public static void main(String[] args) throws SQLException {
	        cars();
	    }

	    public static void cars() throws SQLException {
	        String url = "jdbc:mysql://localhost:3306/logicfirst";
	        String userName = "root";
	        String passWord = "Sudha@27102001";
	        String query = "SELECT * FROM CARS;";
	        Connection con = DriverManager.getConnection(url,userName,passWord);
	        Statement st = con.createStatement();
	        ResultSet rs = st.executeQuery(query);
	        ResultSetMetaData rsmd = rs.getMetaData();
	        int columnsNumber = rsmd.getColumnCount();
	        
	        while (rs.next()) {
	            for (int i =1; i <= columnsNumber; i++) {
	              //  if (i > 1) System.out.print(",  ");
	                String columnValue = rs.getString(i);
	               System.out.println( rsmd.getColumnName(i)+ " : "+columnValue+" " );
	            }
	            System.out.println("");
	        }
	        
	                
	        con.close();

	    }
	
	}


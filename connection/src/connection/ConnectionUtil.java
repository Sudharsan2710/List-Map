package connection;
import java.sql.*;
public class ConnectionUtil {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
			
		Connection connection =getConnection();
		System.out.println(connection);
		update();
		delete();
		insert();
		show();
	}
	public static Connection getConnection() throws ClassNotFoundException,SQLException {
		
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/logicfirst", "root", "Sudha@27102001");
		return connection ;
	}
	
	public static void update()  throws SQLException,ClassNotFoundException {
		Connection connection =getConnection();
		String query= "UPDATE CARS SET YEAR=2024 WHERE ID=1";
		PreparedStatement p = connection.prepareStatement(query);
		System.out.println("Table has been Updated");
		p.execute();
		connection.close();
		
	}
	public static void delete()  throws SQLException,ClassNotFoundException {
		Connection connection =getConnection();
		String query= "DELETE FROM CARS WHERE ID=4";
		PreparedStatement p = connection.prepareStatement(query);
		System.out.println("Table has been Updated");
		p.execute();
		connection.close();
		
	}
	public static void 	insert()  throws SQLException,ClassNotFoundException {
		Connection connection =getConnection();
		String query= "INSERT INTO CARS VALUES(11,'SELTOS',4,4,'XUV700',2022)";
		PreparedStatement p = connection.prepareStatement(query);
		System.out.println("Table has been Updated");
		p.execute();
		connection.close();
		
	}
	
	
	
	 public static void show() throws SQLException {
	      
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
	             
	                String columnValue = rs.getString(i);
	               System.out.println( rsmd.getColumnName(i)+ " : "+columnValue+" " );
	            }
	            System.out.println("");
	        }
	        con.close();
	        
	
	 }
	

	    }
	




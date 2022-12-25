package Kullanıcı2;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Kullanıcı {
	static final String DB="jdbc:mysql://localhost:3306/önpanel";
	static final String USER="root";
	static final String PASS="rott";
	static final String QUERY="SELECT *FROM kullanıcı"+" ";
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection(DB,USER,PASS);
		Statement st=con.createStatement();
	System.out.println("Veri Tabanına Bağlandı");
	String sql="INSERT INTO kayıt VALUES(101,'Ali','veli',30)";
	   st.executeUpdate(sql);
	}

}

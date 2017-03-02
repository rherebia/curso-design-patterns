import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(String banco) {
		Connection connection = null;
		try {
			if (banco.equals("postgresql")) {
				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/banco", "root", "123");
			} else if (banco.equals("mysql")) {
				connection = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "123");
			} else {
				throw new RuntimeException("Banco sem configuração");
			}
			
			return connection;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}
}

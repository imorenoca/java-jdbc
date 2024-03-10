package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMySqlJDBC {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/db_springboot?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

			try {
				Connection conexion = DriverManager.getConnection(url, "root", "admin");
				Statement instruccion = conexion.createStatement();
				String sql = "SELECT id, name, lastname, programming_language from persons ";
				ResultSet resultado = instruccion.executeQuery(sql);
				while(resultado.next()) {
					System.out.println("ID: " + resultado.getInt("id"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}

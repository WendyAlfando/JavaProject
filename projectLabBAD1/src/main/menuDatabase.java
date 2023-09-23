package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class menuDatabase {

	public static void main(String[] args) {
		Connection connect = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "root";
			String password = "";
			String server = "localhost:3306";
			String databaseName = "projectlab";
			String connectionString = String.format("jdbc:mysql://%s/%s", server, databaseName);

			try {
				connect = DriverManager.getConnection(connectionString, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Statement st = null;
		try {
			st = connect.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			ResultSet rs = st.executeQuery("SELECT * FROM watch");

			while (rs.next()) {
				int WatchID = rs.getInt("WatchID");
				String WatchName = rs.getString("WatchName");
//				String WatchBrand = rs.getString("WatchBrand");
				int WatchPrice = rs.getInt("WatchPrice");
				int WatchStock = rs.getInt("WatchStock");
				

				System.out.println(WatchID + " " + WatchName + " " +  WatchPrice + " " + WatchStock);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

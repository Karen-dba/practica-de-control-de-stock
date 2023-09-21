package com.alura.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
	public static void main (String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root/control_de_stock?useTimeZone=true&serverTimeZone=UTC", 
				"root", "6034");
		System.out.println("Cerrando la conexion ");
		con.close();
	}
}

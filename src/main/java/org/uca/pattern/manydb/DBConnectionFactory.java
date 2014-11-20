package org.uca.pattern.manydb;

import org.uca.pattern.db.Connection;
import org.uca.pattern.db.mysql.MySQLConnection;
//import org.uca.pattern.db.postgres.PostgresConnection;

public class DBConnectionFactory {
	public static Connection getConnection(String user, String pwd) {
		Connection conn;
		conn = new MySQLConnection(user, pwd);
		//conn = new PostgresConnection(user, pwd);
		return conn;
	}
}

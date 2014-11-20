package org.uca.pattern.db.mysql;

import org.uca.pattern.db.Connection;
import org.uca.pattern.db.ConnectionFactory;

public class MySQLFactory implements ConnectionFactory {

	@Override
	public Connection getConnection(String username, String password) {
		return new MySQLConnection(username, password);
	}

}

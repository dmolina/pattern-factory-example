package org.uca.pattern.db;

public interface ConnectionFactory {
	/**
	 * Generate the connection in general
	 * @param username of the database
	 * @param password of the database
	 * @return the Connection
	 */
	public Connection getConnection(String username, String password);
}

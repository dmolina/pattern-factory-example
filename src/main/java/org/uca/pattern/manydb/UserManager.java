package org.uca.pattern.manydb;

import org.uca.pattern.db.mysql.MySQLConnection;

/**
 * Created by daniel on 20/11/14.
 */
public class UserManager {
    /**
     * save the update
     *
     * @param name   of the user
     * @param newAge to save
     */
    public void saveAge(String name, int newAge) {
        MySQLConnection connection = new MySQLConnection("manydb", "userdb:pwddb");
        connection.updateSql("UPDATE USER SET age=" + newAge + " WHERE name='" + name + "'");
    }
}

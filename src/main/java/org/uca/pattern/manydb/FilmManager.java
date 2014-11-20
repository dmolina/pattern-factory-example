package org.uca.pattern.manydb;

import org.uca.pattern.org.uca.pattern.db.mysql.MySQLConnection;

/**
 * Created by daniel on 20/11/14.
 */
public class FilmManager {
    public void removeAll() {
        MySQLConnection connection = new MySQLConnection("manydb", "userdb:pwddb");
        connection.updateSql("DELETE FROM FILMS");

        MySQLConnection connection2 = new MySQLConnection("manyfilm", "userdb:pwddb");
        connection.updateSql("REMOVE TABLE FILMS");
    }
}

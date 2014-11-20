package org.uca.pattern.db.mysql;

import org.uca.pattern.db.Connection;

/**
 * Created by daniel on 20/11/14.
 */
public class MySQLConnection implements Connection {

    public MySQLConnection(String user, String pwd) {
    }

    @Override
    public void updateSql(String sql) {
        System.out.println("MySQL ejecuta '" + sql + "'");
    }

}

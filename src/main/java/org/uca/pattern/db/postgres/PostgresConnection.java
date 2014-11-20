package org.uca.pattern.db.postgres;

import org.uca.pattern.db.Connection;

/**
 * Created by daniel on 20/11/14.
 */
public class PostgresConnection implements Connection {

    PostgresConnection(String user, String pwd) {
    }

    @Override
    public void updateSql(String sql) {
        System.out.println("Postgres ejecuta '" + sql + "'");
    }
}

package org.uca.pattern.db;

/**
 * Created by daniel on 20/11/14.
 */
public interface Connection {
    /**
     * Apply an update
     *
     * @param sql sentence to apply
     */
    void updateSql(String sql);
}

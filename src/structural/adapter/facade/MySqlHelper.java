package structural.adapter.facade;

import java.sql.Connection;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class MySqlHelper {

    public static Connection getMySqlDBConnection() {
        //get MySql DB connection using connection parameters
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }
}
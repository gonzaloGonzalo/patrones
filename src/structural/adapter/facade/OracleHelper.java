package structural.adapter.facade;

import java.sql.Connection;

/**
 * Created by gonzaloGar on 20/03/17.
 */
public class OracleHelper {

    public static Connection getOracleDBConnection() {
        //get Oracle DB connection using connection parameters
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        //get data from table and generate pdf report
    }

}
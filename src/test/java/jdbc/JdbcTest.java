package jdbc;

import java.sql.*;
import java.util.Arrays;

public class JdbcTest {
    public static void main(String[] args) throws Exception {
        mysqlColName2JavaMember("gaotu","order_info");


    }

    public static void mysqlColName2JavaMember(String schema,String table) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull&characterEncoding=utf8";
        String sql = "select COLUMN_NAME,DATA_TYPE from information_schema.COLUMNS where TABLE_SCHEMA='"+schema+"' and TABLE_NAME = '"+table+"';";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, "root", "Zh1203369541");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getString("COLUMN_NAME"));
//                if(){
////                    java.sql.Types
//                }
                System.out.println(resultSet.getString("DATA_TYPE"));
            }
            System.out.println(resultSet);
        } finally {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }


    }
}

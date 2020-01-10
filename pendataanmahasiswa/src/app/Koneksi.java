/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

/**
 *
 * @author USER
 */
public class Koneksi {

    /**
     * @param args the command line arguments
     */
    public static Connection MySQL() {
        // TODO code application logic here
    try{
        MysqlDataSource ds = new MysqlDataSource();
        ds.setUser("kelasc");
        ds.setPassword("kelasc123");
        ds.setServerName("localhost");
        ds.setDatabaseName("pendataanmahasiswa");
        ds.setServerTimezone("Asia/Jakarta");
        ds.setPortNumber(3306);
        Connection c = ds.getConnection();
        return c;
    } catch (Exception e) {
        System.err.println(e.getMessage());
        return null;
    }

        
    }
    
    
}

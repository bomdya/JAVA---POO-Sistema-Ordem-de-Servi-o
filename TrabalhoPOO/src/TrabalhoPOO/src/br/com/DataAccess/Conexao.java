
package TrabalhoPOO.src.br.com.DataAccess;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Adriele
 */
    public abstract class Conexao {
    public static Connection conector(){
        java.sql.Connection conexao = null;
         return conexao;
    }
        
        //Chamando o Driver
        //Armazenando informações referentes ao banco
        
        private static final String DRIVER = "com.mysql.jdbc.Driver";
        
        private static final String URL = "jdbc:mysql://localhost:3306/conexaopoo";
        
        private static final String USER = "root";
        
        private static final String PASS = "";
        
        public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
            
        } catch (Exception e) {
            return null;
        }}
         
    }
    
    
    
    
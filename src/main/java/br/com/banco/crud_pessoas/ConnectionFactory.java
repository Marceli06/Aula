/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.banco.crud_pessoas;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    //127.0.0.1
    //localhost
    
    private final String host = "localhost";
    private final String port = "3306";
    private final String user = "root";
    private final String senha = "anima123";
    private final String db = "BIBLIOTECA";

    public Connection conectar() throws Exception{
        //http://dontpad.com:80/bossini
        //String de conexão
        //String s = "jdbc:mysql://" + host + ": " + port + " / " + db ;
        String s = String.format(
                "jdbc:mysql://%s:%s/%s", host, port, db);
        
        Connection c = DriverManager.getConnection(s, user, senha);
        
        return c;
    }
}

package com.codizer;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public final class DBSingleton {
	
	private static final DBSingleton conexionDB = new DBSingleton();
	
	private final String USERNAME = "root";
	private final String PASSWORD = "w#9M_*G<LIad";
	private final String HOST = "127.0.0.1";
	private final String PORT = "3306";
	private final String DATABASE = "singleton";
	private final String CLASSNAME = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DATABASE;
    
    private Connection con;
    
    /**
     * Constructor general y privado
     * para evitar la creación 
     * de nuevas instacias.
     */
    private DBSingleton() {
    	
    	try {
            Class.forName(CLASSNAME);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conectado");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
    }
    
    /**
     * Getter para obtener la instancia
     * de la clase DBSingleton
     * @return conexionDB
     */
    public static DBSingleton getDBSingleton() {
        return conexionDB;
    }
}

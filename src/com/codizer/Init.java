package com.codizer;

/**
 * 
 * @author Adrian Ortiz
 *
 */
public class Init {

	/**
	 * Singleton a una conexion
	 * de base de datos MySQL
	 * @param args
	 */
	public static void main(String[] args) {
		DBSingleton n1 = DBSingleton.getDBSingleton();
		DBSingleton n2 = DBSingleton.getDBSingleton();
		DBSingleton n3 = DBSingleton.getDBSingleton();
	}
}

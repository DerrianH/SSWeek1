/**
 * 
 */
package com.ss.training.weekone;

/**
 * Sample Singleton class
 * @author derrianharris
 *
 */
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class SampleSingleton {

	private SampleSingleton(){

	}

	private static SampleSingleton instance = null;

	
	/**
	 * Creates a new static instance of the class, 
	 * if one has not been created, and returns it.
	 * @return
	 */
	public static SampleSingleton getInstance() {
		if (instance == null) {
			synchronized (instance) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}

	/**
	 * Queries Database
	 * @param input
	 */
	public static void databaseQuery(BigDecimal input) {
		try (Connection conn = DriverManager.getConnection("url of database");){
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			int x = 0;
			while (rs.next()) {
				x = rs.getInt(1) * input.intValueExact();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
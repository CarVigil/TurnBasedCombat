package data;

import java.sql.*;
import util.*;


public class FactoryConnection {

	private String dbDriver="com.mysql.jdbc.Driver";
	private String host="localhost";
	private String port="3306";
	private String user="java2016";
	private String pass="java";
	private String db="java2016";
	private String dbType="mysql";

	private Connection conn;
	private int cantConn = 0;

	private FactoryConnection() throws ApplicationException {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			throw new ApplicationException("Error del Driver JDBC",e);
		}
	}

	private static FactoryConnection instance;
	
	public static FactoryConnection getInstance() throws ApplicationException{
		if (instance==null){
			instance = new FactoryConnection();
		}
		return instance;
	}

	public Connection getConn() throws ApplicationException {
		try {
			if (conn == null || conn.isClosed()) {
				conn = DriverManager.getConnection(
							"jdbc:"+dbType+"://"+host+":"+port+"/"+
							db+"?user="+user+"&password="+pass
						);
				cantConn++;
			}
		} catch (SQLException e) {
			throw new ApplicationException("Error al conectarse a la DB", e);
		}
		return conn;
	}

	public void releaseConn() throws ApplicationException {
		try {
			cantConn--;
			if (cantConn == 0) {
				conn.close();
			}
		}
		catch (SQLException e) {
			throw new ApplicationException("Error al cerrar la conexión", e);
		}
	}
}

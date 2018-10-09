package ufps;

import java.sql.DriverManager;

import java.sql.Connection;

public class connection {


		private static final String DRIVER = "org.gjt.mm.mysql.Driver";
		private static final String DATABASE_URL = "jdbc:mysql://localhost/nueva?noAccessToProcedureBodies=true";
		private static final String USER = "root";
		private static final String PASSWORD = "";

		/**
		 * Metodo que genera la conexion a la base de datos.
		 *
		 * @return Connection a traves del cual se puede acceder a la base de datos.
		 * @throws java.lang.Exception
		 *             Exception originada por fallo en la conexion.
		 */
		public static Connection generarConexion() throws Exception {
			Connection conexion;
			Class.forName(DRIVER).newInstance();
			conexion = (Connection) DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
			return conexion;
		}


}

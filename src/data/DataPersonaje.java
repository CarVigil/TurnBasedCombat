package data;

import java.sql.*;

import util.ApplicationException;
import business.entities.Personaje;

public class DataPersonaje {

	public DataPersonaje() {
		
	}

	public void add(Personaje per) throws ApplicationException {
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			stmt = ConnectionFactory.getInstance().getConn().prepareStatement(
					"insert into personajes (nombre,vida,energia,defensa,evasion,puntos_totales) " +
					"values (?,?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
			// PreparedStatement.RETURN_GENERATED_KEYS to be able to retrieve id generated on the db
			// by the autoincrement column. Otherwise don't use it

			stmt.setString(1, per.getNombre());
			stmt.setInt(2, per.getVida());
			stmt.setInt(3, per.getEnergia());
			stmt.setInt(4, per.getDefensa());
			stmt.setInt(5, per.getEvasion());
			stmt.setInt(6, per.getPuntosTotales());
			stmt.execute();

			//after executing the insert use the following lines to retrieve the id
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				per.setCodPersonaje(rs.getInt(1));
			}
		} catch (SQLException e) {
			throw new ApplicationException("Error", e);
		} finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				ConnectionFactory.getInstance().releaseConn();
			} catch (SQLException e) {
				throw new ApplicationException("Error ", e);
			}
		}
	}

	public void update(Personaje per) throws ApplicationException {
		PreparedStatement stmt = null;

		try {
			stmt = ConnectionFactory.getInstance().getConn().prepareStatement(
					"update personajes set nombre = ?, vida = ?, energia = ?," +
					"defensa = ?, evasion = ?, puntos_totales = ? " +
					"where id = ?");
			stmt.setString(1, per.getNombre());
			stmt.setInt(2, per.getVida());
			stmt.setInt(3, per.getEnergia());
			stmt.setInt(4, per.getDefensa());
			stmt.setInt(5, per.getEvasion());
			stmt.setInt(6, per.getPuntosTotales());
			stmt.setInt(7, per.getIdPersonaje());
			stmt.execute();
		} catch (SQLException e) {
			throw new ApplicationException("Error actualizando personaje", e);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			throw new ApplicationException("Error actualizando personaje", e);
		}
		finally {
			try {
				if (stmt != null) stmt.close();
				ConnectionFactory.getInstance().releaseConn();
			} catch (SQLException e) {
				throw new ApplicationException("Error cerrando", e);
			}
		}
	}

	public void delete(Personaje per) throws ApplicationException {
		PreparedStatement stmt = null;

		try {
			stmt = ConnectionFactory.getInstance().getConn().prepareStatement(
					"delete from personajes where id = ?");
			stmt.setInt(1, per.getCodPersonaje());
			int rowCount = stmt.executeUpdate();
			if (rowCount == 0) {
				throw new ApplicationException("no existe el personaje");
			}
		} catch (SQLException e) {
			throw new ApplicationException("Error eliminando personaje", e);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			throw new ApplicationException("Error eliminando personaje", e);
		}
		finally {
			try {
				if (stmt != null) stmt.close();
				ConnectionFactory.getInstance().releaseConn();
			} catch (SQLException e) {
				//TODO Auto-generated catch block
				throw new ApplicationException("Error cerrando", e);
			}
		}
	}

	public Personaje getByCod(Personaje per) throws ApplicationException {
		Personaje p = null;

		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			stmt = ConnectionFactory.getInstance().getConn().prepareStatement(
					"select id, nombre, vida, energia, defensa, evasion, puntos_totales from personajes where id = ?");
			stmt.setInt(1, per.getCodPersonaje());
			rs = stmt.executeQuery();
			if (rs != null && rs.next()) {
				p = new Personaje();
				p.setCodPersonaje(rs.getInt("id"));
				p.setNombre(rs.getString("nombre"));
				p.setVida(rs.getInt("vida"));
				p.setEnergia(rs.getInt("energia"));
				p.setDefensa(rs.getInt("defensa"));
				p.setEvasion(rs.getInt("evasion"));
				p.setPuntosTotales(rs.getInt("puntos_totales"));
			}
		}
		catch (SQLException e) {
			throw new ApplicationException("Error obteniendo personaje", e);
		}
		finally {
			try {
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				ConnectionFactory.getInstance().releaseConn();
			} catch (SQLException e) {
				throw new ApplicationException("Error cerrando", e);
			}
		}

		return p;
	}
}

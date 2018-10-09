package ufps;

import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class reconocimientoDAO {
	
	Connection con;
	
	public reconocimientoDAO() {
		
	}
	
	public ArrayList<reconocimientoDTO> listar() throws Exception {
        ArrayList<reconocimientoDTO> list = new ArrayList<>();
        con = connection.generarConexion();
        PreparedStatement stmt = con.prepareStatement("SELECT latitud,"
        		+ "longitud, msg, api_cloud FROM reconocimiento;");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
        	reconocimientoDTO dto = new reconocimientoDTO();
            dto.setLatitud(Float.parseFloat(rs.getString(1)));
            dto.setLongitud(Float.parseFloat(rs.getString(2)));
            dto.setMsg(rs.getString(3));
            dto.setApi_cloud(rs.getString(4));
            list.add(dto);
        }
        con.close();
        return list;
    }

}

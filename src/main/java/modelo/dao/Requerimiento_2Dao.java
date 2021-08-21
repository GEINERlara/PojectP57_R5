package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {
        // Su código
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_2Vo> listado_rq2 = new ArrayList<Requerimiento_2Vo>();
        String sql = "SELECT c.ID_Proyecto, mc.Nombre_Material, mc.Precio_Unidad FROM Compra c  INNER JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion WHERE c.ID_Proyecto IN (23, 38, 50) ORDER BY c.ID_Proyecto;";

        try (Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                requerimiento2.setID_Proyecto(rs.getInt("ID_Proyecto"));
                requerimiento2.setNombreMaterial(rs.getString("Nombre_Material"));
                requerimiento2.setPrecioUnidad(rs.getInt("Precio_Unidad"));
                listado_rq2.add(requerimiento2);
            }
        }
        return listado_rq2;
    }
}

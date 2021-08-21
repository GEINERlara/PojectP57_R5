package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_1Vo;
import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        // Su código
        Connection connection = JDBCUtilities.getConnection();
        ArrayList<Requerimiento_1Vo> listado_rq1 = new ArrayList<Requerimiento_1Vo>();
        String sql = "SELECT l.ID_Lider ,l.Salario,l.Ciudad_Residencia FROM Lider l WHERE l.Salario < (SELECT AVG(l.Salario)  FROM Lider l ) ORDER BY l.Salario ;";

        try(Statement stmt = connection.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Requerimiento_1Vo requerimiento1 = new Requerimiento_1Vo();
                requerimiento1.setID_Lider(rs.getInt("ID_lider"));
                requerimiento1.setSalario(rs.getInt("Salario"));
                requerimiento1.setCiudad_Residencia(rs.getString("Ciudad_Residencia"));
                listado_rq1.add(requerimiento1);
            }  
  
        } 
        return listado_rq1;
    }
}
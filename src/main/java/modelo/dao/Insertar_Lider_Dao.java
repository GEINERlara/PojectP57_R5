package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import modelo.vo.Insertar_Lider_Vo;
import util.JDBCUtilities;

public class Insertar_Lider_Dao {

    public int insertarLider(Insertar_Lider_Vo insertar) throws SQLException {

        int rs=0;
        Connection conex =JDBCUtilities.getConnection();
        try {
            String sql ="INSERT INTO Lider (ID_Lider, Nombre, Primer_Apellido, Segundo_Apellido,Salario, Ciudad_Residencia, Cargo, Clasificacion,Documento_Identidad,Fecha_Nacimiento) VALUES (?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement consulta = conex.prepareStatement(sql);
            consulta.setInt(1, insertar.getId_Lider());
            consulta.setString(2, insertar.getNombre());
            consulta.setString(3, insertar.getPrimer_Apellido());
            consulta.setString(4, insertar.getSegundo_Apellido());
            consulta.setInt(5, insertar.getSalario());
            consulta.setString(6, insertar.getCiudadR());
            consulta.setString(7, insertar.getCargo());
            consulta.setInt(8, insertar.getClasificacion());
            consulta.setString(9, insertar.getDocumento());
            consulta.setString(10, insertar.getFechaNacimiento());

            rs = consulta.executeUpdate();

        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error, no se conecto");
            System.out.println(e);
        }
        
        return rs;
  }
        

}
    


package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import modelo.dao.Insertar_Lider_Dao;
// import modelo.dao.Requerimiento_3Dao;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import vista.CRUD;
import vista.Vistainsertar;
import modelo.vo.Insertar_Lider_Vo;
// import modelo.vo.Requerimiento_3Vo;

public class ControladorRequerimientos {
    // Su código
    private Requerimiento_1Dao requerimiento_1Dao;
    private Requerimiento_2Dao requerimiento_2Dao;
    private Insertar_Lider_Dao insertarLider_Dao;
    // private Requerimiento_3Dao requerimiento_3Dao;
    

    public ControladorRequerimientos() {
        this.requerimiento_1Dao = new Requerimiento_1Dao();
        this.requerimiento_2Dao = new Requerimiento_2Dao();
        this.insertarLider_Dao = new Insertar_Lider_Dao();
        // this.requerimiento_3Dao = new Requerimiento_3Dao();
    }

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
        // Su código
        return this.requerimiento_1Dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
        // Su código
        return this.requerimiento_2Dao.requerimiento2();
    }

    public int insertarLider(Insertar_Lider_Vo insertar) throws SQLException {
        return this.insertarLider_Dao.insertarLider(insertar );
    }

    public void mostrarCRUD(){
        CRUD requerimiento3 = new CRUD();
        requerimiento3.setVisible(true);
    }

    public void mostrarVistainsertar(){
        Vistainsertar insertLider = new Vistainsertar();
        insertLider.setVisible(true);
    }


    // public ArrayList<Requerimiento_3Vo> consultarRequerimiento3() throws SQLException {
    //     // Su código
    //     return this.requerimiento_3Dao.requerimiento3();
    // }
}

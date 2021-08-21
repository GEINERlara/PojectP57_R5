package vista;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;

public class CRUD extends JFrame implements ActionListener{
    private  ControladorRequerimientos controlador;
    private JTabbedPane pestana;
    private JPanel panel, panelEntrada;
    private JButton botonreq1, botonreq2, botonreq3;
    private JTable tabla;

    public CRUD() {
        controlador = new ControladorRequerimientos();
        iterfaz();
        setLocationRelativeTo(null);

    }

    private void iterfaz() {
        setTitle("Reto5-UTP");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,700);

        pestana = new JTabbedPane();
        getContentPane().add(pestana,BorderLayout.CENTER);

        panel = new JPanel();
        panel.setLayout(new BorderLayout());
        pestana.addTab("Consulta", panel);
        
        panelEntrada = new JPanel();
        panelEntrada.add(new JLabel());

        //creacion botones
        botonreq1 = new JButton("Requerimiento1");
        botonreq1.setBounds(20, 80, 100, 25);
        panelEntrada.add(botonreq1);

        botonreq2 = new JButton("Requerimiento2");
        panelEntrada.add(botonreq2);

        botonreq3 = new JButton("Requerimiento3");
        panelEntrada.add(botonreq3);

        //accion del botones
        botonreq1.addActionListener(e->cargarReq1());

        botonreq2.addActionListener(e->cargarReq2());

        botonreq3.addActionListener(this);



        tabla = new JTable();
        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);

        panel.add(panelEntrada, BorderLayout.PAGE_START);
        
    }
    


    private void cargarReq2() {
        try {
            var lista = controlador.consultarRequerimiento2();
            var tableModel = new Requerimiento2TableModel();
            tableModel.setData(lista);

            tabla.setModel(tableModel);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }
    private class Requerimiento2TableModel extends AbstractTableModel {
        private ArrayList<Requerimiento_2Vo> data;

        public void setData(ArrayList<Requerimiento_2Vo> data) {
            this.data = data;
        }
        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "ID_Proyecto";
                
                case 1:
                    return "Nombre_Material";

                case 2:
                return "Precio_Unidad";
            }
            return super.getColumnName(column);
        }

        @Override
        public int getRowCount() {
            return data.size();
        }

        @Override
        public int getColumnCount() {
            return 3;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            var registro = data.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return registro.getID_Proyecto();
                
                case 1:
                    return registro.getNombreMaterial();

                case 2:
                return registro.getPrecioUnidad();
            }
            return null;
        }
        
    }


    private void cargarReq1() {
        try {
            var lista = controlador.consultarRequerimiento1();
            var tableModel = new Requerimiento1TableModel();
            tableModel.setData(lista);

            tabla.setModel(tableModel);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);
        }
    }
    private class Requerimiento1TableModel extends AbstractTableModel{
        
        private ArrayList<Requerimiento_1Vo> data;

        public void setData(ArrayList<Requerimiento_1Vo> data){
            this.data = data;
        }

        @Override
        public String getColumnName(int column) {
            switch (column) {
                case 0:
                    return "ID_Lider";
                
                case 1:
                    return "Salario";

                case 2:
                return "C.Residencia";
            }
            return super.getColumnName(column);
        }

        @Override
        public int getRowCount() {
            
            return data.size();
        }

        @Override
        public int getColumnCount() {
            
            return 3;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            var registro = data.get(rowIndex);

            switch (columnIndex) {
                case 0:
                    return registro.getID_Lider();
                
                case 1:
                    return registro.getSalario();

                case 2:
                return registro.getCiudad_Residencia();
            }
            return null;
        }
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==botonreq3){
            controlador.mostrarVistainsertar();
        }
        
    } 
}

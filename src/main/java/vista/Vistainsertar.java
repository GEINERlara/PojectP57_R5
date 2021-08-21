package vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import controlador.ControladorRequerimientos;
import modelo.vo.Insertar_Lider_Vo;

public class Vistainsertar extends JFrame implements ActionListener {
    private  ControladorRequerimientos controlador;
    private JLabel labelTitulo;
    private JLabel id,nombre,primerApellido,segundoApelldo,salario,ciudadResidancia,cargo,clasificacion,documentoId,fechaNacimiento;
    private JTextField textId, textNombre, textPrimerA, textSegundoA,textSalario,textCResiden,textCargo,textClasificacion,textDocuments,textFecha;
    private JButton botonInsertar;

    public Vistainsertar() {
        controlador = new ControladorRequerimientos();
        		// Configuración de la ventana (JFrame)
		setSize(480, 360);
		setTitle("Reto5-UTP");
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

        //labelTitulo
        labelTitulo =new JLabel("INSERTAR LIDER");
        labelTitulo.setBounds(120, 20, 299, 30);
        labelTitulo.setFont(new java.awt.Font("Verdana",1,18));
        add(labelTitulo);

        //campos ID
        id = new JLabel("ID_Lider");
        id.setBounds(20, 80, 80, 25);
        add(id);
        textId = new JTextField();
        textId.setBounds(120,80,100, 25);
        add(textId);

        //campo nombre
        nombre = new JLabel("Nombre");
        nombre.setBounds(230,80,80, 25);
        add(nombre);
        textNombre = new JTextField();
        textNombre.setBounds(335, 80, 100, 25);
        add(textNombre);

        //campos apellidos
        primerApellido =new JLabel("Primer Apellido");
        primerApellido.setBounds(20,120,100,25);
        add(primerApellido);
        textPrimerA = new JTextField();
        textPrimerA.setBounds(120,120,100,25);
        add(textPrimerA);

        segundoApelldo = new JLabel("Segundo Apellido");
        segundoApelldo.setBounds(230,120,100,25);
        add(segundoApelldo);
        textSegundoA = new JTextField();
        textSegundoA.setBounds(335,120,100,25);
        add(textSegundoA);

        //demas campos 
        salario = new JLabel("Salario");
        salario.setBounds(20, 160, 80, 25);
        add(salario);
        textSalario = new JTextField();
        textSalario.setBounds(120,160,100, 25);
        add(textSalario);

        ciudadResidancia = new JLabel("Ciudad Residencia");
        ciudadResidancia.setBounds(230,160,100, 25);
        add(ciudadResidancia);
        textCResiden = new JTextField();
        textCResiden.setBounds(335,160,100, 25);
        add(textCResiden);

        cargo = new JLabel("Cargo");
        cargo.setBounds(20,200,100, 25);
        add(cargo);
        textCargo = new JTextField();
        textCargo.setBounds(120,200,100, 25);
        add(textCargo);

        clasificacion = new JLabel("Clasificificacion");
        clasificacion.setBounds(230,200,100, 25);
        add(clasificacion);
        textClasificacion = new JTextField();
        textClasificacion.setBounds(335,200,100, 25);
        add(textClasificacion);

        documentoId = new JLabel("Documento ID");
        documentoId.setBounds(20,240,100, 25);
        add(documentoId);
        textDocuments = new JTextField();
        textDocuments.setBounds(120,240,100, 25);
        add(textDocuments);

        fechaNacimiento = new JLabel("Fecha Nacimiento");
        fechaNacimiento.setBounds(230,240,100, 25);
        add(fechaNacimiento);
        textFecha = new JTextField();
        textFecha.setBounds(335,240,100, 25);
        add(textFecha);

        //boton INSERTAR
        botonInsertar = new JButton("Insertar");
        botonInsertar.setBounds(170, 280, 100, 25);
        add(botonInsertar);
        botonInsertar.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int id1 = Integer.parseInt(textId.getText().toString());
        String nomre1 = textNombre.getText().toString();
        String pApellido1 = textPrimerA.getText().toString();
        String sApellido1 = textSegundoA.getText().toString();
        int salario1 = Integer.parseInt(textSalario.getText().toString());
        String ciudadR1 = textCResiden.getText().toString();
        String cargo1 = textCargo.getText().toString();
        int clasificacion1 = Integer.parseInt(textClasificacion.getText().toString());
        String documentoId1 = textDocuments.getText().toString();
        String fecha1 = textFecha.getText().toString();

        if (e.getSource()==botonInsertar){
            try {
                Insertar_Lider_Vo insertar = new Insertar_Lider_Vo();
                insertar.setId_Lider(id1);
                insertar.setNombre(nomre1);
                insertar.setPrimer_Apellido(pApellido1);
                insertar.setSegundo_Apellido(sApellido1);
                insertar.setSalario(salario1);
                insertar.setCiudadR(ciudadR1);
                insertar.setCargo(cargo1);
                insertar.setClasificacion(clasificacion1);
                insertar.setDocumento(documentoId1);
                insertar.setFechaNacimiento(fecha1);

                int ok = controlador.insertarLider(insertar);
                
                
                if(ok > 0){
                    JOptionPane.showMessageDialog(null, "Nuevo Lider agregado", "Aviso", JOptionPane.WARNING_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Hubo un problema al agregar ", "Aviso", JOptionPane.ERROR_MESSAGE);
            }

            } catch (Exception e3) {
                JOptionPane.showMessageDialog(null, "Error al consultar", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }




    

    
}

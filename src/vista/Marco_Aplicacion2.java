package vista;

import java.awt.*;

import controlador.*;

import javax.swing.*;

public class Marco_Aplicacion2 extends JFrame {

	public Marco_Aplicacion2() {

		setTitle("Consulta BBDD");

		setBounds(500, 300, 400, 400);

		setLayout(new BorderLayout());

		JPanel menus = new JPanel();

		menus.setLayout(new FlowLayout());

		secciones = new JComboBox();

		secciones.setEditable(false);

		secciones.addItem("Todos");

		asignaturas = new JComboBox();

		asignaturas.setEditable(false);

		asignaturas.addItem("Todos");

		resultado = new JTextArea(4, 50);

		resultado.setEditable(false);

		add(resultado);

		menus.add(secciones);

		menus.add(asignaturas);

		add(menus, BorderLayout.NORTH);

		add(resultado, BorderLayout.CENTER);

		JButton botonConsulta = new JButton("Consulta");
		
		add(botonConsulta, BorderLayout.SOUTH);

		addWindowListener(new ControladorCargaSecciones(this));
		
		
	}

	public JComboBox secciones;

	private JComboBox asignaturas;

	private JTextArea resultado;
}

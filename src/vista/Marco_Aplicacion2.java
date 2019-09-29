package vista;

import java.awt.*;

import javax.swing.*;

public class Marco_Aplicacion2 extends JFrame {

	public Marco_Aplicacion2() {

		setTitle("Consulta BBDD");

		setBounds(500, 300, 400, 400);

		setLayout(new BorderLayout());

		JPanel menus = new JPanel();

		menus.setLayout(new FlowLayout());

		nombres = new JComboBox();

		nombres.setEditable(false);

		nombres.addItem("Todos");

		asignaturas = new JComboBox();

		asignaturas.setEditable(false);

		asignaturas.addItem("Todos");

		resultado = new JTextArea(4, 50);

		resultado.setEditable(false);

		add(resultado);

		menus.add(nombres);

		menus.add(asignaturas);

		add(menus, BorderLayout.NORTH);

		add(resultado, BorderLayout.CENTER);

		JButton botonConsulta = new JButton("Consulta");
		
		add(botonConsulta, BorderLayout.SOUTH);

	}

	private JComboBox nombres;

	private JComboBox asignaturas;

	private JTextArea resultado;
}

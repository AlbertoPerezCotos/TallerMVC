package presentacion.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;

import presentacion.entidades.PEquipo;

import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantallaPrincipal {

	public JFrame frame;
	private JTextField txtIdEquipo;
	private JTextField txtNombreEquipo;
	private JTextField txtAnhoFundacEquipo;
	private JTextField txtIdEntrenador;
	private JTextField txtNombreEntrenador;
	private JTextField txtFNacimEntrenador;
	private JTextField txtApellEntrenador;
	private JTextField txtFInicioEntrenam;
	private JTable table;
	private JMenuItem mntmNuevoEquipo; //creado desde el builder, convirtiendo el boton en variable local
	private JMenuItem mntmBuscarEquipo;

	//Ponemos todo esto como comentario para que sólo haya un único punto de entrada: el main de Programa
	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantallaPrincipal window = new PantallaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public PantallaPrincipal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 660, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnMenuEquipo = new JMenu("Equipo");
		menuBar.add(mnMenuEquipo);
		
		mntmNuevoEquipo = new JMenuItem("Nuevo");
		/*mntmNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) //actionPerformed del boton nuevo del menu
			{
				JOptionPane.showMessageDialog(null, "Clic en menu");
			}
		});*/
		mnMenuEquipo.add(mntmNuevoEquipo);
		
		mntmBuscarEquipo = new JMenuItem("Buscar");
		mnMenuEquipo.add(mntmBuscarEquipo);
		
		JMenu mnEntrenador = new JMenu("Entrenador");
		menuBar.add(mnEntrenador);
		
		JMenu mnJugador = new JMenu("Jugador");
		menuBar.add(mnJugador);
		
		JPanel panelEquipo = new JPanel();
		panelEquipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panelEquipo.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Equipo", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelEquipo.setLayout(null);
		
		JLabel lblIdEquipo = new JLabel("Id");
		lblIdEquipo.setBounds(30, 17, 46, 14);
		panelEquipo.add(lblIdEquipo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(30, 42, 46, 14);
		panelEquipo.add(lblNombre);
		
		JLabel lblAoFundacion = new JLabel("A\u00F1o Fundacion");
		lblAoFundacion.setBounds(30, 67, 81, 14);
		panelEquipo.add(lblAoFundacion);
		
		txtIdEquipo = new JTextField();
		txtIdEquipo.setEditable(false);
		txtIdEquipo.setBounds(142, 11, 86, 20);
		panelEquipo.add(txtIdEquipo);
		txtIdEquipo.setColumns(10);
		
		txtNombreEquipo = new JTextField();
		txtNombreEquipo.setBounds(142, 36, 239, 20);
		panelEquipo.add(txtNombreEquipo);
		txtNombreEquipo.setColumns(10);
		
		txtAnhoFundacEquipo = new JTextField();
		txtAnhoFundacEquipo.setBounds(142, 61, 86, 20);
		panelEquipo.add(txtAnhoFundacEquipo);
		txtAnhoFundacEquipo.setColumns(10);
		
		JPanel panelEntrenador = new JPanel();
		panelEntrenador.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Entrenador", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JPanel panelJugadores = new JPanel();
		panelJugadores.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Jugadores", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		frame.getContentPane().add(panelEquipo);
		frame.getContentPane().add(panelEntrenador);
		panelEntrenador.setLayout(null);
		
		JLabel lbldEntrenador = new JLabel("Id");
		lbldEntrenador.setBounds(30, 25, 46, 14);
		panelEntrenador.add(lbldEntrenador);
		
		JLabel lblNombreEntrenador = new JLabel("Nombre");
		lblNombreEntrenador.setBounds(30, 50, 46, 14);
		panelEntrenador.add(lblNombreEntrenador);
		
		JLabel lblFNacimiento = new JLabel("F. nacimiento");
		lblFNacimiento.setBounds(30, 75, 72, 14);
		panelEntrenador.add(lblFNacimiento);
		
		txtIdEntrenador = new JTextField();
		txtIdEntrenador.setEditable(false);
		txtIdEntrenador.setBounds(137, 22, 86, 20);
		panelEntrenador.add(txtIdEntrenador);
		txtIdEntrenador.setColumns(10);
		
		txtNombreEntrenador = new JTextField();
		txtNombreEntrenador.setBounds(137, 47, 138, 20);
		panelEntrenador.add(txtNombreEntrenador);
		txtNombreEntrenador.setColumns(10);
		
		txtFNacimEntrenador = new JTextField();
		txtFNacimEntrenador.setBounds(137, 72, 117, 20);
		panelEntrenador.add(txtFNacimEntrenador);
		txtFNacimEntrenador.setColumns(10);
		
		JLabel lblApellidosEntrenador = new JLabel("Apellidos");
		lblApellidosEntrenador.setBounds(304, 50, 46, 14);
		panelEntrenador.add(lblApellidosEntrenador);
		
		JLabel lblFInicioEntrenamiento = new JLabel("F. Inicio Entrenamiento");
		lblFInicioEntrenamiento.setBounds(304, 75, 117, 14);
		panelEntrenador.add(lblFInicioEntrenamiento);
		
		txtApellEntrenador = new JTextField();
		txtApellEntrenador.setBounds(440, 47, 194, 20);
		panelEntrenador.add(txtApellEntrenador);
		txtApellEntrenador.setColumns(10);
		
		txtFInicioEntrenam = new JTextField();
		txtFInicioEntrenam.setText("");
		txtFInicioEntrenam.setBounds(440, 72, 117, 20);
		panelEntrenador.add(txtFInicioEntrenam);
		txtFInicioEntrenam.setColumns(10);
		frame.getContentPane().add(panelJugadores);
		panelJugadores.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(640, 146, -653, -128);
		panelJugadores.add(scrollPane);
		
		table = new JTable();
		table.setBounds(10, 27, 624, 108);
		panelJugadores.add(table);
	}//initialize()
	
	
	//listeners
	public void addmntmNuevoEquipoActionListener(ActionListener listener) //addmntm - add menu item
	{
		mntmNuevoEquipo.addActionListener(listener);
	}
	
	public void addmntmBuscarEquipoActionListener(ActionListener listener) //addmntm - add menu item
	{
		mntmBuscarEquipo.addActionListener(listener);
	}
	
	
	//mostrar los datos del equipo seleccionado desde el menu buscar y seleccionar equipo
	public void mostrarDatosEquipoSeleccionado(PEquipo equipoSeleccionado)
	{
		txtIdEquipo.setText(String.valueOf(equipoSeleccionado.id));
		
	}//mostrarDatosEquipoSeleccionado
	
	
}//class PantallaPrincipal

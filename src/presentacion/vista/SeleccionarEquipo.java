package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import presentacion.entidades.PEquipo;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JComboBox;

public class SeleccionarEquipo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtAnhoFundacEquipo;
	private JTextField txtNombreEquipo;
	private JTextField txtIdEquipo;
	private JButton btnSeleccionar;
	private JButton btnCerrar;
	private JComboBox comboBoxSelectEquipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			SeleccionarEquipo dialog = new SeleccionarEquipo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public SeleccionarEquipo() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblSeleccionarEquipo = new JLabel("-= SELECCIONAR EQUIPO =-");
			lblSeleccionarEquipo.setBounds(99, 10, 235, 20);
			lblSeleccionarEquipo.setFont(new Font("Tahoma", Font.BOLD, 16));
			contentPanel.add(lblSeleccionarEquipo);
		}
		{
			JLabel labelId = new JLabel("Id");
			labelId.setBounds(79, 109, 46, 14);
			contentPanel.add(labelId);
		}
		{
			JLabel labelNombreEquipo = new JLabel("Nombre");
			labelNombreEquipo.setBounds(79, 146, 46, 14);
			contentPanel.add(labelNombreEquipo);
		}
		{
			JLabel labelAnhoFundacEquipo = new JLabel("A\u00F1o de Fundacion");
			labelAnhoFundacEquipo.setBounds(79, 183, 95, 14);
			contentPanel.add(labelAnhoFundacEquipo);
		}
		{
			txtAnhoFundacEquipo = new JTextField();
			txtAnhoFundacEquipo.setColumns(10);
			txtAnhoFundacEquipo.setBounds(184, 180, 105, 20);
			contentPanel.add(txtAnhoFundacEquipo);
		}
		{
			txtNombreEquipo = new JTextField();
			txtNombreEquipo.setColumns(10);
			txtNombreEquipo.setBounds(184, 143, 181, 20);
			contentPanel.add(txtNombreEquipo);
		}
		{
			txtIdEquipo = new JTextField();
			txtIdEquipo.setEditable(false);
			txtIdEquipo.setColumns(10);
			txtIdEquipo.setBounds(184, 106, 46, 20);
			contentPanel.add(txtIdEquipo);
		}
		{
			comboBoxSelectEquipo = new JComboBox();
			comboBoxSelectEquipo.setBounds(99, 54, 235, 20);
			contentPanel.add(comboBoxSelectEquipo);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnSeleccionar = new JButton("Seleccionar");
				btnSeleccionar.setActionCommand("OK");
				buttonPane.add(btnSeleccionar);
				getRootPane().setDefaultButton(btnSeleccionar);
			}
			{
				btnCerrar = new JButton("Cerrar");
				btnCerrar.setActionCommand("Cancel");
				buttonPane.add(btnCerrar);
			}
		}
	}//SeleccionarEquipo()
	
	public PEquipo obtenerEquipoDesplegable()
	{
		PEquipo eq= new PEquipo();
		eq=(PEquipo) comboBoxSelectEquipo.getSelectedItem();
		
		return eq;
	}//obtenerEquipoDesplegable()
	
	public void actualizarPantalla()
	{
		PEquipo equipoSeleccionado= obtenerEquipoDesplegable();
		
		txtNombreEquipo.setText(equipoSeleccionado.nombre);
		txtAnhoFundacEquipo.setText(String.valueOf(equipoSeleccionado.anhoFundacion));
		
	}//actualizarPantalla()
	
	
	//Listeners
		public void addbtnSeleccionarAddActionPerformedEvent(ActionListener listener) //add btn - add button
		{
			btnSeleccionar.addActionListener(listener);
		}

		public void addbtnCerrarAddActionPerformedEvent(ActionListener listener) //add btn - add button
		{
			btnCerrar.addActionListener(listener);
		}

		public void mostrarEquiposDesplegable(ArrayList<PEquipo> listaEquiposPresent)
		{
			comboBoxSelectEquipo.setModel(new DefaultComboBoxModel<PEquipo>(listaEquiposPresent.toArray(new PEquipo[0])));
		}
		
		public void addbtncbSelectEquipoItemListener(ItemListener listener) //add btn cb - add button comboBox
		{
			comboBoxSelectEquipo.addItemListener(listener);
		}

}//class SeleccionarEquipo
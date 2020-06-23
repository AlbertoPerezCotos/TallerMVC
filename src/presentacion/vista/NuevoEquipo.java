package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import presentacion.entidades.PEquipo;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;

public class NuevoEquipo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtAnhoFundac;
	private JTextField txtNombreEquipo;
	private JTextField txtIdEquipo;
	private JButton btnGuardar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			NuevoEquipo dialog = new NuevoEquipo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public NuevoEquipo() {
		setModal(true);
		setBounds(100, 100, 520, 290);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(105, 93, 46, 14);
		contentPanel.add(lblId);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(105, 130, 46, 14);
		contentPanel.add(lblNombre);
		
		JLabel lblAoDeFundacion = new JLabel("A\u00F1o de Fundacion");
		lblAoDeFundacion.setBounds(105, 167, 95, 14);
		contentPanel.add(lblAoDeFundacion);
		
		txtAnhoFundac = new JTextField();
		txtAnhoFundac.setBounds(210, 164, 105, 20);
		contentPanel.add(txtAnhoFundac);
		txtAnhoFundac.setColumns(10);
		
		txtNombreEquipo = new JTextField();
		txtNombreEquipo.setBounds(210, 127, 181, 20);
		contentPanel.add(txtNombreEquipo);
		txtNombreEquipo.setColumns(10);
		
		txtIdEquipo = new JTextField();
		txtIdEquipo.setEditable(false);
		txtIdEquipo.setBounds(210, 90, 46, 20);
		contentPanel.add(txtIdEquipo);
		txtIdEquipo.setColumns(10);
		
		JLabel lblNuevoJugador = new JLabel("-= NUEVO JUGADOR =-");
		lblNuevoJugador.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNuevoJugador.setBounds(152, 11, 210, 25);
		contentPanel.add(lblNuevoJugador);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				btnGuardar = new JButton("Guardar");
				btnGuardar.setActionCommand("OK");
				buttonPane.add(btnGuardar);
				getRootPane().setDefaultButton(btnGuardar);
			}
			{
				btnCancelar = new JButton("Cancelar");
				btnCancelar.setActionCommand("Cancel");
				buttonPane.add(btnCancelar);
			}
		}
	}//nuevoEquipo

	//Listeners
	public void addbtnGuardarAddActionPerformedEvent(ActionListener listener) //add btn - add button
	{
		btnGuardar.addActionListener(listener);
	}

	public void addbtnCancelarAddActionPerformedEvent(ActionListener listener) //add btn - add button
	{
		btnCancelar.addActionListener(listener);
	}
	
	
	public PEquipo obtenerDatosEquipo()
	{
		PEquipo eq= new PEquipo();
		eq.nombre= txtNombreEquipo.getText();
		eq.anhoFundacion= Integer.valueOf(txtAnhoFundac.getText());
		return eq;
	}//obtenerDatosEquipo()
	
	public boolean validarFormulario()
	{
		boolean resultado= true;
		
		if(txtNombreEquipo.getText().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "El campo Nombre es obligatorio");
			resultado= false;
		}
		else
			try
			{
				Integer.valueOf(txtAnhoFundac.getText());
			}
			catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, "El campo Año de Fundacion es obligatorio");
				resultado= false;
			}
		return resultado;
	}//validarFormulario()

}//class NuevoEquipo
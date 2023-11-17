package nuevo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class imprimirArbol extends JFrame {

	private JPanel contentPane;
	private JTextField imprecion;

	public imprimirArbol() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 503);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		imprecion = new JTextField();
		imprecion.setBounds(10, 60, 595, 401);
		
		contentPane.add(imprecion);
		imprecion.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Imprimendo ArbolesB");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(166, 11, 205, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnRegresar = new JButton("Regresar");
		btnRegresar.setBounds(482, 11, 89, 23);
		contentPane.add(btnRegresar);
		pantalla regresoPantalla=new pantalla();
		//regresoPantalla();
		
	}
}

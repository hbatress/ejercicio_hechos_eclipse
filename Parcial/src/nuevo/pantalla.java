package nuevo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import grafica.informacion;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pantalla extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField personastext;
	private JTextField departamentotext;
	private JTextField bebidatext;
	private JTextField gradotext;
	JButton Buscar,Ingresar,Eliminar,Imprimir,raiz;
	
    boolean listo;
    boolean existe;
    Raiz raizAux;
	Raiz datosRaiz; 
	Raiz graficoRaiz=new Raiz(2);
	public static void main(String[] args) {
	
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pantalla frame = new pantalla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public pantalla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 305);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("ArbolB Realizado por Herber Batres");
		setResizable(false);
		//setLocation(null);
		
		JLabel lblNewLabel = new JLabel("Habitos de bebidas en Guatemala");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(116, 11, 262, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cantidad de personas");
		lblNewLabel_1.setBounds(20, 35, 138, 26);
		contentPane.add(lblNewLabel_1);
		
		personastext = new JTextField();
		personastext.setBounds(185, 38, 96, 20);
		contentPane.add(personastext);
		personastext.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Departamento");
		lblNewLabel_2.setBounds(30, 74, 96, 14);
		contentPane.add(lblNewLabel_2);
		
		departamentotext = new JTextField();
		departamentotext.setBounds(185, 71, 96, 20);
		contentPane.add(departamentotext);
		departamentotext.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Clase de Bebida");
		lblNewLabel_3.setBounds(20, 115, 96, 14);
		contentPane.add(lblNewLabel_3);
		
		bebidatext = new JTextField();
		bebidatext.setBounds(185, 112, 96, 20);
		contentPane.add(bebidatext);
		bebidatext.setColumns(10);
		
		gradotext = new JTextField();
		gradotext.setBounds(377, 71, 123, 20);
		contentPane.add(gradotext);
		gradotext.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Grado");
		lblNewLabel_4.setBounds(409, 41, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		 Ingresar = new JButton("Ingresar"); 
		Ingresar.setBounds(10, 182, 89, 23);
		Ingresar.addActionListener(this);
		contentPane.add(Ingresar);
		
		 Eliminar = new JButton("Eliminar");
		Eliminar.setBounds(116, 182, 89, 23);
		Eliminar.addActionListener(this);
		contentPane.add(Eliminar);
		
		 Buscar = new JButton("Buscar");
		Buscar.setBounds(222, 182, 89, 23);
		Buscar.addActionListener(this);
		contentPane.add(Buscar);
		
		 Imprimir = new JButton("Imprimir");
		Imprimir.setBounds(337, 182, 89, 23);
		Imprimir.addActionListener(this);
		contentPane.add(Imprimir);
		
		 raiz = new JButton("Ingresar Grado");
		raiz.setBounds(373, 111, 127, 23);
		raiz.addActionListener(this);
		contentPane.add(raiz);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(Ingresar==e.getSource()) {
			int clave=Integer.parseInt(personastext.getText());
		    String depaString=departamentotext.getText();
			String bebidaString=bebidatext.getText();
			graficoRaiz.insertarNodo(clave, depaString, bebidaString);
			
			JOptionPane.showMessageDialog(null,"Se ingreso correctamente");
		}
		if(Eliminar==e.getSource()) {
			int clave=Integer.parseInt(personastext.getText());
		    String depaString=departamentotext.getText();
			String bebidaString=bebidatext.getText();
			graficoRaiz.eliminar(clave);
			JOptionPane.showMessageDialog(null,"Se elimino correctamente");
		}
		if(Buscar==e.getSource()) {
			int clave=Integer.parseInt(personastext.getText());
		    String depaString=departamentotext.getText();
			String bebidaString=bebidatext.getText();
			graficoRaiz.buscar(clave);
			JOptionPane.showMessageDialog(null,"Se busco correctamente");
		}
		if(Imprimir==e.getSource()) {
			
			
			verArbol();			
			JOptionPane.showMessageDialog(null,"Se busco correctamente");
		}
		if(raiz==e.getSource()) {
			int raiz=Integer.parseInt(gradotext.getText());
			//datosRaiz.raiz(raiz);
			Raiz comprovacion=new Raiz(raiz);
			JOptionPane.showMessageDialog(null,"Se ingreso correctamente");
		}
		
	}


	public void enviar(Raiz datosRaiz) {
		this.datosRaiz=datosRaiz;
		
	}
    public void verArbol() {
    }
}

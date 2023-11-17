package Arbol_binario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.border.EtchedBorder;

import ArbolB.Raiz;
import Bebida.arbol;

import nuevo.comprovacion;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.nio.channels.NonReadableChannelException;
import java.rmi.NoSuchObjectException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;

public class Ventana extends JFrame {

	private JPanel contentPane;
	private JTextField personas;
	private JTextField bebidacan;
	
	private Nodo raiz;
    boolean listo;
    boolean existe;
	Arbol convinacionArbol =new Arbol();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 546);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Habitos de bebidas en personas");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 21));
		lblNewLabel.setBounds(115, 0, 404, 65);
		contentPane.add(lblNewLabel);
		
		personas = new JTextField();
		personas.setFont(new Font("Consolas", Font.BOLD, 20));
		personas.setHorizontalAlignment(SwingConstants.CENTER);
		personas.setBounds(69, 102, 164, 45);
		contentPane.add(personas);
		personas.setColumns(10);
		
		bebidacan = new JTextField();
		bebidacan.setFont(new Font("Consolas", Font.BOLD, 20));
		bebidacan.setHorizontalAlignment(SwingConstants.CENTER);
		bebidacan.setBounds(305, 102, 245, 45);
		contentPane.add(bebidacan);
		bebidacan.setColumns(10);
		
		JLabel LabelPersonas = new JLabel("Promedio de personas");
		LabelPersonas.setForeground(Color.RED);
		LabelPersonas.setFont(new Font("Consolas", Font.BOLD, 15));
		LabelPersonas.setBounds(69, 72, 178, 34);
		contentPane.add(LabelPersonas);
		
		JLabel LblBebida = new JLabel("Bebida que Consumen");
		LblBebida.setForeground(Color.RED);
		LblBebida.setFont(new Font("Consolas", Font.BOLD, 15));
		LblBebida.setBounds(338, 76, 181, 14);
		contentPane.add(LblBebida);
		
		JButton BtlnIngresar = new JButton("Ingresar");
		BtlnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				  int clave=Integer.parseInt(personas.getText());
				  String depaString=bebidacan.getText();
				  convinacionArbol.insertar(clave, depaString);
				  JOptionPane.showMessageDialog(null,"Se ingreso correctamente");
				    personas.setText("");
				    bebidacan.setText("");  
 
			}
		});
		BtlnIngresar.setBounds(69, 219, 131, 65);
		contentPane.add(BtlnIngresar);
		
		JButton BtnImprimirAltura = new JButton("Imprimir Anchura");
		BtnImprimirAltura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convinacionArbol.alturaArbol();
				convinacionArbol.imprimirNivel();

			}
		});
		
		BtnImprimirAltura.setBounds(232, 219, 139, 65);
		contentPane.add(BtnImprimirAltura);
		
		JButton BtnSAlir = new JButton("Salir");
		BtnSAlir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Adios   ;)");
				 dispose();
			}
		});
		BtnSAlir.setBounds(413, 219, 150, 65);
		contentPane.add(BtnSAlir);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\usuario\\Downloads\\ggggg.jpg"));
		lblNewLabel_1.setBounds(364, 317, 250, 171);
		contentPane.add(lblNewLabel_1);
		
		JButton BtnBuscar = new JButton("Buscar bebida");
		BtnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int clave=Integer.parseInt(buscarDato.getText());
				  convinacionArbol.existe(clave);
				  boolean esta = convinacionArbol.existe(clave);
					
				  if(esta) {
					  JOptionPane.showMessageDialog(null,""
					  		+ convinacionArbol.imprimircantidad
					  		+ " es el promedio de personas que le gustan "+convinacionArbol.imrpimirbebidaString);  
				  }else {
					  JOptionPane.showMessageDialog(null,"promedio de personas no encontrada");
				}

				  
				  buscarDato.setText("");    
			}
		   
		});
		BtnBuscar.setBounds(96, 428, 137, 45);
		contentPane.add(BtnBuscar);
		
		buscarDato = new JTextField();
		buscarDato.setFont(new Font("Consolas", Font.PLAIN, 20));
		buscarDato.setBounds(52, 363, 235, 39);
		contentPane.add(buscarDato);
		buscarDato.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Ingrese la cantidad de personas");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(59, 338, 228, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setForeground(Color.RED);
		panel.setBounds(29, 58, 585, 97);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.MAGENTA);
		panel_1.setBounds(29, 202, 585, 104);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Opcinoes");
		lblNewLabel_3.setBounds(243, 172, 107, 19);
		contentPane.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Consolas", Font.BOLD, 16));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	}
	public static String texto="";
	private JTextField buscarDato;
}

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
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;

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
		setBounds(100, 100, 664, 526);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Habitos de bebidas en personas");
		lblNewLabel.setForeground(new Color(0, 255, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 21));
		lblNewLabel.setBounds(115, 0, 404, 34);
		contentPane.add(lblNewLabel);
		
		personas = new JTextField();
		personas.setForeground(Color.BLUE);
		personas.setFont(new Font("Consolas", Font.BOLD, 20));
		personas.setHorizontalAlignment(SwingConstants.CENTER);
		personas.setBounds(69, 102, 164, 45);
		contentPane.add(personas);
		personas.setColumns(10);
		
		bebidacan = new JTextField();
		bebidacan.setForeground(Color.BLUE);
		bebidacan.setFont(new Font("Consolas", Font.BOLD, 20));
		bebidacan.setHorizontalAlignment(SwingConstants.CENTER);
		bebidacan.setBounds(305, 102, 245, 45);
		contentPane.add(bebidacan);
		bebidacan.setColumns(10);
		
		JLabel LabelPersonas = new JLabel("Promedio de personas");
		LabelPersonas.setForeground(Color.MAGENTA);
		LabelPersonas.setFont(new Font("Consolas", Font.BOLD, 15));
		LabelPersonas.setBounds(69, 72, 178, 34);
		contentPane.add(LabelPersonas);
		
		JLabel LblBebida = new JLabel("Bebida que Consumen");
		LblBebida.setForeground(Color.MAGENTA);
		LblBebida.setFont(new Font("Consolas", Font.BOLD, 15));
		LblBebida.setBounds(338, 76, 181, 14);
		contentPane.add(LblBebida);
		
		//boton de ingresar
		JButton BtlnIngresar = new JButton("Ingresar Informacion");
		BtlnIngresar.setFont(new Font("Tahoma", Font.BOLD, 13));
		BtlnIngresar.setForeground(new Color(0, 0, 255));
		BtlnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				  int clave=Integer.parseInt(personas.getText()); //captura los datos de jtext a los guardar en clave
				  String depaString=bebidacan.getText(); //captura los datos de jtext y los guarda eb la variable de tipo string

					convinacionArbol.insertar(clave, depaString);//envia la informacion al metodo insertar  	  
				  
				    personas.setText(""); //borra los datos que se ingresaron
				    bebidacan.setText("");  
 
			}
		});
		BtlnIngresar.setBounds(50, 190, 183, 57);
		contentPane.add(BtlnIngresar);
		
		//boton de imprimir anchura
		JButton BtnImprimirAltura = new JButton("Imprimir Anchura");
		BtnImprimirAltura.setFont(new Font("Tahoma", Font.BOLD, 13));
		BtnImprimirAltura.setForeground(new Color(0, 0, 255));
		BtnImprimirAltura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				convinacionArbol.alturaArbol();// imprime la altura
				convinacionArbol.imprimirNivel();// imprime el nivel

			}
		});
		
		BtnImprimirAltura.setBounds(259, 190, 164, 57);
		contentPane.add(BtnImprimirAltura);
		
		JButton BtnSAlir = new JButton("Salir");
		BtnSAlir.setForeground(new Color(0, 0, 255));
		BtnSAlir.setFont(new Font("Tahoma", Font.BOLD, 14));
		BtnSAlir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Adios   ;)");
				 dispose();
			}
		});
		BtnSAlir.setBounds(455, 187, 164, 59);
		contentPane.add(BtnSAlir);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\usuario\\Desktop\\Ejericicios en Eclipse\\ExamenFinal_ArbolBinario\\20170717125823-beida.jpg"));
		lblNewLabel_1.setBounds(352, 263, 265, 206);
		contentPane.add(lblNewLabel_1);
		
		JButton BtnBuscar = new JButton("");
		BtnBuscar.setIcon(new ImageIcon("C:\\Users\\usuario\\Desktop\\Ejericicios en Eclipse\\ExamenFinal_ArbolBinario\\buscar icono.jpg"));
		BtnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int clave=Integer.parseInt(buscarDato.getText());
				  convinacionArbol.existe(clave);
				  
				  buscarDato.setText("");    
			}
		   
		});
		BtnBuscar.setBounds(85, 381, 137, 88);
		contentPane.add(BtnBuscar);
		
		buscarDato = new JTextField();
		buscarDato.setForeground(Color.BLUE);
		buscarDato.setHorizontalAlignment(SwingConstants.CENTER);
		buscarDato.setFont(new Font("Consolas", Font.BOLD, 20));
		buscarDato.setBounds(50, 331, 235, 39);
		contentPane.add(buscarDato);
		buscarDato.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Promedio");
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(57, 306, 228, 14);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)), "Ingreso de informacion", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(40, 46, 574, 112);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 255)), "Opciones para Buscar", TitledBorder.CENTER, TitledBorder.TOP, null, Color.BLUE));
		panel_1.setBounds(20, 288, 289, 190);
		contentPane.add(panel_1);
	}
	public static String texto="";
	private JTextField buscarDato;
}

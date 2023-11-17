package Arbol_binario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Bebida.arbol;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ImpresionQ extends JFrame {

	private JPanel contentPane;
	private Nodo raiz;
	String[] niveles;

	int cant;
    int altura;
	Nodo asNodo=new Nodo(); 
	Arbol ddArbol=new Arbol();

	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 564);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea TableroImpresion = new JTextArea();
		TableroImpresion.setRows(5);
		TableroImpresion.setEditable(false);
		TableroImpresion.setColumns(20);
		TableroImpresion.setCaretColor(Color.BLACK);
		TableroImpresion.setBackground(Color.WHITE);
		TableroImpresion.setBounds(38, 46, 720, 374);


		JLabel jLabel1 = new JLabel();
		jLabel1.setText("El arbol representado graficamente se observa de la siguiente manera: ");
		jLabel1.setForeground(Color.WHITE);
		jLabel1.setFont(new Font("Dialog", Font.BOLD, 18));
		jLabel1.setBackground(Color.WHITE);
		jLabel1.setBounds(85, 11, 627, 24);
		contentPane.add(jLabel1);
		
		JButton regresar = new JButton("Regresar");
		regresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
			}
		});

		regresar.setBounds(604, 431, 188, 47);
		contentPane.add(regresar);
		alturaArbol();
		imprimirNivel();
		nivel1 = new JTextField();
		nivel1.setBounds(48, 64, 703, 24);
		contentPane.add(nivel1);
		nivel1.setColumns(10);

		
		nivel2 = new JTextField();
		nivel2.setBounds(48, 113, 703, 30);
		contentPane.add(nivel2);
		nivel2.setColumns(10);
		
		nivel3 = new JTextField();
		nivel3.setBounds(48, 165, 704, 30);
		contentPane.add(nivel3);
		nivel3.setColumns(10);
		
		nivel4 = new JTextField();
		nivel4.setBounds(48, 215, 703, 30);
		contentPane.add(nivel4);
		nivel4.setColumns(10);
		
		nivel5 = new JTextField();
		nivel5.setBounds(48, 267, 703, 30);
		contentPane.add(nivel5);
		nivel5.setColumns(10);
		
		nivel6 = new JTextField();
		nivel6.setColumns(10);
		nivel6.setBounds(48, 318, 703, 30);
		contentPane.add(nivel6);
		
		nivel7 = new JTextField();
		nivel7.setColumns(10);
		nivel7.setBounds(48, 373, 703, 36);
		contentPane.add(nivel7);

		//ddArbol.alturaArbol();
		//ddArbol.imprimirNivel();
	}

	   public int alturaArbol() {
       	altura = 0;
       	alturaArbol(raiz, 0);
       	return altura;
   		}

   private void alturaArbol(Nodo ID, int nivel) {
   		if (ID != null) {
           alturaArbol(ID.getIzquierdo(), nivel + 1);
           if (nivel > altura) {
               altura = nivel;
           }
           alturaArbol(ID.getDerecho(), nivel + 1);
   		}
   		}

	
   public void imprimirNivel() {
   		niveles = new String[altura + 1];

   		imprimirNivel(raiz, 0);
   		for (int i = 0; i < niveles.length; i++) {
   		System.out.print("============== En nivel: " + i+" ===================\n");
   		
           System.out.println(niveles[i] );
         /*  if(i==1) {
       		nivel1.setText(niveles[i]);  
           }else if(i==2){
        	   nivel2.setText(niveles[i]);  
		}else if(i==3) {
			nivel3.setText(niveles[i]);  
		}*/
   		}
   		}

   public void imprimirNivel(Nodo ID, int nivel2) {
   		if (ID != null) {
           niveles[nivel2] = "\nCantidad de personas: "+ID.getCantidad()+
           		"\nClase de bebida: "+ID.getBebida()+
           		
           		"\n"+
           		((niveles[nivel2] != null) ? niveles[nivel2] : "\n");
           imprimirNivel(ID.getDerecho(), nivel2 + 1);
           imprimirNivel(ID.getIzquierdo(), nivel2 + 1);
   		}
   		}
	public Nodo getRaiz() {
		return raiz;
	}

	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}
	private javax.swing.JTextArea TableroImpresion;
	private JTextField nivel1;
	private JTextField nivel2;
	private JTextField nivel3;
	private JTextField nivel4;
	private JTextField nivel5;
	private JTextField nivel6;
	private JTextField nivel7;
}

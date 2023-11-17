package tablas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	// grupo de botones
	private JPanel Panel;
	ButtonGroup buttonGroup = new ButtonGroup();
	ButtonGroup pago = new ButtonGroup();
	
	//llamado a las clases
	Tren Tren =new Tren();
	viaje vieje=new viaje();
	Trayectoria Trayectoria =new Trayectoria();
	Factura Factura=new Factura();
	
	

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setSize(550, 570);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 579);
		Panel = new JPanel();
		Panel.setBackground(new Color(255, 255, 255));
		Panel.setForeground(new Color(192, 192, 192));
		Panel.setBorder(new LineBorder(new Color(0, 0, 0)));

		
		setContentPane(Panel);
		Panel.setLayout(null);
		

		
		JLabel lblNewLabel = new JLabel("Bienvenidos");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(158, 11, 233, 23);
		lblNewLabel.setFont(new Font("Wide Latin", Font.PLAIN, 22));
		Panel.add(lblNewLabel);
		
		JLabel ID_ = new JLabel("Tipo de Tren");
		ID_.setVerticalAlignment(SwingConstants.TOP);
		ID_.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		ID_.setBackground(new Color(0, 255, 0));
		ID_.setForeground(new Color(128, 255, 0));
		ID_.setBounds(57, 105, 159, 23);
		Panel.add(ID_);	
		

		
		JComboBox No_tren = new JComboBox();
		No_tren.setModel(new DefaultComboBoxModel(new String[] {"Orient Express", " Shinkansen", "Tren de las nubes", "Transiberiano", "Glacier Express", "Tren de la Costa Amalfitana", "The Ghan", "Eurostar"}));
		
		No_tren.setBounds(237, 100, 219, 29);
		
		Panel.add(No_tren);
		
		
		
		JLabel Asiento = new JLabel("Tipo de asiento");
		Asiento.setForeground(new Color(0, 255, 0));
		Asiento.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		Asiento.setBounds(44, 183, 184, 14);
		Panel.add(Asiento);
		
		
		JRadioButton Asiento_Estandar = new JRadioButton("Estandar");
		Asiento_Estandar.setBackground(new Color(255, 255, 255));
		Asiento_Estandar.setForeground(new Color(0, 0, 0));
		Asiento_Estandar.setFont(new Font("Tahoma", Font.BOLD, 11));
		Asiento_Estandar.setBounds(237, 179, 81, 23);
		Panel.add(Asiento_Estandar);
		
		JRadioButton Asiento_Premiun = new JRadioButton("Premiun");
		Asiento_Premiun.setForeground(new Color(0, 0, 0));
		Asiento_Premiun.setFont(new Font("Tahoma", Font.BOLD, 11));
		Asiento_Premiun.setBounds(334, 179, 88, 23);
		Panel.add(Asiento_Premiun);
		

		buttonGroup.add(Asiento_Estandar);
		buttonGroup.add(Asiento_Premiun);
		
		Asiento_Estandar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (Asiento_Estandar.isSelected()) {
		            buttonGroup.clearSelection();
		            Asiento_Estandar.setSelected(true);
		        }
		    }
		});

		Asiento_Premiun.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (Asiento_Premiun.isSelected()) {
		            buttonGroup.clearSelection();
		            Asiento_Premiun.setSelected(true);
		        }
		    }
		});
		
				
		JLabel Ruta = new JLabel("Ruta");
		Ruta.setForeground(new Color(0, 255, 0));
		Ruta.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		Ruta.setBounds(128, 236, 88, 14);
		Panel.add(Ruta);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"De Retalhuleu A Quetzaltenango", "De Champerico A San Carlos", "De San Carlos A San Sebastian", "De QuetzaltenangoA Guatemala"}));
		comboBox.setBounds(237, 232, 233, 22);
		Panel.add(comboBox);


		
		JLabel Pago = new JLabel("Tipo de Pago");
		Pago.setForeground(new Color(0, 255, 0));
		Pago.setFont(new Font("Wide Latin", Font.PLAIN, 14));
		Pago.setBounds(68, 297, 159, 29);
		Panel.add(Pago);
		
		JRadioButton Efectivo = new JRadioButton("Efectivo");
		Efectivo.setFont(new Font("Tahoma", Font.BOLD, 11));
		Efectivo.setBounds(237, 300, 71, 23);
		Panel.add(Efectivo);
		
		JRadioButton Tarjeta = new JRadioButton("Tarjeta");
		Tarjeta.setFont(new Font("Tahoma", Font.BOLD, 11));
		Tarjeta.setBounds(331, 300, 71, 23);
		Panel.add(Tarjeta);
		
		pago.add(Efectivo);
		pago.add(Tarjeta);
		
		Efectivo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (Efectivo.isSelected()) {
		            pago.clearSelection();
		            Efectivo.setSelected(true);
		        }
		    }
		});

		Tarjeta.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (Tarjeta.isSelected()) {
		            pago.clearSelection();
		            Tarjeta.setSelected(true);
		        }
		    }
		});		
		
		
		
		
		JButton ingreso = new JButton("Ingresar datos");
		ingreso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//string para usar
				String Asiento = null, Forma_Pago=null;
				
				if(Asiento_Estandar.isSelected()) {
					 Asiento=Asiento_Estandar.getText();
				}else if(Asiento_Premiun.isSelected()){
					 Asiento=Asiento_Premiun.getText();
				}
				if(Efectivo.isSelected()) {
					Forma_Pago=Efectivo.getText();
				}else if(Tarjeta.isSelected()) {
					Forma_Pago=Tarjeta.getText();
				}
				
				String Direccion = (String) comboBox.getSelectedItem();
				String Tren = (String) No_tren.getSelectedItem();
				JOptionPane.showMessageDialog(null,"Los datos son: \n Tren: "+Tren+"\nAsiento: "+Asiento
						+"\n Ruta: " +Direccion+"\n Pago en: "+Forma_Pago
						
						
						);
			}
		});
		
		//ingreso.setBackground(new Color(128, 128, 128));
		ingreso.setBounds(22, 455, 193, 50);
		ingreso.setFont(new Font("Wide Latin", Font.PLAIN, 12));
		Panel.add(ingreso);
		
		
		

				
				JButton Cancelar = new JButton("Cancelar ");
				Cancelar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						comboBox.setSelectedItem(0);
						No_tren.setSelectedItem(0);	
						if (Asiento_Estandar.isSelected() || Asiento_Premiun.isSelected() || Tarjeta.isSelected() ||Efectivo.isSelected()) {
				            buttonGroup.clearSelection();
				            pago.clearSelection();
				            
				        }
					JOptionPane.showMessageDialog(null,"Cancelado con Exito");
					}
					
				});
				Cancelar.setFont(new Font("Wide Latin", Font.PLAIN, 13));
				Cancelar.setBounds(225, 455, 154, 50);
				Panel.add(Cancelar);
				
				
				JButton Exit = new JButton("Salir");
				Exit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null,"Adios   ;)");
						 dispose();
					}
				});
				Exit.setFont(new Font("Wide Latin", Font.PLAIN, 11));
				Exit.setBounds(389, 456, 127, 50);
				Panel.add(Exit);
				
				JLabel Imagen = new JLabel("Imagen");
				Imagen.setIcon(new ImageIcon(Menu.class.getResource("/Imagen/FONDO.jpg")));
				Imagen.setBounds(0, -3, 563, 542);
				Panel.add(Imagen);
				

		
	}
}

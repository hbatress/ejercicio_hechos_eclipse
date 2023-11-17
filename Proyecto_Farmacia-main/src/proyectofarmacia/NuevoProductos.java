/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofarmacia;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
public class NuevoProductos extends javax.swing.JFrame {

     Conexion conectar=new Conexion();
   Connection ConectarBD=conectar.getConection();
   PreparedStatement Insertar=null;
   ResultSet rs;
   PreparedStatement Actualizar;
   Statement st;
    public NuevoProductos() {
        initComponents();
         VerDatosProductos();
         CargarDatosConbox(conMarca);
         CargarDatosLaboratorios(conLaboratorio);
        AutoCompleteDecorator.decorate(conMarca);
        AutoCompleteDecorator.decorate(conLaboratorio);
    }
   public void ActualizarProducto(){
    
    int Marca=1+conMarca.getSelectedIndex();
    int Laboratori=1+conLaboratorio.getSelectedIndex();
    
    System.out.println("El id es "+Marca+"  labor"+Laboratori);
   String FechaA=((JTextField)FechaDate.getDateEditor().getUiComponent()).getText();
    try {
        Actualizar=ConectarBD.prepareStatement("update Productos set Nombre='"+txtNombre.getText()+"',Descripcion="
                + "'"+txtDescripcion.getText()+"',FechaCaducidad='"+FechaA+"',Costo='"+txtCosto.getText()+"',precio='"+txtPrecio.getText()+
                "',Existencia='"+txtExistencia.getText()+"',idLaboratorio='"+Laboratori+"',idMarca='"+Marca+"'"
                        + " where idProductos='"+txtID.getText()+"'");
    int Contador=Actualizar.executeUpdate();
    if(Contador>0){
       // JOptionPane.showMessageDialog(null,"Datos Actualizados");
        VerDatosProductos();
        
    }else {
          JOptionPane.showMessageDialog(null,"No selecciono la fila");
    }
    
    } catch (Exception e) {
          JOptionPane.showMessageDialog(null,"error"+e.toString());
    }
}
  public void VerDatosProductos(){
    DefaultTableModel Modelo=new DefaultTableModel();
    Modelo.addColumn("idProductos");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Descripción");
    Modelo.addColumn("Fecha Caducidad");
    Modelo.addColumn("costo");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Existencia");
    Modelo.addColumn("NombreMarca");
    Modelo.addColumn("Laboratori");
   
    TablaProductos.setModel(Modelo);
    
    String Consulta="select p.idProductos,p.Nombre,p.Descripcion,p.FechaCaducidad,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre as Laboratorio\n" +
"from Productos p, Marca m, Laboratorio l \n" +
"where p.idMarca=m.idMarca and p.idLaboratorio=l.idLaboratorio order by p.idProductos desc";
    String Datos[]=new String[9];
    
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            Datos[0]=rs.getString(1);
            Datos[1]=rs.getString(2);
            Datos[2]=rs.getString(3);
            Datos[3]=rs.getString(4);
            Datos[4]=rs.getString(5);
            Datos[5]=rs.getString(6);
            Datos[6]=rs.getString(7);
            Datos[7]=rs.getString(8);
            Datos[8]=rs.getString(9);
            
          
            
            Modelo.addRow(Datos);
          
        }
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error"+ e.toString());
    }
}
    public void InsertarNuevoProducto(){
        String Consulta="INSERT INTO Productos(Nombre,Descripcion,FechaCaducidad,Costo,Precio,Existencia,idLaboratorio,idMarca)values(?,?,?,?,?,?,?,?)";
        String FechaA=((JTextField)FechaDate.getDateEditor().getUiComponent()).getText();
        int Laboratorio=1+conLaboratorio.getSelectedIndex();
        int Marca=1+conMarca.getSelectedIndex();
        int Existencia=0;
        
        try {
            Insertar=ConectarBD.prepareStatement(Consulta);
            Insertar.setString(1, txtNombre.getText());
            Insertar.setString(2, txtDescripcion.getText());
            Insertar.setString(3, FechaA);
            Insertar.setString(4, txtCosto.getText());
            Insertar.setString(5, txtPrecio.getText());
            Insertar.setInt(6, Existencia);
            Insertar.setInt(7, Laboratorio);
             Insertar.setInt(8, Marca);
            Insertar.executeUpdate();
           // JOptionPane.showMessageDialog(null,"Datos Agregados");
            Limpiar();
            VerDatosProductos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e.toString());
        }
        
    }

    
    public void Limpiar(){
    txtID.setText("");
    txtNombre.setText("");
    txtDescripcion.setText("");
    txtCosto.setText("");
    txtPrecio.setText("");
    conLaboratorio.setSelectedItem("");
    conMarca.setSelectedItem("");
    txtExistencia.setText("");
    
}
public void CargarDatosConbox(JComboBox marcas){
    DefaultComboBoxModel Datos=new DefaultComboBoxModel();
    
    marcas.setModel(Datos);
    String consulta="select NombreMarca\n" +
"from Marca";
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(consulta);
        while(rs.next()){
          marcas.addItem(rs.getString("NombreMarca"));
            
        }
    } catch (Exception e) {
    }
   
    
    
}
public void CargarDatosLaboratorios(JComboBox Laboratorio){
    DefaultComboBoxModel Labor=new DefaultComboBoxModel();
    Laboratorio.setModel(Labor);
    String consulta="SELECT Nombre from Laboratorio";
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(consulta);
        while(rs.next()){
            Laboratorio.addItem(rs.getString("Nombre"));
        }
    } catch (Exception e) {
    }
    
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        NuevoProductoBo = new javax.swing.JButton();
        ActualizarBoton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        conLaboratorio = new javax.swing.JComboBox<>();
        conMarca = new javax.swing.JComboBox<>();
        txtExistencia = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        FechaDate = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(110, 207, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NuevoProductoBo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NuevoProductoBo.setForeground(new java.awt.Color(0, 0, 0));
        NuevoProductoBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar_1.png"))); // NOI18N
        NuevoProductoBo.setText("REGISTRAR PRODUCTO");
        NuevoProductoBo.setContentAreaFilled(false);
        NuevoProductoBo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NuevoProductoBo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        NuevoProductoBo.setIconTextGap(15);
        NuevoProductoBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoProductoBoActionPerformed(evt);
            }
        });
        jPanel2.add(NuevoProductoBo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 260, 60));

        ActualizarBoton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ActualizarBoton.setForeground(new java.awt.Color(0, 0, 0));
        ActualizarBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Actualizar (2).png"))); // NOI18N
        ActualizarBoton.setText("ACTUALIZAR  PRODUCTO");
        ActualizarBoton.setContentAreaFilled(false);
        ActualizarBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ActualizarBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ActualizarBoton.setIconTextGap(15);
        ActualizarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBotonActionPerformed(evt);
            }
        });
        jPanel2.add(ActualizarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 280, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 43));

        txtID.setEnabled(false);
        jPanel2.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 126, 43));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 126, 43));
        jPanel2.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 126, 43));

        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });
        jPanel2.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 126, 43));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Precio");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 80, 43));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Existencia");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 80, 43));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Marca");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 80, 43));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Laboratorio");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 80, 43));

        conLaboratorio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(conLaboratorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 130, 43));

        conMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        conMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conMarcaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conMarcaMouseEntered(evt);
            }
        });
        conMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conMarcaActionPerformed(evt);
            }
        });
        conMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                conMarcaKeyReleased(evt);
            }
        });
        jPanel2.add(conMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 130, 43));

        txtExistencia.setEditable(false);
        jPanel2.add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 126, 43));

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel2.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 126, 43));

        FechaDate.setDateFormatString("yyy-MM-dd");
        jPanel2.add(FechaDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 130, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 43));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Descripcion");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 90, 43));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Fecha Caducidad");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 110, 43));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Costo");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 43));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconG/Agregar.png"))); // NOI18N
        jButton1.setText("AGREGAR MARCA");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 220, 70));

        txtBuscar.setBorder(javax.swing.BorderFactory.createTitledBorder("BUSCAR PRODUCTO"));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 190, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salida.png"))); // NOI18N
        jLabel10.setText("REGRESAR");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 320));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(0, 0, 0))); // NOI18N

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TablaProductos.setColorBackgoundHead(new java.awt.Color(51, 102, 255));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaProductos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoProductoBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoProductoBoActionPerformed
         int costoc=Integer.parseInt(txtCosto.getText());
            int Precio=Integer.parseInt(txtPrecio.getText());
        
        if(txtNombre.getText().trim().isEmpty()||txtDescripcion.getText().trim().isEmpty()||txtCosto.getText().trim().isEmpty()||txtPrecio.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"LLENAR CAMPOS OBLIGATORIOS","ERROR",JOptionPane.YES_NO_OPTION);
        }else{
          
            if(Precio>0){
            if(costoc>0){
                InsertarNuevoProducto();
            } else{
                 JOptionPane.showMessageDialog(null, "COSTO NO PUEDE SER 0");
               
            }
        
            }else{
                JOptionPane.showMessageDialog(null, "PRECIO NO PUEDE SER 0");
            }
        }
    }//GEN-LAST:event_NuevoProductoBoActionPerformed

    private void ActualizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBotonActionPerformed
        ActualizarProducto();
    }//GEN-LAST:event_ActualizarBotonActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        char v=evt.getKeyChar();
         if((v<'0'||v>'9')&&(v<'.'||v>'.'))evt.consume();
    }//GEN-LAST:event_txtCostoKeyTyped

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        NuevoProductoBo.setEnabled(true);
        ActualizarBoton.setEnabled(false);
        Limpiar();
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Marca marca=new Marca();
        marca.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void conMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conMarcaMouseClicked
        CargarDatosConbox(conMarca);
    }//GEN-LAST:event_conMarcaMouseClicked

    private void conMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conMarcaKeyReleased
        CargarDatosConbox(conMarca);
    }//GEN-LAST:event_conMarcaKeyReleased

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
               ActualizarBoton.setEnabled(true);
        NuevoProductoBo.setEnabled(false);

        
      
        
        int fila=this.TablaProductos.getSelectedRow();
        this.txtID.setText(this.TablaProductos.getValueAt(fila, 0).toString());
        this.txtNombre.setText(this.TablaProductos.getValueAt(fila, 1).toString());
        this.txtDescripcion.setText(this.TablaProductos.getValueAt(fila, 2).toString());
        this.FechaDate.setDateFormatString(this.TablaProductos.getValueAt(fila, 3).toString());
        this.txtCosto.setText(this.TablaProductos.getValueAt(fila, 4).toString());
        this.txtPrecio.setText(this.TablaProductos.getValueAt(fila, 5).toString());
        this.txtExistencia.setText(this.TablaProductos.getValueAt(fila, 6).toString());
        this.conMarca.setSelectedItem(this.TablaProductos.getValueAt(fila, 7).toString());
        this.conLaboratorio.setSelectedItem(this.TablaProductos.getValueAt(fila, 8).toString());
       
    }//GEN-LAST:event_TablaProductosMouseClicked

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        BuscarProductos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
      char v=evt.getKeyChar();

        if((v<'a'||v>'z')&&(v<'A'||v>'Z')&&(v<' '||v>' '))evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
      char v=evt.getKeyChar();
      if((v<'0'||v>'9')&&(v<'.'||v>'.'))evt.consume();
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyReleased

    private void conMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conMarcaActionPerformed
        CargarDatosConbox(conMarca);
    }//GEN-LAST:event_conMarcaActionPerformed

    private void conMarcaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conMarcaMouseEntered
        CargarDatosConbox(conMarca);
    }//GEN-LAST:event_conMarcaMouseEntered

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NuevoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoProductos().setVisible(true);
            }
        });
    }
public void BuscarProductos(String Buscar){
    DefaultTableModel Modelo=new DefaultTableModel();
    Modelo.addColumn("idProductos");
    Modelo.addColumn("Nombre");
    Modelo.addColumn("Descripción");
    Modelo.addColumn("Fecha Caducidad");
    Modelo.addColumn("costo");
    Modelo.addColumn("Precio");
    Modelo.addColumn("Existencia");
    Modelo.addColumn("NombreMarca");
    Modelo.addColumn("Laboratori");
   
    TablaProductos.setModel(Modelo);
    
    String Consulta="Select p.idProductos,p.Nombre,p.Descripcion,p.FechaCaducidad,p.Costo,p.Precio,p.Existencia,m.NombreMarca,l.Nombre \n" +
"from Productos p\n" +
"join Marca m on p.idMarca=m.idMarca\n" +
"join Laboratorio l on p.idLaboratorio=l.idLaboratorio\n" +
"where p.idProductos like '%"+Buscar+"%' or p.Nombre like'%"+Buscar+"%' or p.Descripcion like'%"+Buscar+"%' or p.Precio like'%"+Buscar+"%'";
    String Datos[]=new String[9];
    
    try {
        st=ConectarBD.createStatement();
        rs=st.executeQuery(Consulta);
        while(rs.next()){
            Datos[0]=rs.getString(1);
            Datos[1]=rs.getString(2);
            Datos[2]=rs.getString(3);
            Datos[3]=rs.getString(4);
            Datos[4]=rs.getString(5);
            Datos[5]=rs.getString(6);
            Datos[6]=rs.getString(7);
            Datos[7]=rs.getString(8);
            Datos[8]=rs.getString(9);
            
            
         
            
            Modelo.addRow(Datos);
          
        }
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error"+ e.toString());
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBoton;
    private com.toedter.calendar.JDateChooser FechaDate;
    private javax.swing.JButton NuevoProductoBo;
    private rojerusan.RSTableMetro TablaProductos;
    private javax.swing.JComboBox<String> conLaboratorio;
    public static javax.swing.JComboBox<String> conMarca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

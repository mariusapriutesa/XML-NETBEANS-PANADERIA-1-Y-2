/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import clases.Producto;
import clases.XMLHandler;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author mariu
 */
public class Mainwindow extends javax.swing.JFrame {
    static CardLayout navegador;
    panelPrincipal   panelPrincipal;
    static panelBuscarProducto panelBuscarProducto;
    panelAlmacen panelAlmacen;
  //  panelUsuario panelUsuario
            
    public Mainwindow() {
        initComponents();
        
         navegador = (CardLayout) panelContenedor.getLayout();
        Producto producto = new Producto();
         panelAlmacen = new panelAlmacen();
        panelBuscarProducto= new  panelBuscarProducto();
       panelPrincipal = new panelPrincipal();
       
         panelContenedor.add(panelAlmacen, "pAlmacen");
        panelContenedor.add(panelBuscarProducto, "pBProducto");
        panelContenedor.add( panelPrincipal , "pPrincipal");
         navegacion("pPrincipal");
      //  btnBorrar.setVisible(false);
        //navegador = conte
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        contenedorPaneles = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txNomProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dobPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        intCantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        spFechaF = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        spFechaC = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txDescripcion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Gestion Almacen Alimentos");

        contenedorPaneles.setLayout(new java.awt.GridLayout(7, 2, 10, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID Producto");
        contenedorPaneles.add(jLabel1);

        txID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txIDActionPerformed(evt);
            }
        });
        contenedorPaneles.add(txID);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre Producto:");
        contenedorPaneles.add(jLabel2);
        contenedorPaneles.add(txNomProducto);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Precio(unidad):");
        contenedorPaneles.add(jLabel3);
        contenedorPaneles.add(dobPrecio);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Cantidad disponible:");
        contenedorPaneles.add(jLabel4);
        contenedorPaneles.add(intCantidad);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Fecha de Fabricacion:");
        contenedorPaneles.add(jLabel5);

        spFechaF.setModel(new javax.swing.SpinnerDateModel());
        contenedorPaneles.add(spFechaF);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha de Caducacion:");
        contenedorPaneles.add(jLabel6);

        spFechaC.setModel(new javax.swing.SpinnerDateModel());
        contenedorPaneles.add(spFechaC);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Descripcion :");
        contenedorPaneles.add(jLabel8);

        txDescripcion.setColumns(20);
        txDescripcion.setRows(5);
        jScrollPane1.setViewportView(txDescripcion);

        contenedorPaneles.add(jScrollPane1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 5, 2, 10));

        jButton1.setText("Crear Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("STOCK DISPONIBLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("BUSCAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton5.setBackground(new java.awt.Color(255, 153, 153));
        jButton5.setText("CERRAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        btnBorrar.setBackground(new java.awt.Color(255, 51, 51));
        btnBorrar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(102, 0, 0));
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(contenedorPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPaneles, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //CrearProducto
      
       
         
 /*  producto.setId(txID.getText());
   producto.setNomProducto(txNomProducto.getText());     
   producto.setPrecio(Double.parseDouble(dobPrecio.getText()));//*************************************************************************************************
   producto.setCantidad(Integer.parseInt(intCantidad.getText()));
   producto.setFechaFabricacion(spFechaF.getValue().toString());
   producto.setFechaCad(spFechaC.getValue().toString());
   producto.setDescripcion(txDescripcion.getText());
        Validar1(producto);
   boolean productoEncontrado = XMLHandler.modificarProducto(producto);
        if (productoEncontrado) {
            JOptionPane.showMessageDialog(null, "El producto: " + producto.getNomProducto()+ " con el ID " + producto.getId() +" ha sido modificado correctamente");
            
        }
        else{
            
         XMLHandler.crearProducto(producto);
         JOptionPane.showMessageDialog(null, "El producto: " + producto.getNomProducto()+ " con el ID " + producto.getId() +" ha sido creado correctamente");
        
        }
   

        cargarProducto(new Producto());
        */  
    }//GEN-LAST:event_jButton1ActionPerformed

  
    /*public void Validar1(Producto producto){
        try {
            
        
        if(producto.getId().equals("")){
               JOptionPane.showMessageDialog(this, "Cuidado!!, no has introducido un valor para el id" + JOptionPane.ERROR_MESSAGE);
             
          
        }else if(producto.getNomProducto().equals(""))
        {
             JOptionPane.showMessageDialog(this, "Cuidado!!, no has introducido un valor para el nombre"+ JOptionPane.ERROR_MESSAGE);
              
        }else  if(producto.getNomProducto().matches(".*\\d.*")){
            
           JOptionPane.showMessageDialog(this, "El nombre del producto no debe contener numeros"+ JOptionPane.ERROR_MESSAGE);
            
        }
        
       
        } catch (Exception e) {
             JOptionPane.showMessageDialog(this, e.getMessage());
              
        }
        

    
}
      
    */
    
    
    
 /*    public void cargarProducto(Producto producto){
        if (!producto.getId().equals("")) {
            txID.setEnabled(false);
            btnBorrar.setVisible(true);
        }else{
        txID.setEnabled(true);
         //btnBorrar.setVisible(false);
        }
    txID.setText(producto.getId());
    txNomProducto.setText(producto.getNomProducto());
    dobPrecio.setText(String.valueOf(producto.getPrecio()));//***********************************************************************************************
    intCantidad.setText(String.valueOf(producto.getCantidad()));
    txDescripcion.setText(producto.getDescripcion());*/
    }
    
    
    
    
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//Stock Disponible 
        vistaAlmacen vAlmacen=new vistaAlmacen(this,true);
         vAlmacen.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
vistaBuscarProducto vbuscar = new vistaBuscarProducto(this, true);
vbuscar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
//button borrar
  /*   boolean productoBorrado=   XMLHandler.borrarProducto(txID.getText());
        if (productoBorrado) {
            JOptionPane.showMessageDialog(null, "El producto ha sido borrado correctamente");
        }else{
        
        JOptionPane.showMessageDialog(null, "El producto no ha sido encontrado/O no ne pudo borrar ese producto ");
        }

        cargarProducto(new Producto());*/
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //cerrar MainWindow
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txIDActionPerformed

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
            java.util.logging.Logger.getLogger(Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainwindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JPanel contenedorPaneles;
    private javax.swing.JTextField dobPrecio;
    private javax.swing.JTextField intCantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spFechaC;
    private javax.swing.JSpinner spFechaF;
    private javax.swing.JTextArea txDescripcion;
    private javax.swing.JTextField txID;
    private javax.swing.JTextField txNomProducto;
    // End of variables declaration//GEN-END:variables

    private void navegacion(String pPrincipal) {
         navegador.show(panelContenedor,pPrincipal);
    }
}

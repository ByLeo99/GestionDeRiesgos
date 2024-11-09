/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buscador;

import static buscador.BUSCAR_CLIENTE.columna;
import static buscador.BUSCAR_CLIENTE.fila;
import java.awt.event.MouseAdapter;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.SwingConstants.TOP;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class ELIMINAR_PEDIDO extends javax.swing.JFrame {
    
    DefaultTableModel tabla;
    String nombre="";
    String dni="";

    public void setNombre(Object[] datos) {
       area_texto_DNI_cliente.setText(String.valueOf(datos[0]));
       area_texto_NOMBRE.setText(String.valueOf(datos[1]));
    }

    
    public static int columna,fila;
    conexion c=new conexion();
        Statement st;
        Connection conet;
        ResultSet rs;
         JButton boton1=new JButton("detalles");
        
    

    /**
     * Creates new form catalogo
     */
    public ELIMINAR_PEDIDO() {


       inicio();
       Double total=0.0;
        initComponents();
        setLocationRelativeTo(null);
        
        String[] id={"id","producto","precio","cantidad","total"};
    tabla=new DefaultTableModel();
    tabla_libros.setRowHeight(20);
    tabla_libros.addMouseListener(new MouseAdapter(){
    public void MousePresed(){
    
    }
    
    });
    tabla.setColumnIdentifiers(id);
    tabla_libros.setModel(tabla);


    }
void inicio(){
this.setTitle("nuevo pedido");
this.setResizable(false);

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_libros = new javax.swing.JTable();
        area_texto_cantidad = new javax.swing.JTextField();
        label_total = new javax.swing.JLabel();
        buscar_producto = new javax.swing.JToggleButton();
        registrar_pedido = new javax.swing.JButton();
        agregar_pedido4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        area_texto_NOMBRE = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        area_texto_DNI_cliente = new javax.swing.JTextField();
        area_texto_productos_nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        area_texto_producto = new javax.swing.JTextField();
        buscaR_CLIENTE1 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        area_texto_precio = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        area_texto_stock = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CANCELAR1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_libros.setAutoCreateRowSorter(true);
        tabla_libros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla_libros.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "dni", "CLIENTE", "DIRECCION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_libros.setToolTipText("");
        tabla_libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_librosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabla_librosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_libros);
        if (tabla_libros.getColumnModel().getColumnCount() > 0) {
            tabla_libros.getColumnModel().getColumn(0).setResizable(false);
            tabla_libros.getColumnModel().getColumn(1).setResizable(false);
            tabla_libros.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 600, 190));

        area_texto_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_texto_cantidadActionPerformed(evt);
            }
        });
        jPanel2.add(area_texto_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 80, 38));

        label_total.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        label_total.setText("0.0");
        jPanel2.add(label_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 90, -1, -1));

        buscar_producto.setBackground(new java.awt.Color(0, 204, 204));
        buscar_producto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar_producto.setForeground(new java.awt.Color(255, 255, 255));
        buscar_producto.setText("BUSCAR ");
        buscar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_productoActionPerformed(evt);
            }
        });
        jPanel2.add(buscar_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 160, 37));

        registrar_pedido.setBackground(new java.awt.Color(0, 204, 204));
        registrar_pedido.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        registrar_pedido.setForeground(new java.awt.Color(255, 255, 255));
        registrar_pedido.setText("REGISRTAR PEDIDO");
        registrar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_pedidoActionPerformed(evt);
            }
        });
        jPanel2.add(registrar_pedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 180, 40));

        agregar_pedido4.setBackground(new java.awt.Color(0, 204, 204));
        agregar_pedido4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        agregar_pedido4.setForeground(new java.awt.Color(255, 255, 255));
        agregar_pedido4.setText("AÑADIR");
        agregar_pedido4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_pedido4ActionPerformed(evt);
            }
        });
        jPanel2.add(agregar_pedido4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 100, 40));

        jLabel3.setText("CANTIDAD");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        area_texto_NOMBRE.setEditable(false);
        area_texto_NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_texto_NOMBREActionPerformed(evt);
            }
        });
        jPanel2.add(area_texto_NOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 210, 38));

        jLabel4.setText("total_pedido");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 60, -1, -1));

        id.setText("jLabel5");
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, -1, 20));

        area_texto_DNI_cliente.setEditable(false);
        area_texto_DNI_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_texto_DNI_clienteActionPerformed(evt);
            }
        });
        jPanel2.add(area_texto_DNI_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 170, 38));

        area_texto_productos_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_texto_productos_nombreActionPerformed(evt);
            }
        });
        jPanel2.add(area_texto_productos_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 170, 38));

        jLabel6.setText("DATOS DEL CLIENTE");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        area_texto_producto.setEditable(false);
        area_texto_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_texto_productoActionPerformed(evt);
            }
        });
        jPanel2.add(area_texto_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 170, 38));

        buscaR_CLIENTE1.setBackground(new java.awt.Color(0, 204, 204));
        buscaR_CLIENTE1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscaR_CLIENTE1.setForeground(new java.awt.Color(255, 255, 255));
        buscaR_CLIENTE1.setText("BUSCAR CLIENTE");
        buscaR_CLIENTE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaR_CLIENTE1ActionPerformed(evt);
            }
        });
        jPanel2.add(buscaR_CLIENTE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 160, 37));

        jLabel7.setText("DATOS DEL PRODUCTO");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel8.setText("PRODUCTO");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        area_texto_precio.setEditable(false);
        area_texto_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_texto_precioActionPerformed(evt);
            }
        });
        jPanel2.add(area_texto_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 80, 38));

        jLabel9.setText("PRECIO");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, -1, -1));

        area_texto_stock.setEditable(false);
        area_texto_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                area_texto_stockActionPerformed(evt);
            }
        });
        jPanel2.add(area_texto_stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 80, 38));

        jLabel10.setText("STOCK");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        CANCELAR1.setBackground(new java.awt.Color(0, 204, 204));
        CANCELAR1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        CANCELAR1.setForeground(new java.awt.Color(255, 255, 255));
        CANCELAR1.setText("CANCELAR");
        CANCELAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELAR1ActionPerformed(evt);
            }
        });
        jPanel2.add(CANCELAR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("ELIMINAR PEDIDO");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void area_texto_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_texto_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_area_texto_cantidadActionPerformed

    private void buscar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_productoActionPerformed
        String b_producto=area_texto_productos_nombre.getText();
         String sql="SELECT `id`, `nombre`, `precio`, `stock` FROM `productos` WHERE nombre like '"+b_producto+"';";
         area_texto_cantidad.setText("");
         consultar_productos(sql);
        
    }//GEN-LAST:event_buscar_productoActionPerformed

    private void registrar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_pedidoActionPerformed
       
       area_texto_cantidad.setText("");
      

    }//GEN-LAST:event_registrar_pedidoActionPerformed

   
    
    private void tabla_librosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_librosMouseClicked


        
    }//GEN-LAST:event_tabla_librosMouseClicked

    private void agregar_pedido4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_pedido4ActionPerformed
       Object[] g=new Object[5];
       g[0]=id.getText();
       g[1]=area_texto_producto.getText();
       g[2]=Double.parseDouble(area_texto_precio.getText());
       g[3]=Double.parseDouble(area_texto_cantidad.getText());
       Double n1=(Double) g[2];
       Double n2=(Double) g[3];
       g[4]=n1*n2;
       tabla.addRow(g);
       tabla_libros.setModel(tabla);
       label_total.setText(total());
        
        
        
    }//GEN-LAST:event_agregar_pedido4ActionPerformed
    public String total(){
        Double total=0.0;
         
        for(int i=0;tabla_libros.getRowCount()>i;i++){
          Object valor = tabla.getValueAt(i, 4);
          Double c=Double.parseDouble(valor.toString());
          total=total+c;
        }
        return total.toString();
    }

    private void area_texto_NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_texto_NOMBREActionPerformed
    }//GEN-LAST:event_area_texto_NOMBREActionPerformed

    private void area_texto_DNI_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_texto_DNI_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_area_texto_DNI_clienteActionPerformed

    private void area_texto_productos_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_texto_productos_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_area_texto_productos_nombreActionPerformed

    private void area_texto_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_texto_productoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_area_texto_productoActionPerformed

    private void buscaR_CLIENTE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaR_CLIENTE1ActionPerformed
        BUSCAR_CLIENTE BC=new BUSCAR_CLIENTE();
        BC.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_buscaR_CLIENTE1ActionPerformed

    private void area_texto_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_texto_precioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_area_texto_precioActionPerformed

    private void area_texto_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_area_texto_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_area_texto_stockActionPerformed

    private void CANCELAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELAR1ActionPerformed
        index np=new index();
        np.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_CANCELAR1ActionPerformed

    private void tabla_librosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_librosMousePressed
         fila=evt.getY()/tabla_libros.getRowHeight();
        if(columna<=tabla_libros.getColumnCount()&&columna>=0 &&fila<=tabla_libros.getRowCount()&&fila>=0){
            JOptionPane.showMessageDialog(null, "presiona");
            Object objet=tabla_libros.getValueAt(fila, 1);
        }
    }//GEN-LAST:event_tabla_librosMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
        
        
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ELIMINAR_PEDIDO().setVisible(true);
            }
        });
    }
 
    
    
     void consultar_productos(String sql) {
    try {
        conet=c.getConexion();
        st=conet.createStatement();
       
        rs=st.executeQuery(sql);
        Object[]f=new Object[3];
        while (rs.next()) {  
        f[0]=rs.getString("nombre");
        f[1]=rs.getString("precio");
        f[2]=rs.getString("stock");
    }
        
        if(f[0]==null){
            JOptionPane.showMessageDialog(null, "no hay resultados");
            area_texto_cantidad.setText("");
         
        } else {
       
            area_texto_producto.setText((String) f[0]);
            area_texto_precio.setText((String) f[1]);
            area_texto_stock.setText((String) f[2]);
          
        }
        
  
    } catch (Exception e) {
    }
}
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CANCELAR1;
    private javax.swing.JButton agregar_pedido4;
    private javax.swing.JTextField area_texto_DNI_cliente;
    private javax.swing.JTextField area_texto_NOMBRE;
    private javax.swing.JTextField area_texto_cantidad;
    private javax.swing.JTextField area_texto_precio;
    private javax.swing.JTextField area_texto_producto;
    private javax.swing.JTextField area_texto_productos_nombre;
    private javax.swing.JTextField area_texto_stock;
    private javax.swing.JToggleButton buscaR_CLIENTE1;
    private javax.swing.JToggleButton buscar_producto;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_total;
    private javax.swing.JButton registrar_pedido;
    private javax.swing.JTable tabla_libros;
    // End of variables declaration//GEN-END:variables
}

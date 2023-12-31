
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author migue
 */
public class registrarTareas extends javax.swing.JFrame {
        conexionsql2 con = new conexionsql2();
        Connection cn = con.conectar();
   
    public registrarTareas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.txtParticipantes.removeAllItems();
        this.txtproyecto.removeAllItems();
        this.txtprioridad.removeAllItems();
        
        
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent=con.createStatement();
            ResultSet rs= Sent.executeQuery("select * from registro");
            
            
            while(rs.next()){
                this.txtproyecto.addItem(rs.getString("id_proyecto"));
                
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        lbl_proyecto = new javax.swing.JLabel();
        txtproyecto = new javax.swing.JComboBox<>();
        lbl_participante = new javax.swing.JLabel();
        txtParticipantes = new javax.swing.JComboBox<>();
        lbl_nombreTarea = new javax.swing.JLabel();
        txtnombretarea = new javax.swing.JTextField();
        lbl_objetivo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtobjetivo = new javax.swing.JTextArea();
        lbl_fechaInicio = new javax.swing.JLabel();
        txtfechainicio = new com.toedter.calendar.JDateChooser();
        lbl_fechatermino = new javax.swing.JLabel();
        txtfechatermino = new com.toedter.calendar.JDateChooser();
        lbl_prioridad = new javax.swing.JLabel();
        txtprioridad = new javax.swing.JComboBox<>();
        btnregistrar = new javax.swing.JButton();
        btnregresar = new javax.swing.JButton();
        txt_proyecto = new javax.swing.JTextField();
        txt_participantes = new javax.swing.JTextField();
        back10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_proyecto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_proyecto.setForeground(new java.awt.Color(240, 240, 240));
        lbl_proyecto.setText("PROYECTO:");
        getContentPane().add(lbl_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        txtproyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtproyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproyectoActionPerformed(evt);
            }
        });
        getContentPane().add(txtproyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 110, -1));

        lbl_participante.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_participante.setForeground(new java.awt.Color(240, 240, 240));
        lbl_participante.setText("PARTICIPANTES: ");
        getContentPane().add(lbl_participante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, -1, -1));

        txtParticipantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParticipantesActionPerformed(evt);
            }
        });
        getContentPane().add(txtParticipantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 110, -1));

        lbl_nombreTarea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_nombreTarea.setForeground(new java.awt.Color(240, 240, 240));
        lbl_nombreTarea.setText("NOMBRE DE LA TAREA:");
        getContentPane().add(lbl_nombreTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));
        getContentPane().add(txtnombretarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 200, -1));

        lbl_objetivo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_objetivo.setForeground(new java.awt.Color(240, 240, 240));
        lbl_objetivo.setText("OBJETIVO:");
        getContentPane().add(lbl_objetivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        txtobjetivo.setColumns(20);
        txtobjetivo.setRows(5);
        jScrollPane1.setViewportView(txtobjetivo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 200, -1));

        lbl_fechaInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fechaInicio.setForeground(new java.awt.Color(240, 240, 240));
        lbl_fechaInicio.setText("FECHA DE INICIO:");
        getContentPane().add(lbl_fechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        txtfechainicio.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txtfechainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 200, -1));

        lbl_fechatermino.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_fechatermino.setForeground(new java.awt.Color(240, 240, 240));
        lbl_fechatermino.setText("FECHA DE TERMINO:");
        getContentPane().add(lbl_fechatermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        txtfechatermino.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(txtfechatermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 200, -1));

        lbl_prioridad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_prioridad.setForeground(new java.awt.Color(240, 240, 240));
        lbl_prioridad.setText("PRIORIDAD:");
        getContentPane().add(lbl_prioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, -1));

        txtprioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        txtprioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprioridadActionPerformed(evt);
            }
        });
        getContentPane().add(txtprioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 120, -1));

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 150, 50));

        btnregresar.setText("REGRESAR");
        btnregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 150, 50));

        txt_proyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_proyectoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_proyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 130, -1));

        txt_participantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_participantesActionPerformed(evt);
            }
        });
        getContentPane().add(txt_participantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 130, -1));

        back10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/3a245d83eef7a69961c7f19540e972c1.jpg"))); // NOI18N
        getContentPane().add(back10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnregresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregresarActionPerformed
        // TODO add your handling code here:
        Menu men= new Menu();
        men.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnregresarActionPerformed

    private void txtproyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproyectoActionPerformed
        
        try{
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent1=con1.createStatement();
            ResultSet rs1= Sent1.executeQuery("select * from registro where id_proyecto= '"+this.txtproyecto.getSelectedItem()+"' ");
            rs1.next();
            this.txt_proyecto.setText(rs1.getString("nombreProyecto"));
            

            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        
        
    }//GEN-LAST:event_txtproyectoActionPerformed

    private void txtParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParticipantesActionPerformed
        // TODO add your handling code here:
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent=con.createStatement();
            ResultSet rs= Sent.executeQuery("select * from participantes");
            
            
            while(rs.next()){
                this.txtParticipantes.addItem(rs.getString("id_participantes"));
                
            }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","12345");
            Statement Sent=con1.createStatement();
            ResultSet rs1= Sent.executeQuery("select * from participantes where id_participantes= '"+this.txtParticipantes.getSelectedItem()+"' ");
            rs1.next();
            this.txt_participantes.setText(rs1.getString("nombre"));
            
            }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
    }              
        
    }//GEN-LAST:event_txtParticipantesActionPerformed

    private void txt_proyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_proyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_proyectoActionPerformed

    private void txt_participantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_participantesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_participantesActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        
        String proyecto = txtproyecto.getSelectedItem().toString();
        String participante = txtParticipantes.getSelectedItem().toString();
        String nombreTarea = txtnombretarea.getText();
        String objetivo = txtobjetivo.getText();
        String fechai = ((JTextField) txtfechainicio.getDateEditor().getUiComponent()).getText();
        String fechat = ((JTextField) txtfechatermino.getDateEditor().getUiComponent()).getText();
        String prioridad = txtprioridad.getSelectedItem().toString();
        
        regisTarea t = new regisTarea(proyecto, participante, nombreTarea, objetivo, Date.valueOf(fechai), Date.valueOf(fechat), prioridad);
        
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO tareas (id_proyecto, id_participantes, nombreTarea, objetivo, fechaInicio, fechaTermino, prioridad) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, proyecto);
            ps.setString(2, participante);
            ps.setString(3, nombreTarea);
            ps.setString(4, objetivo);
            ps.setDate(5, t.getFechaInicio());
            ps.setDate(6, t.getFechatermino());
            ps.setString(7, prioridad);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUEDE GUARDAR DATOS");
        }
        

        
        
        
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtprioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprioridadActionPerformed
        // TODO add your handling code here:
        txtprioridad.addItem("Alta");
        txtprioridad.addItem("Media");
        txtprioridad.addItem("Baja");
    }//GEN-LAST:event_txtprioridadActionPerformed

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
            java.util.logging.Logger.getLogger(registrarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new registrarTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back10;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnregresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_fechaInicio;
    private javax.swing.JLabel lbl_fechatermino;
    private javax.swing.JLabel lbl_nombreTarea;
    private javax.swing.JLabel lbl_objetivo;
    private javax.swing.JLabel lbl_participante;
    private javax.swing.JLabel lbl_prioridad;
    private javax.swing.JLabel lbl_proyecto;
    private javax.swing.JComboBox<String> txtParticipantes;
    private javax.swing.JTextField txt_participantes;
    private javax.swing.JTextField txt_proyecto;
    private com.toedter.calendar.JDateChooser txtfechainicio;
    private com.toedter.calendar.JDateChooser txtfechatermino;
    private javax.swing.JTextField txtnombretarea;
    private javax.swing.JTextArea txtobjetivo;
    private javax.swing.JComboBox<String> txtprioridad;
    private javax.swing.JComboBox<String> txtproyecto;
    // End of variables declaration//GEN-END:variables
}

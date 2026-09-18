
package vista;
import logica.GestionEstudiantes;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName());

    private logica.GestionEstudiantes gestionEstudiantes = new logica.GestionEstudiantes();
    private logica.SistemaDeshacer sistemaDeshacer = new logica.SistemaDeshacer();
    private logica.AtencionBanco atencionBanco = new logica.AtencionBanco();
    private logica.ControlAcceso controlAcceso = new logica.ControlAcceso();
    public VentanaPrincipal() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreEst = new javax.swing.JTextField();
        txtCodigoEst = new javax.swing.JTextField();
        btnAgregarEst = new javax.swing.JButton();
        btnEliminarEst = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaEstudiantes = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        comboTipoAccion = new javax.swing.JComboBox<>();
        txtDescripcionAcci = new javax.swing.JLabel();
        txtDescripcionAccion = new javax.swing.JTextField();
        btnRegistrarAccion = new javax.swing.JButton();
        btnDeshacer = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaAcciones = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        nom = new javax.swing.JLabel();
        chkPreferencial = new javax.swing.JCheckBox();
        btnAgregarCliente = new javax.swing.JButton();
        btnAtenderCliente = new javax.swing.JButton();
        l = new javax.swing.JScrollPane();
        areaBanco = new javax.swing.JTextArea();
        txtNombreCliente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombrePart = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDocumentoPart = new javax.swing.JTextField();
        btnRegistrarPart = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        areaParticipantes = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Nombre");

        jLabel5.setText("Codigo");

        txtCodigoEst.addActionListener(this::txtCodigoEstActionPerformed);

        btnAgregarEst.setText("AGREGAR");
        btnAgregarEst.addActionListener(this::btnAgregarEstActionPerformed);

        btnEliminarEst.setText("ELIMINAR");
        btnEliminarEst.addActionListener(this::btnEliminarEstActionPerformed);

        areaEstudiantes.setEditable(false);
        areaEstudiantes.setColumns(20);
        areaEstudiantes.setRows(5);
        jScrollPane1.setViewportView(areaEstudiantes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAgregarEst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarEst)
                        .addGap(128, 128, 128))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreEst)
                    .addComponent(txtCodigoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarEst)
                    .addComponent(btnAgregarEst))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombreEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCodigoEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("ESTUDIANTES", jPanel1);

        comboTipoAccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escribir", "Borrar", "Copiar", "Pegar" }));

        txtDescripcionAcci.setText("Descripcion");

        txtDescripcionAccion.addActionListener(this::txtDescripcionAccionActionPerformed);

        btnRegistrarAccion.setText("Registrar");
        btnRegistrarAccion.addActionListener(this::btnRegistrarAccionActionPerformed);

        btnDeshacer.setText("Deshacer");
        btnDeshacer.addActionListener(this::btnDeshacerActionPerformed);

        areaAcciones.setEditable(false);
        areaAcciones.setColumns(20);
        areaAcciones.setRows(5);
        jScrollPane2.setViewportView(areaAcciones);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(btnRegistrarAccion)
                                .addGap(27, 27, 27)
                                .addComponent(btnDeshacer)
                                .addGap(34, 34, 34))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(comboTipoAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtDescripcionAcci, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDescripcionAccion, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboTipoAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcionAcci)
                    .addComponent(txtDescripcionAccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeshacer)
                    .addComponent(btnRegistrarAccion))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("DESHACER", jPanel2);

        nom.setText("Nombre");

        chkPreferencial.setText("¿Es preferencial?");

        btnAgregarCliente.setText("Agregar a la fila");
        btnAgregarCliente.addActionListener(this::btnAgregarClienteActionPerformed);

        btnAtenderCliente.setText("Atender al siguiente");
        btnAtenderCliente.addActionListener(this::btnAtenderClienteActionPerformed);

        areaBanco.setColumns(20);
        areaBanco.setRows(5);
        l.setViewportView(areaBanco);

        txtNombreCliente.addActionListener(this::txtNombreClienteActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(nom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkPreferencial))
                    .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAgregarCliente)
                        .addGap(37, 37, 37)
                        .addComponent(btnAtenderCliente)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nom)
                    .addComponent(chkPreferencial)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarCliente)
                    .addComponent(btnAtenderCliente))
                .addGap(44, 44, 44)
                .addComponent(l, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("BANCO", jPanel3);

        jLabel1.setText("Nombre");

        txtNombrePart.addActionListener(this::txtNombrePartActionPerformed);

        jLabel2.setText("Documento");

        txtDocumentoPart.addActionListener(this::txtDocumentoPartActionPerformed);

        btnRegistrarPart.setText("Registrar");
        btnRegistrarPart.addActionListener(this::btnRegistrarPartActionPerformed);

        areaParticipantes.setEditable(false);
        areaParticipantes.setColumns(20);
        areaParticipantes.setRows(5);
        jScrollPane5.setViewportView(areaParticipantes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombrePart, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txtDocumentoPart)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btnRegistrarPart))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombrePart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDocumentoPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarPart)
                .addGap(26, 26, 26))
        );

        jTabbedPane3.addTab("EVENTO", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstActionPerformed
        String nombre = txtNombreEst.getText();
        String codigo = txtCodigoEst.getText();

        if (nombre.isEmpty() || codigo.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Completa nombre y código.");
            return;
        }

        modelo.Estudiante e = new modelo.Estudiante(nombre, codigo, java.time.LocalDate.now().toString());
        gestionEstudiantes.agregarEstudiante(e);

        areaEstudiantes.setText("");
        for (modelo.Estudiante est : gestionEstudiantes.getEstudiantes()) {
            areaEstudiantes.append(est.toString() + "\n");
        }

        txtNombreEst.setText("");
        txtCodigoEst.setText("");
    }//GEN-LAST:event_btnAgregarEstActionPerformed

    private void txtCodigoEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEstActionPerformed

    private void btnEliminarEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEstActionPerformed
 String nombre = txtNombreEst.getText();

if (nombre.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this, "Escribe el nombre del estudiante a eliminar.");
    return;
}

boolean eliminado = gestionEstudiantes.eliminarEstudiante(nombre);

if (!eliminado) {
    javax.swing.JOptionPane.showMessageDialog(this, "No se encontró un estudiante con ese nombre.");
}

areaEstudiantes.setText("");
for (modelo.Estudiante est : gestionEstudiantes.getEstudiantes()) {
    areaEstudiantes.append(est.toString() + "\n");
}

txtNombreEst.setText("");
    }//GEN-LAST:event_btnEliminarEstActionPerformed

    private void txtDescripcionAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionAccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionAccionActionPerformed

    private void btnDeshacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeshacerActionPerformed
    String resultado = sistemaDeshacer.deshacer();
    areaAcciones.append(resultado + "\n")
     ;    }//GEN-LAST:event_btnDeshacerActionPerformed

    private void btnRegistrarAccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAccionActionPerformed
String tipo = (String) comboTipoAccion.getSelectedItem();
String descripcion = txtDescripcionAccion.getText();

if (descripcion.isEmpty()) {
    javax.swing.JOptionPane.showMessageDialog(this, "Escribe una descripción para la acción.");
    return;
}

modelo.Accion accion = new modelo.Accion(tipo, descripcion);
sistemaDeshacer.registrarAccion(accion);

areaAcciones.append("Registrado: " + accion + "\n");
txtDescripcionAccion.setText("");    }//GEN-LAST:event_btnRegistrarAccionActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
    String nombre = txtNombreCliente.getText();

    if (nombre.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Escribe el nombre del cliente.");
        return;
    }

    modelo.Cliente cliente = new modelo.Cliente(nombre, chkPreferencial.isSelected());
    String resultado = atencionBanco.registrarCliente(cliente);

    areaBanco.append(resultado + "\n");
    txtNombreCliente.setText("");
    chkPreferencial.setSelected(false) ;
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnAtenderClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtenderClienteActionPerformed
        String resultado = atencionBanco.atenderCliente();
        areaBanco.append("--- " + resultado + " ---\n")
 ;    }//GEN-LAST:event_btnAtenderClienteActionPerformed

    private void txtNombrePartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePartActionPerformed

    private void txtDocumentoPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoPartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoPartActionPerformed

    private void btnRegistrarPartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPartActionPerformed
    String nombre = txtNombrePart.getText();
    String documento = txtDocumentoPart.getText();

    if (nombre.isEmpty() || documento.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "Completa nombre y documento.");
        return;
    }

    modelo.Participante p = new modelo.Participante(nombre, documento);
    String resultado = controlAcceso.registrarParticipante(p);

    areaParticipantes.setText("");
    for (modelo.Participante part : controlAcceso.getParticipantes()) {
        areaParticipantes.append(part.toString() + "\n");
    }

    javax.swing.JOptionPane.showMessageDialog(this, resultado);

    txtNombrePart.setText("");
    txtDocumentoPart.setText("")
        ;    }//GEN-LAST:event_btnRegistrarPartActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VentanaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaAcciones;
    private javax.swing.JTextArea areaBanco;
    private javax.swing.JTextArea areaEstudiantes;
    private javax.swing.JTextArea areaParticipantes;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnAgregarEst;
    private javax.swing.JButton btnAtenderCliente;
    private javax.swing.JButton btnDeshacer;
    private javax.swing.JButton btnEliminarEst;
    private javax.swing.JButton btnRegistrarAccion;
    private javax.swing.JButton btnRegistrarPart;
    private javax.swing.JCheckBox chkPreferencial;
    private javax.swing.JComboBox<String> comboTipoAccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane l;
    private javax.swing.JLabel nom;
    private javax.swing.JTextField txtCodigoEst;
    private javax.swing.JLabel txtDescripcionAcci;
    private javax.swing.JTextField txtDescripcionAccion;
    private javax.swing.JTextField txtDocumentoPart;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreEst;
    private javax.swing.JTextField txtNombrePart;
    // End of variables declaration//GEN-END:variables
}

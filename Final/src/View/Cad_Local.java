/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import javax.swing.JOptionPane;
/**
 *
 * @author duda2
 */
public class Cad_Local extends javax.swing.JFrame {

    /**
     * Creates new form Cad_Local
     */
    public Cad_Local() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLocal = new javax.swing.JPanel();
        spLocal = new javax.swing.JScrollPane();
        tbLocal = new javax.swing.JTable();
        btRemover = new javax.swing.JButton();
        pn_Cadastro = new java.awt.Panel();
        lbNome = new javax.swing.JLabel();
        lbDescricao = new javax.swing.JLabel();
        lbDescDetalhada = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtDescDetalhada = new javax.swing.JTextField();
        btIncluir = new javax.swing.JButton();
        lbTitulo = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("jfLocal"); // NOI18N

        pnLocal.setName("pn_local"); // NOI18N

        tbLocal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Descrição", "Descrição detalhada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbLocal.setName("tb_local"); // NOI18N
        spLocal.setViewportView(tbLocal);

        btRemover.setText("Remover");
        btRemover.setName("btRemover"); // NOI18N

        lbNome.setText("Nome:");
        lbNome.setToolTipText("");
        lbNome.setName("lbnome"); // NOI18N

        lbDescricao.setText("Descrição:");
        lbDescricao.setToolTipText("");
        lbDescricao.setName("lbdescricao"); // NOI18N

        lbDescDetalhada.setText("Descrição detalhada:");
        lbDescDetalhada.setToolTipText("");
        lbDescDetalhada.setName("lbdescricao"); // NOI18N

        txtNome.setName("txtnome"); // NOI18N

        txtDescricao.setName("txtDescricao");

        txtDescDetalhada.setName("txtdescricaodetalhada"); // NOI18N

        btIncluir.setText("Incluir");
        btIncluir.setName("btsalvar"); // NOI18N
        btIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btIncluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_CadastroLayout = new javax.swing.GroupLayout(pn_Cadastro);
        pn_Cadastro.setLayout(pn_CadastroLayout);
        pn_CadastroLayout.setHorizontalGroup(
            pn_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_CadastroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pn_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescricao)
                    .addComponent(lbDescDetalhada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNome)
                    .addComponent(txtDescricao)
                    .addComponent(txtDescDetalhada, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_CadastroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btIncluir)
                .addGap(269, 269, 269))
        );
        pn_CadastroLayout.setVerticalGroup(
            pn_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_CadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pn_CadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescDetalhada)
                    .addComponent(txtDescDetalhada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btIncluir)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        lbTitulo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 48)); // NOI18N
        lbTitulo.setText("Cadastro de Local");

        javax.swing.GroupLayout pnLocalLayout = new javax.swing.GroupLayout(pnLocal);
        pnLocal.setLayout(pnLocalLayout);
        pnLocalLayout.setHorizontalGroup(
            pnLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLocalLayout.createSequentialGroup()
                .addGroup(pnLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnLocalLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnLocalLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(pn_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnLocalLayout.createSequentialGroup()
                                .addGap(433, 433, 433)
                                .addComponent(btRemover))))
                    .addGroup(pnLocalLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnLocalLayout.setVerticalGroup(
            pnLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLocalLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(pn_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btRemover)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnLocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
        // TODO add your handling code here:
      VerificaCampo(); 
      
         
         
    }//GEN-LAST:event_btIncluirActionPerformed
 
    private String VerificaCampo(){
         String VerificaCampo = " " ; 
        
       if (txtNome.getText().equals("") || txtDescricao.getText().equals("") || 
          txtDescDetalhada.getText().equals("")){
           
         VerificaCampo = "Campos que precisam ser preenchidos:";
         
         if(txtNome.getText().equals("")){
             VerificaCampo +=  "\nCampo nome está vazio.";               
         }
         if(txtDescricao.getText().equals("")){
             VerificaCampo += "\nCampo descrição está vazio.";               
         }
         if(txtDescDetalhada.getText().equals("")){
             VerificaCampo += "\nCampo descrição detalhada está vazio.";               
         }
         
           JOptionPane.showMessageDialog(this,  VerificaCampo , "ERRO",  JOptionPane.ERROR_MESSAGE);
       }
       
        return VerificaCampo;
    }
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
            java.util.logging.Logger.getLogger(Cad_Local.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Local.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Local.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Local.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Local().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btIncluir;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel lbDescDetalhada;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbNome;
    private java.awt.Label lbTitulo;
    private javax.swing.JPanel pnLocal;
    private java.awt.Panel pn_Cadastro;
    private javax.swing.JScrollPane spLocal;
    private javax.swing.JTable tbLocal;
    private javax.swing.JTextField txtDescDetalhada;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}

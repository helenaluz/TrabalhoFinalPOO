/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author duda2
 */
public class Telas_Iniciais extends javax.swing.JFrame {

    /**
     * Creates new form Telas_Iniciais
     */
    public Telas_Iniciais() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        Barra_Opcoes = new javax.swing.JMenuBar();
        mn_cadastros = new javax.swing.JMenu();
        btLocal = new javax.swing.JMenuItem();
        btObra = new javax.swing.JMenuItem();
        btPersonagem = new javax.swing.JMenuItem();
        btTermo = new javax.swing.JMenuItem();
        btPesquisa = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnPrincipal.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                pnPrincipalHierarchyChanged(evt);
            }
        });

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        mn_cadastros.setText("Cadastros");
        mn_cadastros.setName("mn_Cadastros"); // NOI18N

        btLocal.setText("Local");
        btLocal.setName("btLocal"); // NOI18N
        btLocal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLocalMouseClicked(evt);
            }
        });
        btLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLocalActionPerformed(evt);
            }
        });
        mn_cadastros.add(btLocal);

        btObra.setText("Obra");
        btObra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btObraMouseClicked(evt);
            }
        });
        btObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btObraActionPerformed(evt);
            }
        });
        mn_cadastros.add(btObra);

        btPersonagem.setText("Personagem");
        btPersonagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btPersonagemMouseClicked(evt);
            }
        });
        btPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPersonagemActionPerformed(evt);
            }
        });
        mn_cadastros.add(btPersonagem);

        btTermo.setText("Termo");
        btTermo.setToolTipText("");
        btTermo.setName("Termo"); // NOI18N
        btTermo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btTermoMouseClicked(evt);
            }
        });
        btTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTermoActionPerformed(evt);
            }
        });
        mn_cadastros.add(btTermo);

        Barra_Opcoes.add(mn_cadastros);

        btPesquisa.setText("Pesquisa Avançada");
        btPesquisa.setToolTipText("");
        btPesquisa.setName("bt_Pesquisa"); // NOI18N
        btPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisaActionPerformed(evt);
            }
        });
        Barra_Opcoes.add(btPesquisa);

        setJMenuBar(Barra_Opcoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLocalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLocalMouseClicked
        Cad_Local local = new Cad_Local(); 
        local.setVisible(true);
    }//GEN-LAST:event_btLocalMouseClicked

    private void btObraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btObraMouseClicked
        Cad_Obra obra = new Cad_Obra(); 
        obra.setVisible(true);
    }//GEN-LAST:event_btObraMouseClicked

    private void btPersonagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btPersonagemMouseClicked
        Cad_Personagem personagem = new Cad_Personagem(); 
        personagem.setVisible(true);
    }//GEN-LAST:event_btPersonagemMouseClicked

    private void btTermoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btTermoMouseClicked
       Cad_Termo termo = new Cad_Termo(); 
       termo.setVisible(true);
    }//GEN-LAST:event_btTermoMouseClicked

    private void btLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLocalActionPerformed
        // TODO add your handling code here:
        Cad_Local local = new Cad_Local(); 
        local.setVisible(true);
    }//GEN-LAST:event_btLocalActionPerformed

    private void btObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btObraActionPerformed
        // TODO add your handling code here:
        Cad_Obra obra = new Cad_Obra(); 
        obra.setVisible(true);
    }//GEN-LAST:event_btObraActionPerformed

    private void pnPrincipalHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_pnPrincipalHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pnPrincipalHierarchyChanged

    private void btPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPersonagemActionPerformed
        // TODO add your handling code here:
         Cad_Personagem personagem = new Cad_Personagem(); 
        personagem.setVisible(true);
    }//GEN-LAST:event_btPersonagemActionPerformed

    private void btTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTermoActionPerformed
        // TODO add your handling code here:
       Cad_Termo termo = new Cad_Termo(); 
       termo.setVisible(true);
    }//GEN-LAST:event_btTermoActionPerformed

    private void btPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisaActionPerformed
        // TODO add your handling code here:
       Consulta_Pesquisa pesquisateste = new Consulta_Pesquisa(); 
       pesquisateste.setVisible(true);
    }//GEN-LAST:event_btPesquisaActionPerformed

    
  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telas_Iniciais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Barra_Opcoes;
    private javax.swing.JMenuItem btLocal;
    private javax.swing.JMenuItem btObra;
    private javax.swing.JMenuItem btPersonagem;
    private javax.swing.JMenu btPesquisa;
    private javax.swing.JMenuItem btTermo;
    private javax.swing.JMenu mn_cadastros;
    private javax.swing.JPanel pnPrincipal;
    // End of variables declaration//GEN-END:variables
}


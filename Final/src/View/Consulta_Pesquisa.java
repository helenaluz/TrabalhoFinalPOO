/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import model.Local;
import model.Obra;
import model.Personagem; 
import model.Termo; 
/**
 *
 * @author duda2
 */
public class Consulta_Pesquisa extends javax.swing.JFrame {

    /**
     * Creates new form Consulta_Pesquisa
     */
    public Consulta_Pesquisa() {
        initComponents();
    }
    
  Obra obra = new Obra();
    
    public void rbLocal(){   
       Local loca = new Local();
        String[] colunas = {"Nome", "Descrição", "Descrição Detalhada", "Obra"};
        String[][] teste = {{loca.getNome(), loca.getDescricao(), loca.getDescricaoHistoria()}};    
        DefaultTableModel Local = (new DefaultTableModel(teste, colunas){
            @Override
            public void addColumn(Object columnName) {
                super.addColumn(colunas);  
              }});
        tbPesquisa.setModel(Local);
    };
    
    public void rbObra(){
        Obra obra = new Obra();
        String[] colunas = {"Título", "Ano de Lançamento", "Categoria"};
        String[][] data = {{obra.getTitulo(), String.valueOf(obra.getAnoLancamento()), obra.getCategoria()}};
    
        DefaultTableModel Obra = (new DefaultTableModel(data, colunas){
            @Override
            public void addColumn(Object columnName) {
                super.addColumn(colunas);  
              }
        });
        tbPesquisa.setModel(Obra);
    };
    
    
      public void rbPersonagem(){
        Personagem persona = new Personagem();
        String[] colunas = {"Nome ", "Descrição ", "Características","Ator", "Feitos", "Obra"};
        String[][] data = {};
    
        DefaultTableModel Personagem = (new DefaultTableModel(data, colunas){
            @Override
            public void addColumn(Object columnName) {
                super.addColumn(colunas);  
              }
        });
        tbPesquisa.setModel(Personagem);
    };
         
      
    public void rbTermo(){
        Termo term = new Termo();
        String[] colunas = {"Nome ", "Descrição ", "Obra"};
        String[][] teste = {{term.getNome(), term.getDescricao()}};
    
        DefaultTableModel Termo = (new DefaultTableModel(teste, colunas){
            @Override
            public void addColumn(Object columnName) {
                super.addColumn(colunas);  
              }
        });
        tbPesquisa.setModel(Termo);
    };
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        rbLocal = new javax.swing.JRadioButton();
        rbObra = new javax.swing.JRadioButton();
        rbPersonagem = new javax.swing.JRadioButton();
        rbTermo = new javax.swing.JRadioButton();
        lbNome = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        lbDescricao = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        label1.setName("lbtitulo_pesquisa_consulta"); // NOI18N
        label1.setText("Pesquisa Avançada");

        jPanel1.setName("pn_pesquisar"); // NOI18N

        tbPesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbPesquisa.setColumnSelectionAllowed(true);
        tbPesquisa.setName("tbPesquisa");
        jScrollPane1.setViewportView(tbPesquisa);
        tbPesquisa.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        buttonGroup1.add(rbLocal);
        rbLocal.setText("Local");
        rbLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLocalActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbObra);
        rbObra.setText("Obra");
        rbObra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbObraActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbPersonagem);
        rbPersonagem.setText("Personagem");
        rbPersonagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPersonagemActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTermo);
        rbTermo.setText("Termo");
        rbTermo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTermoActionPerformed(evt);
            }
        });

        lbNome.setText("Nome:");

        jTextField1.setName("txtNome"); // NOI18N

        lbDescricao.setText("Descrição: ");

        jTextField2.setName("txtDescricao"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(rbLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbObra, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(rbPersonagem)
                                .addGap(42, 42, 42)
                                .addComponent(rbTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbDescricao))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                    .addComponent(jTextField1))))
                        .addGap(0, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {rbLocal, rbObra, rbPersonagem, rbTermo});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTermo)
                    .addComponent(rbObra)
                    .addComponent(rbLocal)
                    .addComponent(rbPersonagem))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNome)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescricao)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {rbLocal, rbObra, rbPersonagem, rbTermo});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLocalActionPerformed
        // TODO add your handling code here:
        rbLocal();
    }//GEN-LAST:event_rbLocalActionPerformed

    private void rbObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbObraActionPerformed
        // TODO add your handling code here:
        rbObra();       
    }//GEN-LAST:event_rbObraActionPerformed

    private void rbPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPersonagemActionPerformed
        // TODO add your handling code here:
        rbPersonagem();
    }//GEN-LAST:event_rbPersonagemActionPerformed

    private void rbTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTermoActionPerformed
        // TODO add your handling code here:
        rbTermo();
    }//GEN-LAST:event_rbTermoActionPerformed
  
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Pesquisa().setVisible(true);
            }
        }
        );
    }
  
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.Label label1;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbNome;
    private javax.swing.JRadioButton rbLocal;
    private javax.swing.JRadioButton rbObra;
    private javax.swing.JRadioButton rbPersonagem;
    private javax.swing.JRadioButton rbTermo;
    private javax.swing.JTable tbPesquisa;
    // End of variables declaration//GEN-END:variables
}

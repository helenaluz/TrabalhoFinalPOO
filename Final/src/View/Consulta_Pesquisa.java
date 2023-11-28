/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LocalController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.*;
import model.Local;
import model.Obra;
import model.Personagem;
import model.Termo;
import Controller.ObraController;
import Controller.PersonagemController;
import Controller.TermoController;
import static java.util.Locale.filter;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import model.Tabelas.LocalTableModel;
import javax.swing.table.TableRowSorter; 


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

    LocalController localController = new LocalController();
    ArrayList<Local> localList = localController.PegarTodoslocais();

    ObraController obraController = new ObraController();
    ArrayList<Obra> obralist = obraController.PegarTodasObras();

    PersonagemController personagemController = new PersonagemController();
    ArrayList<Personagem> personagemlist = personagemController.PegarTodospersonagens();
    
    TermoController termoController = new TermoController();
    ArrayList<Termo> termolist  = termoController.PegarTodosTermos();

    public void opcoesEscolhidas() {
     
        String termoPesquisa = txtCampoPesquisa.getText().trim().toLowerCase();
        
        if (rbLocal.isSelected()) {            
            LocalEscolhido();
            pesquisarLocal(termoPesquisa);
        } else if (rbObra.isSelected()) {
            ObraEscolhido();
            pesquisarObra(termoPesquisa);
        } else if (rbPersonagem.isSelected()) {
            PersonagemEscolhido();
            pesquisarPersonagem(termoPesquisa);
        } else if (rbTermo.isSelected()) {
            TermoEscolhido();
            pesquisarTermo(termoPesquisa);
        }

    }

    
    
    public void LocalEscolhido() {
        rbLocalescolhido();
        DefaultTableModel Local = (DefaultTableModel) tbPesquisa.getModel();
        for (Local dado : localList) {
            Local.addRow(new Object[]{dado.getNome(), dado.getDescricao(), dado.getDescricaoHistoria(), dado.getObras()});
        }
    }

    public void rbLocalescolhido() {
        Local local = new Local();
        String[] colunas = {"Nome", "Descrição", "Descrição Detalhada", "Obra"};
        String[][] data = {{local.getNome(), local.getDescricao(), local.getDescricaoHistoria()}};
        DefaultTableModel Local = (new DefaultTableModel(data, colunas) {
            @Override
            public void addColumn(Object columnName) {
                super.addColumn(colunas);
            }
        });
        tbPesquisa.setModel(Local);

    } ;
    
    public void ObraEscolhido() {
        rbObraEscolhido();
        DefaultTableModel Obra = (DefaultTableModel) tbPesquisa.getModel();
        for (Obra dado : obralist) {
            Obra.addRow(new Object[]{dado.getTitulo(), dado.getAnoLancamento(), dado.getCategoria()});
        }
    }; 
    
    
    
    
    public void rbObraEscolhido() {
        Obra obra = new Obra();
        String[] colunas = {"Título", "Ano de Lançamento", "Categoria"};
        String[][] data = {{obra.getTitulo(), String.valueOf(obra.getAnoLancamento()), obra.getCategoria()}};

        DefaultTableModel Obra = (new DefaultTableModel(data, colunas) {
            @Override
            public void addColumn(Object columnName) {
                super.addColumn(colunas);
            }
        });
        tbPesquisa.setModel(Obra);
    }

    ;
    
      
    public void PersonagemEscolhido() {
        rbPersonagem();
        DefaultTableModel Personagem = (DefaultTableModel) tbPesquisa.getModel();
        for (Personagem dado : personagemlist) {
            Personagem.addRow(new Object[]{dado.getNome(), dado.getDescricao(), dado.getObras(), dado.getCaracteristicas(), dado.getAtores(), dado.getFeitos()});
        }
    }

    ;   
    
      public void rbPersonagem() {
        Personagem persona = new Personagem();
        String[] colunas = {"Nome ", "Descrição ", "Características", "Ator", "Feitos", "Obra"};
        String[][] data = {};

        DefaultTableModel Personagem = (new DefaultTableModel(data, colunas) {
            @Override
            public void addColumn(Object columnName) {
                super.addColumn(colunas);
            }
        });
        tbPesquisa.setModel(Personagem);
    }

    ;
        
      
    public void TermoEscolhido() {
        rbTermo();
        DefaultTableModel Termo = (DefaultTableModel) tbPesquisa.getModel();
        for (Termo dado : personagemlist) {
            Termo.addRow(new Object[]{dado.getNome(), dado.getDescricao(), dado.getObras()});
        }
    }

    public void rbTermo() {
        Termo term = new Termo();
        String[] colunas = {"Nome ", "Descrição ", "Obra"};
        String[][] teste = {{term.getNome(), term.getDescricao()}};

        DefaultTableModel Termo = (new DefaultTableModel(teste, colunas) {
            @Override
            public void addColumn(Object columnName) {
                super.addColumn(colunas);
            }
        });
        tbPesquisa.setModel(Termo);
    }

    ;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        spConsulta = new javax.swing.JScrollPane();
        tbPesquisa = new javax.swing.JTable();
        rbLocal = new javax.swing.JRadioButton();
        rbObra = new javax.swing.JRadioButton();
        rbPersonagem = new javax.swing.JRadioButton();
        rbTermo = new javax.swing.JRadioButton();
        txtCampoPesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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
        spConsulta.setViewportView(tbPesquisa);
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

        txtCampoPesquisa.setName(" ");

        btPesquisar.setText("Pesquisar");
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rbLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbObra, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(rbPersonagem)
                        .addGap(42, 42, 42)
                        .addComponent(rbTermo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtCampoPesquisa)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btPesquisar)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPesquisar)
                .addGap(7, 7, 7)
                .addComponent(spConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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
                .addContainerGap(14, Short.MAX_VALUE))
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
        LocalEscolhido();
    }//GEN-LAST:event_rbLocalActionPerformed

    private void rbObraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbObraActionPerformed
        // TODO add your handling code here:
        ObraEscolhido();
    }//GEN-LAST:event_rbObraActionPerformed

    private void rbPersonagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPersonagemActionPerformed
        // TODO add your handling code here:
        PersonagemEscolhido();
    }//GEN-LAST:event_rbPersonagemActionPerformed

    private void rbTermoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTermoActionPerformed
        // TODO add your handling code here:
        TermoEscolhido();
    }//GEN-LAST:event_rbTermoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        // TODO add your handling code here:
        String termoPesquisa = txtCampoPesquisa.getText().trim().toLowerCase();        
        if(rbLocal.isSelected()){
        pesquisarLocal(termoPesquisa);}
    }//GEN-LAST:event_btPesquisarActionPerformed

    
    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Pesquisa().setVisible(true);
            }
        }
        );
    }
    
    private void pesquisarLocal(String termoPesquisa) {
  
        DefaultTableModel localModel = (DefaultTableModel) tbPesquisa.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(localModel);
        tbPesquisa.setRowSorter(sorter);    
        for (Local dado : localList) {
            if (dado.getNome().toLowerCase().contains(termoPesquisa) ||
                dado.getDescricao().toLowerCase().contains(termoPesquisa) ||
                dado.getDescricaoHistoria().toLowerCase().contains(termoPesquisa) ||
                dado.getObras().get(0).toString().contains(termoPesquisa)) {
                RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + termoPesquisa);
                 sorter.setRowFilter(rowFilter);
            }
        }
    }

    
    private void pesquisarObra(String termoPesquisa) {
  
        DefaultTableModel localModel = (DefaultTableModel) tbPesquisa.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(localModel);
        tbPesquisa.setRowSorter(sorter); 
        for (Obra dado : obralist) {
            if (dado.getTitulo().toLowerCase().contains(termoPesquisa) ||
                dado.getAnoLancamento().toLowerCase().contains(termoPesquisa) ||
                dado.getCategoria().toLowerCase().contains(termoPesquisa)               ) {
                RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + termoPesquisa);
                 sorter.setRowFilter(rowFilter);
            }
        }
    }
    
    private void pesquisarPersonagem(String termoPesquisa) {
        DefaultTableModel localModel = (DefaultTableModel) tbPesquisa.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(localModel);
        tbPesquisa.setRowSorter(sorter);
        for (Personagem  dado : personagemlist) {
            for (String ator : dado.getAtores()) {
                
            if (dado.getNome().toLowerCase().contains(termoPesquisa) ||
                dado.getDescricao().toLowerCase().contains(termoPesquisa) ||
                dado.getCaracteristicas().toLowerCase().contains(termoPesquisa) ||        
                dado.getAtores().get(0).toString().contains(termoPesquisa)|| 
                dado.getFeitos().toString().toLowerCase().contains(termoPesquisa)|| 
                dado.getObras().get(0).toString().contains(termoPesquisa)) {
                RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + termoPesquisa);
                 sorter.setRowFilter(rowFilter);
            }
        }
      }
    }
    
    private void pesquisarTermo(String termoPesquisa) {
        DefaultTableModel localModel = (DefaultTableModel) tbPesquisa.getModel();
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(localModel);
        tbPesquisa.setRowSorter(sorter);
        for (Termo  dado : termolist) {
            if (dado.getNome().toLowerCase().contains(termoPesquisa) ||
                dado.getDescricao().toLowerCase().contains(termoPesquisa) ||
                dado.getObras().get(0).toString().contains(termoPesquisa)) {
                RowFilter<DefaultTableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + termoPesquisa);
                 sorter.setRowFilter(rowFilter);
            }
        }
    
    }   

       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private javax.swing.JRadioButton rbLocal;
    private javax.swing.JRadioButton rbObra;
    private javax.swing.JRadioButton rbPersonagem;
    private javax.swing.JRadioButton rbTermo;
    private javax.swing.JScrollPane spConsulta;
    private javax.swing.JTable tbPesquisa;
    private javax.swing.JTextField txtCampoPesquisa;
    // End of variables declaration//GEN-END:variables
}
